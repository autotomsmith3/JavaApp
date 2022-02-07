package compareBS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class compareBS_commonCompetitors_outPutAcodeNameAndSheet {
	private static int blank = 0;
	private static int noObj = 0;

	public static void GetCommonCompetitors(String env, String client, String envClientTextURL, String headers[],
			String commonCompetitorsCodes[]) throws Exception {
		String VehicleSetCode = "";
		String LngCode = "";
		String CountryCode = "";
		String year = "";
		String makeId = "";
		String parameterString = "";
		String PostTextSavePathFile = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + env
				+ "_Common-CompetitorsSheet.xls";
//		String acode_or_styleid_savePath = "C:\\1\\Eclipse\\Test Results\\CompareBS\\";
		String[] titleStringGetMakeModelWS = { "S/N", "URL_parameter", "serverTime", "error", "executionTimeMS",
				"filtersObj", "Acode or YMM_id", "Year", "Make", "Client", "Model", "Styleid" };
		Properties prop = new Properties();
		try {
			prop.load(compareBS_commonCompetitors_outPutAcodeNameAndSheet.class.getClassLoader()
					.getResourceAsStream("compareBS_data/compareBS_text.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		com_libs comlibs = new com_libs();

		String headerss = "";
//		String commonCompetitorsCodes[] = comlibs.loadTextFromDataFolder("empty", "./compareBS_data/" + client + "CommonCompetitors.txt");
		int testDataTotal = commonCompetitorsCodes.length;

		String envURL = envClientTextURL;// QA

		int count = 0;

		System.out.println(client + " - TestDataTotal = " + testDataTotal);
		parameterString = VehicleSetCode + "/" + LngCode + "/" + CountryCode + "/" + year;
		String getCommonCompetitorsURL = envURL;// + VehicleSetCode + "/" + LngCode + "/" + CountryCode + "/" + year;

		for (String commonCompetitorsCode : commonCompetitorsCodes) {
			count++;
			String jsonCommonCompetitorsWS = com_libs.getNewSourceCodeJsonGETcommonCompetitors(env, client,
					commonCompetitorsCode, envURL, commonCompetitorsCode, "common-competitors", count, headers[0],
					headers[1], headers[2], headers[3]);
			PostTextDetails(PostTextSavePathFile, titleStringGetMakeModelWS, jsonCommonCompetitorsWS, "URLString",
					"parameterS", count);
		}

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
		String DRIVE_TYPEStr;
		String WHEEL_BASEStr;
		String BODY_TYPEStr;
		String Vehicles_features_DRIVE_TYPE;
		String Vehicles_features_MFR_CODE;
		String Vehicles_features_WHEEL_BASE;
		String Vehicles_features_BODY_TYPE;
		String Vehicles_code;
		String Vehicles_trim;
		String Vehicles_year;
		String Vehicles_modelCode;
		String Vehicles_description;
		String Vehicles_model;
		String Vehicles_mediaObj;
		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;
//		String Vehicles_;

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

				JSONObject ccObj = new JSONObject(text);

				int size = ccObj.length();

//				==============featureDefinitionsObject==============

				JSONObject featureDefinitionsObj = ccObj.getJSONObject("featureDefinitions");
//				JSONObject featureDefinitionsObj = ccArr.JSONArray(0)("featureDefinitions");
				size = featureDefinitionsObj.length();

				if (size > 3) {
//					Exceeds below: 
//					1. DRIVE_TYPEStr
//					2. WHEEL_BASEStr
//					3. BODY_TYPEStr
					int waitTime = 100;
					System.err.println("\nfeatureDefinitions length = " + size
							+ ". > 3 which may need modify below...Waiting " + waitTime + " seconds to continue...\n");
					com_libs.Wait(waitTime);

				}

//				for (int ii = 0; ii < size; ii++) {
//					Exceeds below: 
//					DRIVE_TYPEStr
//					WHEEL_BASEStr
//					BODY_TYPEStr
//				}

//					DRIVE_TYPEStr
				JSONArray DRIVE_TYPEArr = featureDefinitionsObj.getJSONArray("DRIVE_TYPE");
				int DRIVE_TYPEArrSize = DRIVE_TYPEArr.length();
//					System.out.println("ii=" +ii);
				for (int iii = 0; iii < DRIVE_TYPEArrSize; iii++) {
					DRIVE_TYPEStr = DRIVE_TYPEArr.getString(iii);
					System.out.println("iii=" + iii + " - DRIVE_TYPEStr = " + DRIVE_TYPEStr);
				}
//					WHEEL_BASEStr
				JSONArray WHEEL_BASEArr = featureDefinitionsObj.getJSONArray("WHEEL_BASE");
				int WHEEL_BASEArrSize = WHEEL_BASEArr.length();
//					System.out.println("ii=" +ii);
				for (int iii = 0; iii < WHEEL_BASEArrSize; iii++) {
					WHEEL_BASEStr = WHEEL_BASEArr.getString(iii);
					System.out.println("iii=" + iii + " - WHEEL_BASEStr = " + WHEEL_BASEStr);
				}
//					BODY_TYPEStr;
				JSONArray BODY_TYPEArr = featureDefinitionsObj.getJSONArray("BODY_TYPE");
				int BODY_TYPEArrSize = BODY_TYPEArr.length();
//					System.out.println("ii=" +ii);
				for (int iii = 0; iii < BODY_TYPEArrSize; iii++) {
					BODY_TYPEStr = BODY_TYPEArr.getString(iii);
					System.out.println("iii=" + iii + " - BODY_TYPEStr = " + BODY_TYPEStr);
				}

//				serverTime = featureDefinitionsObj.getString("featureDefinitions");
//				error = Boolean.toString(obj.getBoolean("error"));
//				executionTimeMS = Long.toString(obj.getLong("executionTimeMS"));
//
//				JSONArray result = obj.getJSONArray("result");
//				int size = result.length();

//				================vehiclesArray==============

				JSONArray vehiclsArr = ccObj.getJSONArray("vehicles");
//				JSONObject featureDefinitionsObj = ccArr.JSONArray(0)("featureDefinitions");
				size = vehiclsArr.length();

				if (size > 3) {
					int waitTime = 100;
					System.err.println("\nvehicles length = " + size + ". > 3 which may need modify below...Waiting "
							+ waitTime + " seconds to continue...\n");
					com_libs.Wait(waitTime);
				}

				if (size == 0) {
					blank++;
					temp[0] = Integer.toString(countNum);
					temp[1] = URLString;
					temp[2] = "";
					temp[3] = "result [] object is blank";
					com_libs.writeToSheet(wsResultfile, temp);
					System.out.println("gvuid = " + "  " + " - Result [] object is blank. ");

				} else {

					
					for (int i = 0; i < size; i++) {

						JSONObject vehicles_0_Obj = vehiclsArr.getJSONObject(i);
						JSONObject featuresObj=vehicles_0_Obj.getJSONObject("features");
				
						Vehicles_features_DRIVE_TYPE = featuresObj.getString("DRIVE_TYPE");

						Vehicles_features_MFR_CODE = featuresObj.getString("MFR_CODE");
						Vehicles_features_WHEEL_BASE = featuresObj.getString("WHEEL_BASE");
						Vehicles_features_BODY_TYPE = featuresObj.getString("BODY_TYPE");

						System.out.println("i="+i+". Vehicles_features_DRIVE_TYPE = " +Vehicles_features_DRIVE_TYPE);
						System.out.println("i="+i+". Vehicles_features_MFR_CODE = " +Vehicles_features_MFR_CODE);
						System.out.println("i="+i+". Vehicles_features_WHEEL_BASE = " +Vehicles_features_WHEEL_BASE);
						System.out.println("i="+i+". Vehicles_features_BODY_TYPE = " +Vehicles_features_BODY_TYPE);
						
						
					}
				}

//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
				if (size == 0) {
					blank++;
					temp[0] = Integer.toString(countNum);
					temp[1] = URLString;
					temp[2] = "";
					temp[3] = "result [] object is blank";
					com_libs.writeToSheet(wsResultfile, temp);
					System.out.println("gvuid = " + "  " + " - Result [] object is blank. ");

				} else {
					for (int i = 0; i < size; i++) {
						try {
//							id = ccArr.getJSONObject(i).getString("id");
						} catch (Exception ex) {
							id = "null";
						}
						try {
//							make = ccArr.getJSONObject(i).getString("make");
						} catch (Exception ex) {
							make = "null";
						}

						JSONArray modelsObject = ccObj.getJSONArray("models");
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
							com_libs.writeToSheet(wsResultfile, jsonValue);
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
				com_libs.writeToSheet(wsResultfile, temp);
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

	private static String[] fetchOneDemArrayFromPropFile(String propertyName, Properties propFile) {
		// get array split up by the colin
		String a[] = propFile.getProperty(propertyName).split(",");
		return a;
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
			prop.load(compareBS_commonCompetitors_outPutAcodeNameAndSheet.class.getClassLoader()
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
			String CommonCompetitorsURL = prop.getProperty(env + ".CommonCompetitorsURL");
			String commonCompetitorsCodes[] = comlibs.loadTextFromDataFolder("empty",
					"./compareBS_data/" + env + "." + client + "CommonCompetitors.txt");
			String Headers[] = fetchOneDemArrayFromPropFile(env + "." + client + ".Headers", prop);
			GetCommonCompetitors(env, client, CommonCompetitorsURL, Headers, commonCompetitorsCodes);
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
