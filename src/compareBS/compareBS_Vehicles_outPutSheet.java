package compareBS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Comparator;

public class compareBS_Vehicles_outPutSheet {
	private static int blank = 0;
	private static int noObj = 0;

	public static void GetVehicles(String env, String client, String envClientTextURL, String headers[],
			String vehiclesCodes[]) throws Exception {
		String VehicleSetCode = "";
		String LngCode = "";
		String CountryCode = "";
		String year = "";
		String makeId = "";
		String parameterString = "";
		String PostTextSavePathFile = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + env + "_Vehicles.xls";
		String[] titleStringGetMakeModelWS = { "S/N", "URL_parameter", "serverTime", "error", "executionTimeMS",
				"filtersDefinitionsObj","code", "trim", "year", "modelCode", "description", "model", "xxxxx",
				"make", "variation", "xxx", "Styleid" };

		Properties prop = new Properties();
		try {
			prop.load(compareBS_Vehicles_outPutSheet.class.getClassLoader()
					.getResourceAsStream("compareBS_data/compareBS_text.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		com_libs comlibs = new com_libs();

		String headerss = "";

		String envURL = envClientTextURL;// QA
		int count = 0;
		parameterString = VehicleSetCode + "/" + LngCode + "/" + CountryCode + "/" + year;
		int testDataTotal = vehiclesCodes.length;
		System.out.println(client + " - TestDataTotal = " + testDataTotal);
		parameterString = VehicleSetCode + "/" + LngCode + "/" + CountryCode + "/" + year;
		String getVehiclesURL = envURL;

		for (String vehiclesCode : vehiclesCodes) {
			count++;
			String jsonVehiclesWS = com_libs.getNewSourceCodeJsonGETvehicles(env, client, vehiclesCode, envURL,
					vehiclesCode, "vehicles", count, headers[0], headers[1], headers[2], headers[3]);

			GetVehiclesDetails(client, PostTextSavePathFile, titleStringGetMakeModelWS, jsonVehiclesWS, envURL,
					parameterString, count);

		}

//		count++;
//		String jsonTextFrGetVehiclesWS = com_libs.getNewSourceCodeJsonGETVehiclesToSheet(env, client, x"code", envURL, "", "",
//				count, headers[0], headers[1], headers[2], headers[3]);
//		String jsonTextFrGetVehiclesToSheetWS=jsonTextFrGetVehiclesWS;
//		
////		int equ=MyStrComparable.compare(jsonTextFrGetMakeModelWS,jsonTextFrGetMakeModelWScopy);
//
//		GetVehiclesDetails(client, PostTextSavePathFile, titleStringGetMakeModelWS, jsonTextFrGetVehiclesWS, envURL,
//				parameterString, count);

	}

	public static void PostTextDetails(String wsResultfile, String[] titleString, String text, String URLString,
			String parameterS, int countNum) throws IOException {
		com_libs.writeTitle(wsResultfile, titleString);
		String serverTime = "";
		String error = "";
		String executionTimeMS = "";
		String resultObj = "";
		String id = "";
		String make = "";
		String modelsObj = "";
		String modelYearId = "";
		String model = "";
		String[] temp = new String[30];
		if (text.equals("")) {
			blank++;
			temp[0] = Integer.toString(countNum);
			temp[1] = URLString;
			temp[2] = "";
			temp[3] = "404 error";
			System.out.println("S/N: " + countNum);
			System.out.println("404 ERROR ON : " + URLString);
			cPP.com_libs.writeToSheet(wsResultfile, temp);
		} else {
			try {
				JSONObject obj = new JSONObject(text);
				serverTime = obj.getString("serverTime");
				error = Boolean.toString(obj.getBoolean("error"));
				executionTimeMS = Long.toString(obj.getLong("executionTimeMS"));

				JSONArray result = obj.getJSONArray("result");
				int size = result.length();

				if (size == 0) {
					blank++;
					temp[0] = Integer.toString(countNum);
					temp[1] = URLString;
					temp[2] = "";
					temp[3] = "result [] object is blank";
					cPP.com_libs.writeToSheet(wsResultfile, temp);
					System.out.println("gvuid = " + "  " + " - Result [] object is blank. ");

				} else {
					for (int i = 0; i < size; i++) {
						try {
							id = result.getJSONObject(i).getString("id");
						} catch (Exception ex) {
							id = "null";
						}
						try {
							make = result.getJSONObject(i).getString("make");
						} catch (Exception ex) {
							make = "null";
						}

						JSONArray modelsObject = result.getJSONObject(i).getJSONArray("models");
						int modelsObjSize = modelsObject.length();
						modelsObj = Integer.toString(modelsObjSize);
						for (int j = 0; j < modelsObjSize; j++) {
							try {
								modelYearId = modelsObject.getJSONObject(j).getString("modelYearId");
							} catch (Exception ex) {
								modelYearId = "";
							}
							try {
								model = modelsObject.getJSONObject(j).getString("model");
							} catch (Exception ex) {
								model = "";
							}

							System.out.println("S/N: " + countNum);
							System.out.println("executionTimeMS: " + executionTimeMS);
							System.out.println("URLString: " + URLString);

							int wSize = titleString.length;
							String[] jsonValue = new String[wSize];

							jsonValue[0] = Integer.toString(countNum);
							jsonValue[1] = URLString;
							jsonValue[2] = serverTime;
							jsonValue[3] = error;
							jsonValue[4] = executionTimeMS;
							jsonValue[5] = Integer.toString(size);// result.toString();
							jsonValue[6] = id;
							jsonValue[7] = make;
							jsonValue[8] = modelsObj;// modelsObj.toString();
							jsonValue[9] = modelYearId;
							jsonValue[10] = model;
							cPP.com_libs.writeToSheet(wsResultfile, jsonValue);
						}
					}
				}
			} catch (Exception ex) {
				System.out.println("error occurs!");
				noObj++;
				temp[0] = Integer.toString(countNum);
				temp[1] = URLString;
				temp[2] = "";
				temp[3] = "200 error";
				System.out.println("S/N: " + countNum);
				System.out.println("ERROR 200 ON : " + URLString);
				cPP.com_libs.writeToSheet(wsResultfile, temp);
			}
		}
	}

	public static String readFile(String path) throws IOException {
		String sCurrentLine;
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			while ((sCurrentLine = br.readLine()) != null) {
				sb.append(sCurrentLine);
			}
		}
		return sb.toString();
	}

	public static void GetVehiclesDetails(String client, String wsResultfile, String[] titleString, String text,
			String URLString, String parameterS, int countNum) throws IOException {
		com_libs.writeTitle(wsResultfile, titleString);
		String serverTime = "";
		String error = "";
		String executionTimeMS = "";
		String resultObj = "";
		String code = "";
		String year = "";
		String make = "";
		String model = "";
		String trim = "";
		String modelCode = "";
		String description = "";
		String variation = "";

		String modelsObj = "";
		String modelYearId = "";

		String[] temp = new String[30];
		if (text.equals("")) {
			blank++;
			temp[0] = Integer.toString(countNum);
			temp[1] = URLString;
			temp[2] = "";
			temp[3] = "404 error";
			System.out.println("S/N: " + countNum);
			System.out.println("404 ERROR ON : " + URLString);
			cPP.com_libs.writeToSheet(wsResultfile, temp);
		} else {
			try {
				JSONObject obj = new JSONObject(text);
//				JSONObject filtersObj = obj.getString("filters");
//				error = Boolean.toString(obj.getBoolean("error"));
//				executionTimeMS = Long.toString(obj.getLong("executionTimeMS"));

				JSONArray result = obj.getJSONArray("vehicles");
				int size = result.length();

				if (size == 0) {
					blank++;
					temp[0] = Integer.toString(countNum);
					temp[1] = URLString;
					temp[2] = "";
					temp[3] = "result [] object is blank";
					cPP.com_libs.writeToSheet(wsResultfile, temp);
					System.out.println("gvuid = " + "  " + " - Result [] object is blank. ");

				} else {
					for (int i = 0; i < size; i++) {
						try {
							code = result.getJSONObject(i).getString("code");
						} catch (Exception ex) {
							code = "null";
						}
						try {
							year = result.getJSONObject(i).getString("year");
						} catch (Exception ex) {
							year = "null";
						}
						try {
							make = result.getJSONObject(i).getString("make");
						} catch (Exception ex) {
							make = "null";
						}
						try {
							model = result.getJSONObject(i).getString("model");
						} catch (Exception ex) {
							model = "null";
						}
//						
						try {
							trim = result.getJSONObject(i).getString("trim");
						} catch (Exception ex) {
							trim = "null";
						}

						try {
							modelCode = result.getJSONObject(i).getString("modelCode");
						} catch (Exception ex) {
							modelCode = "null";
						}

						try {
							description = result.getJSONObject(i).getString("description");
						} catch (Exception ex) {
							description = "null";
						}

						try {
							variation = result.getJSONObject(i).getString("variation");
						} catch (Exception ex) {
							variation = "null";
						}

						JSONArray segmentsObject = result.getJSONObject(i).getJSONArray("segments");
//						int modelsObjSize = modelsObject.length();
//						modelsObj = Integer.toString(modelsObjSize);
						for (int j = 0; j < 1; j++) {
//							try {
//								modelYearId = modelsObject.getJSONObject(j).getString("modelYearId");
//							} catch (Exception ex) {
//								modelYearId = "";
//							}
//							try {
//								model = modelsObject.getJSONObject(j).getString("model");
//							} catch (Exception ex) {
//								model = "";
//							}

							System.out.println("S/N: " + countNum);
							System.out.println("executionTimeMS: " + executionTimeMS);
							System.out.println("URLString: " + URLString);

							int wSize = titleString.length;
							String[] jsonValue = new String[wSize];

							jsonValue[0] = Integer.toString(countNum);
							jsonValue[1] = URLString;
							jsonValue[2] = serverTime;
							jsonValue[3] = error;
							jsonValue[4] = executionTimeMS;
							jsonValue[5] = Integer.toString(size);// result.toString();
							
							
							jsonValue[6] = code;
							jsonValue[7] = trim;
							jsonValue[8] = year; //modelsObj;// modelsObj.toString();
							jsonValue[9] = modelCode;
							jsonValue[10] = description;

							jsonValue[11] = model;
							jsonValue[12] = "";//(segmentsObject.length());
							jsonValue[13] = make;
							jsonValue[14] = variation;

							cPP.com_libs.writeToSheet(wsResultfile, jsonValue);
						}
					}
				}
			} catch (Exception ex) {
				System.out.println("error occurs!");
				noObj++;
				temp[0] = Integer.toString(countNum);
				temp[1] = URLString;
				temp[2] = "";
				temp[3] = "200 error";
				System.out.println("S/N: " + countNum);
				System.out.println("ERROR 200 ON : " + URLString);
				cPP.com_libs.writeToSheet(wsResultfile, temp);
			}
		}
	}

	private static String[] fetchOneDemArrayFromPropFile(String propertyName, Properties propFile) {
		// get array split up by the colin
		String a[] = propFile.getProperty(propertyName).split(",");
		return a;
	}

	public class MyStrComparable implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
//	       return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));  //Decrease order
//	       return (Integer.parseInt(o1)>Integer.parseInt(o2) ? -1 : (o1==o2 ? 0 : 1)); //Increase order

//	     return (Integer.valueOf(o1)<Integer.valueOf(o2) ? -1 : (o1==o2 ? 0 : 1)); //Increase order

			if (o1.compareTo(o2) > 0) {
				return 1;
			} else if (o1.compareTo(o2) == 0) {
				return 1;
			} else {
				return -1;
			}

		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// // From what I can read on json.org, all JSON strings should start with {
		// (curly brace - object), and [ characters (square brackets - array) represent
		// an array element in JSON.
		// // ******************************************************curly brace -
		// object*********************************************************
		System.out.println("Started...");
		com_libs comlibs = new com_libs();
//		String [] commonCompetitorsCodes=new String [500] ;

		Properties prop = new Properties();
		try {
			prop.load(compareBS_Vehicles_outPutSheet.class.getClassLoader()
					.getResourceAsStream("./compareBS_data/compareBS_text.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String env = prop.getProperty("environment");
//		String TextUR = prop.getProperty(env + ".TextURL");
//		String clients[] = prop.getProperty("clients");
		String Clients[] = fetchOneDemArrayFromPropFile("clients", prop);
//		String envKiaTextURL = "http://apior.autodatacorp.org/compare/v3/api/text";//QA 
//		String client = "Kia";
//		String Headers[] = fetchOneDemArrayFromPropFile(client+".Headers", prop);
//			{ "", "", "", "", "" };
		for (String client : Clients) {
			String VehiclesURL = prop.getProperty(env + ".VehiclesURL");
//			String PrimaryCodes[] = comlibs.loadTextFromDataFolder("empty", "./compareBS_data/" + env + "." + client + "Prmary.txt"); 

			String vehiclesCodes[] = comlibs.loadTextFromDataFolder("empty",
					"./compareBS_data/" + env + "." + client + "Vehicles.txt");

			String Headers[] = fetchOneDemArrayFromPropFile(env + "." + client + ".Headers", prop);

			GetVehicles(env, client, VehiclesURL, Headers, vehiclesCodes);
		}
		// jSonObjec_CPP_BuildDataExtractOrchestrationWS();
		// // ******************************************************End of curly brace -
		// object*********************************************************

		// //// ******************************************************start with [
		// characters (square brackets -
		// array*********************************************************
		//
		// jSonArry_UnityInventory(); //On Tuesday Auguest 30, 2016: API returns {
		// "message": "An error has occurred." } from
		// https://data.dealervideos.com/v1.0/vehicles/2FHFIYI
		// // //******************************************************End of start with
		// [ characters (square brackets -
		// array*********************************************************

		System.out.println("Complete!!!");
	}

}
