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
		String[] titleStringGetMakeModelWS = { "S/N", "Env", "Client", "Acode or Styleid", "URL 404 error",
				"featureDefinitionsObj", "f_DRIVE_TYPE", "f_WHEEL_BASE", "f_BODY_TYPE", "Empty_01", "vehiclesArr",
				"featuresObj", "DRIVE_TYPE", "MFR_CODE", "WHEEL_BASE", "BODY_TYPE", "Code", "trim", "year", "modelCode",
				"description", "model", "mediaObj", "mediaSubObj", "mediaSubValues", "code", "name", "imageType", "url",
				"make", "variation", "pricingObj", "destinationCharge", "msrp", "segments" };
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
			PostTextDetails(env, client, commonCompetitorsCode, PostTextSavePathFile, titleStringGetMakeModelWS,
					jsonCommonCompetitorsWS, "URLString", "parameterS", count);
		}

	}

	public static void PostTextDetails(String env, String client, String acodeStryleid, String wsResultfile,
			String[] titleString, String text, String URLString, String parameterS, int countNum) throws IOException {
		com_libs.writeTitle(wsResultfile, titleString);
		String serverTime = "";
		String error = "";
		String executionTimeMS = "";
		String resultObj = "";
		String id = "";
//		String make = "";
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

		String SN = "";
		String AcodeorStyleid = "";
		String URL404error = "";
//		String featureDefinitionsObj = "";
		String DRIVE_TYPE = "";
		String WHEEL_BASE = "";
		String BODY_TYPE = "";
		String Empty_01 = "";
		String vehiclesArr = "";
//		String featuresObj = "";
		String f_DRIVE_TYPE = "";
		String f_MFR_CODE = "";
		String f_WHEEL_BASE = "";
		String f_BODY_TYPE = "";
		String vehiclesCode = "";
		String trim = "";
		String year = "";
		String modelCode = "";
		String description = "";
		String vehicle_model = "";
//		String mediaObj = "";
		String mediaSubObj = "";
		String mediaSubValues = "";
		String mediacode = "";
		String name = "";
		String imageType = "";
		String url = "";
		String make = "";
		String variation = "";
//		String pricingObj = "";
		String destinationCharge = "";
		String msrp = "";
		String segments = "";

		String[] temp = new String[35];
		if (text.equals("")) {
			blank++;
			temp[0] = Integer.toString(countNum);
			temp[1] = env;
			temp[2] = client;
			temp[3] = acodeStryleid;
			temp[4] = "404 error";
			System.out.println("S/N: " + countNum);
			System.out.println("404 ERROR ON : " + env + " - " + client + " - " + acodeStryleid);
			com_libs.writeToSheet(wsResultfile, temp);
		} else {
			try {

				JSONObject ccObj = new JSONObject(text);

				int size = ccObj.length();

//				==============featureDefinitionsObject==============
//				==============featureDefinitionsObject==============
				JSONObject featureDefinitionsObj = ccObj.getJSONObject("featureDefinitions");
//				JSONObject featureDefinitionsObj = ccArr.JSONArray(0)("featureDefinitions");
				size = featureDefinitionsObj.length();

				if (size > 3) {
//					Exceeds below: 
//					1. DRIVE_TYPEStr
//					2. WHEEL_BASEStr
//					3. BODY_TYPEStr
					blank++;
					temp[0] = Integer.toString(countNum);
					temp[1] = env;
					temp[2] = client;
					temp[3] = acodeStryleid;
					temp[4] = "size > 3";

					com_libs.writeToSheet(wsResultfile, temp);

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

					temp[0] = Integer.toString(countNum);
					temp[1] = env;
					temp[2] = client;
					temp[3] = acodeStryleid;
					temp[5] = "featureDefinitions";
					temp[6] = DRIVE_TYPEStr;
					com_libs.writeToSheet(wsResultfile, temp);
					System.out.println("iii=" + iii + " - DRIVE_TYPEStr = " + DRIVE_TYPEStr);
				}
//					WHEEL_BASEStr
				JSONArray WHEEL_BASEArr = featureDefinitionsObj.getJSONArray("WHEEL_BASE");
				int WHEEL_BASEArrSize = WHEEL_BASEArr.length();
//					System.out.println("ii=" +ii);
				for (int iii = 0; iii < WHEEL_BASEArrSize; iii++) {
					WHEEL_BASEStr = WHEEL_BASEArr.getString(iii);

					temp[0] = Integer.toString(countNum);
					temp[1] = env;
					temp[2] = client;
					temp[3] = acodeStryleid;
					temp[5] = "featureDefinitions";
					temp[6] = "";
					temp[7] = WHEEL_BASEStr;
					com_libs.writeToSheet(wsResultfile, temp);

					System.out.println("iii=" + iii + " - WHEEL_BASEStr = " + WHEEL_BASEStr);
				}
//					BODY_TYPEStr;
				JSONArray BODY_TYPEArr = featureDefinitionsObj.getJSONArray("BODY_TYPE");
				int BODY_TYPEArrSize = BODY_TYPEArr.length();
//					System.out.println("ii=" +ii);
				for (int iii = 0; iii < BODY_TYPEArrSize; iii++) {
					BODY_TYPEStr = BODY_TYPEArr.getString(iii);

					temp[0] = Integer.toString(countNum);
					temp[1] = env;
					temp[2] = client;
					temp[3] = acodeStryleid;
					temp[5] = "featureDefinitions";
					temp[6] = "";
					temp[7] = "";
					temp[8] = BODY_TYPEStr;
					com_libs.writeToSheet(wsResultfile, temp);

					System.out.println("iii=" + iii + " - BODY_TYPEStr = " + BODY_TYPEStr);
				}

//				serverTime = featureDefinitionsObj.getString("featureDefinitions");
//				error = Boolean.toString(obj.getBoolean("error"));
//				executionTimeMS = Long.toString(obj.getLong("executionTimeMS"));
//
//				JSONArray result = obj.getJSONArray("result");
//				int size = result.length();

//				================vehiclesArray==============
//				================vehiclesArray==============

				JSONArray vehiclsArr = ccObj.getJSONArray("vehicles");
//				JSONObject featureDefinitionsObj = ccArr.JSONArray(0)("featureDefinitions");
				int vehicleObjsize = vehiclsArr.length();

				if (vehicleObjsize > 3) {

					temp[0] = Integer.toString(countNum);
					temp[1] = env;
					temp[2] = client;
					temp[3] = acodeStryleid;
					temp[4] = "vehicleObj size > 3";
					temp[5] = "";
					temp[6] = "";
					temp[7] = "";
					temp[8] = "";

					temp[10] = "vehicleObj>3";
					com_libs.writeToSheet(wsResultfile, temp);

					int waitTime = 100;
					System.err.println("\nvehicles length = " + size + ". > 3 which may need modify below...Waiting "
							+ waitTime + " seconds to continue...\n");
					com_libs.Wait(waitTime);
				}

				if (vehicleObjsize == 0) {
					blank++;
					temp[0] = Integer.toString(countNum);
					temp[1] = env;
					temp[2] = client;
					temp[3] = acodeStryleid;
					temp[4] = "vehicleObj size =0";
					temp[5] = "";
					temp[6] = "";
					temp[7] = "";
					temp[8] = "";
					temp[10] = "vehicleObj is empty";

					com_libs.writeToSheet(wsResultfile, temp);
					System.out.println("gvuid = " + "  " + " - Result [] object is blank. ");

				} else {

					for (int i = 0; i < vehicleObjsize; i++) {

						JSONObject vehicles_0_Obj = vehiclsArr.getJSONObject(i);
						JSONObject featuresObj = vehicles_0_Obj.getJSONObject("features");

						Vehicles_features_DRIVE_TYPE = featuresObj.getString("DRIVE_TYPE");
						try {
							Vehicles_features_MFR_CODE = featuresObj.getString("MFR_CODE");
						} catch (Exception ex) {
							Vehicles_features_MFR_CODE = "null! error?";
							System.out.println("error occurs!");
						}

						Vehicles_features_WHEEL_BASE = featuresObj.getString("WHEEL_BASE");
						Vehicles_features_BODY_TYPE = featuresObj.getString("BODY_TYPE");

						vehiclesCode = vehicles_0_Obj.getString("code");

						trim = vehicles_0_Obj.getString("trim");
						year = vehicles_0_Obj.getString("year");
						modelCode = vehicles_0_Obj.getString("modelCode");
						description = vehicles_0_Obj.getString("description");
						vehicle_model = vehicles_0_Obj.getString("model");
						make = vehicles_0_Obj.getString("make");
						variation = vehicles_0_Obj.getString("variation");

						temp[0] = Integer.toString(countNum);
						temp[1] = env;
						temp[2] = client;
						temp[3] = acodeStryleid;
						temp[5] = "";
						temp[6] = "";
						temp[7] = "";
						temp[8] = "";
						temp[9] = "";
						temp[10] = "vehicleObj_" + i;
						temp[11] = "features";
						temp[12] = Vehicles_features_DRIVE_TYPE;
						temp[13] = Vehicles_features_MFR_CODE;
						temp[14] = Vehicles_features_WHEEL_BASE;
						temp[15] = Vehicles_features_BODY_TYPE;
						temp[16] = vehiclesCode;

						temp[17] = trim;
						temp[18] = year;
						temp[19] = modelCode;
						temp[20] = description;
						temp[21] = vehicle_model;
						temp[22] = "";
						temp[23] = "";
						temp[24] = "";
						temp[25] = "";
						temp[26] = "";
						temp[27] = "";
						temp[28] = "";
						temp[29] = make;
						temp[30] = variation;
						temp[31] = "";
						temp[32] = "";
						temp[33] = "";
						temp[34] = "";

						com_libs.writeToSheet(wsResultfile, temp);

//						================mediaObject==============
//						================mediaObject==============

						JSONObject mediaObj = vehicles_0_Obj.getJSONObject("media");

						int mediaObjsize = mediaObj.length();
						for (int m = 0; m < mediaObjsize; m++) {

							JSONArray mediaOptionArr = mediaObj.names();
							int mediaSize = mediaOptionArr.length();
							for (int n = 0; n < mediaSize; n++) {
								String optionString = mediaOptionArr.getString(n);
								System.out.println("optionString=\n" + optionString);
								JSONObject mediasubObj = mediaObj.getJSONObject(optionString);// SWP
								int mediasubObjsize = mediasubObj.length();

								for (int o = 0; o < mediasubObjsize; o++) {
									JSONObject mediaOption_0 = mediasubObj.getJSONObject("FRONT_3QTR_LEFT");
									mediacode = mediaOption_0.getString("code");
									name = mediaOption_0.getString("name");
									imageType = mediaOption_0.getString("imageType");
									url = mediaOption_0.getString("url");
									temp[0] = Integer.toString(countNum);
									temp[1] = env;
									temp[2] = client;
									temp[3] = acodeStryleid;
									temp[5] = "";
									temp[6] = "";
									temp[7] = "";
									temp[8] = "";
									temp[9] = "";
									temp[10] = "vehicleObj_" + i;
									temp[11] = "";
									temp[12] = "";
									temp[13] = "";
									temp[14] = "";
									temp[15] = "";
									temp[16] = vehiclesCode;

									temp[17] = "";
									temp[18] = "";
									temp[19] = "";
									temp[20] = "";
									temp[21] = "";
									temp[22] = "mediaObj";
									temp[23] = optionString;
									temp[24] = "FRONT_3QTR_LEFT";
									temp[25] = mediacode;
									temp[26] = name;
									temp[27] = imageType;
									temp[28] = url;
									temp[29] = "";
									temp[30] = "";
									temp[31] = "";
									temp[32] = "";
									temp[33] = "";
									temp[34] = "";

									com_libs.writeToSheet(wsResultfile, temp);
//									
//									
//									
//									
//									
//									
//									
//									
								}
//								
//								
//								
							}

//							
//							
//						
//							

						}
						JSONObject pricingObj = vehicles_0_Obj.getJSONObject("pricing");
						destinationCharge = Integer.toString(pricingObj.getInt("destinationCharge"));
						msrp = Integer.toString(pricingObj.getInt("msrp"));
						temp[0] = Integer.toString(countNum);
						temp[1] = env;
						temp[2] = client;
						temp[3] = acodeStryleid;
						temp[5] = "";
						temp[6] = "";
						temp[7] = "";
						temp[8] = "";
						temp[9] = "";
						temp[10] = "vehicleObj_" + i;
						temp[11] = "";
						temp[12] = "";
						temp[13] = "";
						temp[14] = "";
						temp[15] = "";
						temp[16] = vehiclesCode;

						temp[17] = "";
						temp[18] = "";
						temp[19] = "";
						temp[20] = "";
						temp[21] = "";
						temp[22] = "";
						temp[23] = "";
						temp[24] = "";
						temp[25] = "";
						temp[26] = "";
						temp[27] = "";
						temp[28] = "";
						temp[29] = "";
						temp[30] = "";
						temp[31] = "pricing";
						temp[32] = destinationCharge;
						temp[33] = msrp;
						temp[34] = "";

						com_libs.writeToSheet(wsResultfile, temp);

						JSONArray segmentsArr = vehicles_0_Obj.getJSONArray("segments");
						int getJSONsize = segmentsArr.length();

						for (int p = 0; p < getJSONsize; p++) {
							segments = segmentsArr.getString(p);

							temp[31] = "";
							temp[32] = "";
							temp[33] = "";
							temp[34] = segments;
							com_libs.writeToSheet(wsResultfile, temp);
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
//					
//					

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
			} catch (Exception ex) {
				System.out.println("error occurs!");
				noObj++;
				temp[0] = Integer.toString(countNum);
				temp[1] = env;
				temp[2] = client;
				temp[3] = acodeStryleid;
				temp[4] = "error on xxx";
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
