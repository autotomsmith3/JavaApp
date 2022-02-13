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
		String[] titleStringGetMakeModelWS = { "S/N", "Env", "Client", "acodeStryleid", "URL404error",
				"featureDefinitionsObj", "featureValue", "vehiclesArr", "featuresObj", "DRIVE_TYPE", "MFR_CODE",
				"WHEEL_BASE", "BODY_TYPE", "code", "trim", "year", "ModelCode", "description", "model", "make",
				"variation", "mediaOptName", "REARObj", "REAR_code", "REAR_name", "REAR_imageType", "REAR_url",
				"REAR_SEATSObj", "REAR_SEATS_code", "REAR_SEATS_name", "REAR_SEATS_imageType", "REAR_SEATS_url",
				"SIDE_PROFILE_RIGHTObj", "SIDE_PROFILE_RIGHT_code", "SIDE_PROFILE_RIGHT_name",
				"SIDE_PROFILE_RIGHT_imageType", "SIDE_PROFILE_RIGHT_url", "FULL_DASHBOARDObj", "FULL_DASHBOARD_code",
				"FULL_DASHBOARD_name", "FULL_DASHBOARD_imageType", "FULL_DASHBOARD_url", "FRONT_3QTR_LEFTObj",
				"FRONT_3QTR_LEFT_code", "FRONT_3QTR_LEFT_name", "FRONT_3QTR_LEFT_imageType", "FRONT_3QTR_LEFT_url",
				"FRONTObj", "FRONT_code", "FRONT_name", "FRONT_imageType", "FRONT_url", "DRIVERS_SEATObj",
				"DRIVERS_SEAT_code", "DRIVERS_SEAT_name", "DRIVERS_SEAT_imageType", "DRIVERS_SEAT_url",
				"DRIVERS_DASHBOARDObj", "DRIVERS_DASHBOARD_code", "DRIVERS_DASHBOARD_name",
				"DRIVERS_DASHBOARD_imageType", "DRIVERS_DASHBOARD_url", "SIDE_PROFILE_LEFTObj",
				"SIDE_PROFILE_LEFT_code", "SIDE_PROFILE_LEFT_name", "SIDE_PROFILE_LEFT_imageType",
				"SIDE_PROFILE_LEFT_url", "ENGINE_BAYObj", "ENGINE_BAY_code", "ENGINE_BAY_name", "ENGINE_BAY_imageType",
				"ENGINE_BAY_url", "REAR_3QTR_RIGHTObj", "REAR_3QTR_RIGHT_code", "REAR_3QTR_RIGHT_name",
				"REAR_3QTR_RIGHT_imageType", "REAR_3QTR_RIGHT_url", "FRONT_3QTR_RIGHTObj", "FRONT_3QTR_RIGHT_code",
				"FRONT_3QTR_RIGHT_name", "FRONT_3QTR_RIGHT_imageType", "FRONT_3QTR_RIGHT_url", "PASSENGER_DASHBOARDObj",
				"PASSENGER_DASHBOARD_code", "PASSENGER_DASHBOARD_name", "PASSENGER_DASHBOARD_imageType",
				"PASSENGER_DASHBOARD_url", "STEREOObj", "STEREO_code", "STEREO_name", "STEREO_imageType", "STEREO_url",
				"TRUNK_OPENObj", "TRUNK_OPEN_code", "TRUNK_OPEN_name", "TRUNK_OPEN_imageType", "TRUNK_OPEN_url",
				"CENTER_CONSOLEObj", "CENTER_CONSOLE_code", "CENTER_CONSOLE_name", "CENTER_CONSOLE_imageType",
				"CENTER_CONSOLE_url", "REAR_3QTR_LEFTObj", "REAR_3QTR_LEFT_code", "REAR_3QTR_LEFT_name",
				"REAR_3QTR_LEFT_imageType", "REAR_3QTR_LEFT_url", "DRIVERS_FRONT_WHEELObj", "DRIVERS_FRONT_WHEEL_code",
				"DRIVERS_FRONT_WHEEL_name", "DRIVERS_FRONT_WHEEL_imageType", "DRIVERS_FRONT_WHEEL_url",
				"NAVIGATION_SYSTEMObj", "NAVIGATION_SYSTEM_code", "NAVIGATION_SYSTEM_name",
				"NAVIGATION_SYSTEM_imageType", "NAVIGATION_SYSTEM_url", "colorsObj", "AvailableColorsArr", "Available#",
				"code", "name", "mediaObj", "primary", "family", "PrcingObj", "destintionCharge", "msrp", "segmentsArr",
				"segments" };

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

			GetVehiclesDetails(env, client, vehiclesCode, PostTextSavePathFile, titleStringGetMakeModelWS,
					jsonVehiclesWS, envURL, parameterString, count);

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

	public static void GetVehiclesDetails(String env, String client, String modelidOrymmid, String wsResultfile,
			String[] titleString, String text, String URLString, String parameterS, int countNum) throws IOException {
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
		int x = 0;
		String[] temp = new String[130];
		if (text.equals("")) {
//			blank++;
//			temp[0] = Integer.toString(countNum);
//			temp[1] = URLString;
//			temp[2] = "";
//			temp[3] = "404 error";
//			System.out.println("S/N: " + countNum);
//			System.out.println("404 ERROR ON : " + URLString);
//			cPP.com_libs.writeToSheet(wsResultfile, temp);

			blank++;
			temp[0] = Integer.toString(countNum);
			temp[1] = env;
			temp[2] = client;
			temp[3] = modelidOrymmid;
			temp[4] = "404 error";
			for (int emp = 5; emp <= 129; emp++) {
				temp[emp] = "";
			}
			System.out.println("S/N: " + countNum);
			System.out.println("404 ERROR ON : " + env + " - " + client + " - " + modelidOrymmid);
			com_libs.writeToSheet(wsResultfile, temp);

		} else {
			try {
				JSONObject obj = new JSONObject(text);
//              ==========================featureDefinitions Object============================
				JSONObject filtersObj = obj.getJSONObject("featureDefinitions");
				int filterSize = filtersObj.length();
				for (int i = 0; i < filterSize; i++) {
					JSONArray filterSubObjName = filtersObj.names();
					temp[0] = Integer.toString(countNum);
					temp[1] = env;
					temp[2] = client;
					temp[3] = modelidOrymmid;
					temp[4] = "";
					temp[5] = filterSubObjName.getString(i);
//					temp[6] = filterSubObjName.getString(i);
					String ss = filterSubObjName.getString(i);
					JSONArray filterObj = filtersObj.getJSONArray(ss);
					// Save temp 7
//					com_libs.writeToSheet(wsResultfile, temp);

					int filterObjSize = filterObj.length();
					for (int ii = 0; ii < filterObjSize; ii++) {
						temp[6] = filterObj.getString(ii); // AWD
						com_libs.writeToSheet(wsResultfile, temp);
						System.out.println("S/N: " + countNum);
					}

					System.out.println("S/N: " + countNum);

				}

//              ==========================vehicles Object============================

				JSONArray result = obj.getJSONArray("vehicles");
				int size = result.length();

				if (size == 0) {
					blank++;
					temp[0] = Integer.toString(countNum);
					temp[1] = env;
					temp[2] = client;
					temp[3] = modelidOrymmid;
					temp[4] = "vehicles size =0";

					for (int emp = 5; emp <= 129; emp++) {
						temp[emp] = "";
					}

					com_libs.writeToSheet(wsResultfile, temp);
					System.out.println("gvuid = " + "  " + " - Result [] object is blank. ");

				} else {
					for (int i = 0; i < size; i++) {
//              ==========================why here? featureDefinitions Object============================
						temp[5] = "";
						temp[6] = "";
						temp[7] = "[" + i + "]";
						temp[8] = "featuresObj";
						temp[9] = result.getJSONObject(i).getJSONObject("features").getString("DRIVE_TYPE");
						temp[10] = result.getJSONObject(i).getJSONObject("features").getString("MFR_CODE");
						temp[11] = result.getJSONObject(i).getJSONObject("features").getString("WHEEL_BASE");
						temp[12] = result.getJSONObject(i).getJSONObject("features").getString("BODY_TYPE");

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

						temp[13] = code;
						temp[14] = trim;
						temp[15] = year;
						temp[16] = modelCode;
						temp[17] = description;
						temp[18] = model;
						temp[19] = make;
						temp[20] = variation;

//						com_libs.writeToSheet(wsResultfile, temp);

//						==========================media object==========================
//						==========================media object==========================						

						JSONObject mediaObj = result.getJSONObject(i).getJSONObject("media");
						int mediaSize = mediaObj.length();
						if (mediaSize == 0) {
							temp[0] = Integer.toString(countNum);
							temp[1] = env;
							temp[2] = client;
							temp[3] = modelidOrymmid;
							temp[4] = "NO media node!";
							temp[5] = "";
							temp[6] = "";
							temp[7] = "[" + i + "]";
							temp[8] = "";
							temp[9] = "";
							temp[10] = "null";

							for (int empty0 = 11; empty0 <= 129; empty0++) {
								temp[empty0] = "";
							}

							com_libs.writeToSheet(wsResultfile, temp);

						}
						for (int j = 0; j < mediaSize; j++) {
							JSONArray mediaOptionArr = mediaObj.names();// get ["SWP"]
							int mSize = mediaOptionArr.length();
//						for (int n = 0; n < mSize; n++) {
							String optionString = mediaOptionArr.getString(j); // get SWP - this is how to get dynomic
																				// object
							System.out.println("optionString=\n" + optionString);
							JSONObject mediasubObj = mediaObj.getJSONObject(optionString); // SWP - this is how to get
																							// dynomic object
							int mediasubObjsize = mediasubObj.length();

							temp[21] = optionString;
							x = 16;
							try {
								x = x + 5; // 22
								temp[x + 1] = "REAR"; // 22
								temp[x + 2] = mediasubObj.getJSONObject("REAR").getString("code"); // 19
								temp[x + 3] = mediasubObj.getJSONObject("REAR").getString("name"); // 20
								temp[x + 4] = mediasubObj.getJSONObject("REAR").getString("imageType"); // 21
								temp[x + 5] = mediasubObj.getJSONObject("REAR").getString("url"); // 22
							} catch (Exception e) {
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";
								temp[x + 6] = "null";
							}

							try {
								x = x + 5;
								temp[x + 1] = "REAR_SEATS";
								temp[x + 2] = mediasubObj.getJSONObject("REAR_SEATS").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("REAR_SEATS").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("REAR_SEATS").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("REAR_SEATS").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "REAR_SEATS";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "SIDE_PROFILE_RIGHT";
								temp[x + 2] = mediasubObj.getJSONObject("SIDE_PROFILE_RIGHT").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("SIDE_PROFILE_RIGHT").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("SIDE_PROFILE_RIGHT").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("SIDE_PROFILE_RIGHT").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "SIDE_PROFILE_RIGHT";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "FULL_DASHBOARD";
								temp[x + 2] = mediasubObj.getJSONObject("FULL_DASHBOARD").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("FULL_DASHBOARD").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("FULL_DASHBOARD").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("FULL_DASHBOARD").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "FULL_DASHBOARD";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "FRONT_3QTR_LEFT";
								temp[x + 2] = mediasubObj.getJSONObject("FRONT_3QTR_LEFT").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("FRONT_3QTR_LEFT").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("FRONT_3QTR_LEFT").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("FRONT_3QTR_LEFT").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "FRONT_3QTR_LEFT";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "FRONT";
								temp[x + 2] = mediasubObj.getJSONObject("FRONT").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("FRONT").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("FRONT").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("FRONT").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "FRONT";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "DRIVERS_SEAT";
								temp[x + 2] = mediasubObj.getJSONObject("DRIVERS_SEAT").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("DRIVERS_SEAT").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("DRIVERS_SEAT").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("DRIVERS_SEAT").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "DRIVERS_SEAT";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "DRIVERS_DASHBOARD";
								temp[x + 2] = mediasubObj.getJSONObject("DRIVERS_DASHBOARD").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("DRIVERS_DASHBOARD").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("DRIVERS_DASHBOARD").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("DRIVERS_DASHBOARD").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "DRIVERS_DASHBOARD";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";
							}
							try {
								x = x + 5;
								temp[x + 1] = "SIDE_PROFILE_LEFT";
								temp[x + 2] = mediasubObj.getJSONObject("SIDE_PROFILE_LEFT").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("SIDE_PROFILE_LEFT").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("SIDE_PROFILE_LEFT").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("SIDE_PROFILE_LEFT").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "SIDE_PROFILE_LEFT";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "ENGINE_BAY";
								temp[x + 2] = mediasubObj.getJSONObject("ENGINE_BAY").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("ENGINE_BAY").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("ENGINE_BAY").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("ENGINE_BAY").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "ENGINE_BAY";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "REAR_3QTR_RIGHT";
								temp[x + 2] = mediasubObj.getJSONObject("REAR_3QTR_RIGHT").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("REAR_3QTR_RIGHT").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("REAR_3QTR_RIGHT").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("REAR_3QTR_RIGHT").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "REAR_3QTR_RIGHT";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "FRONT_3QTR_RIGHT";
								temp[x + 2] = mediasubObj.getJSONObject("FRONT_3QTR_RIGHT").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("FRONT_3QTR_RIGHT").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("FRONT_3QTR_RIGHT").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("FRONT_3QTR_RIGHT").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "FRONT_3QTR_RIGHT";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "PASSENGER_DASHBOARD";
								temp[x + 2] = mediasubObj.getJSONObject("PASSENGER_DASHBOARD").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("PASSENGER_DASHBOARD").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("PASSENGER_DASHBOARD").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("PASSENGER_DASHBOARD").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "PASSENGER_DASHBOARD";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}

							try {
								x = x + 5;
								temp[x + 1] = "STEREO";
								temp[x + 2] = mediasubObj.getJSONObject("STEREO").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("STEREO").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("STEREO").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("STEREO").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "STEREO";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "TRUNK_OPEN";
								temp[x + 2] = mediasubObj.getJSONObject("TRUNK_OPEN").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("TRUNK_OPEN").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("TRUNK_OPEN").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("TRUNK_OPEN").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "TRUNK_OPEN";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "CENTER_CONSOLE";
								temp[x + 2] = mediasubObj.getJSONObject("CENTER_CONSOLE").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("CENTER_CONSOLE").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("CENTER_CONSOLE").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("CENTER_CONSOLE").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "CENTER_CONSOLE";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "REAR_3QTR_LEFT";
								temp[x + 2] = mediasubObj.getJSONObject("REAR_3QTR_LEFT").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("REAR_3QTR_LEFT").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("REAR_3QTR_LEFT").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("REAR_3QTR_LEFT").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "REAR_3QTR_LEFT";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}

							try {
								x = x + 5;
								temp[x + 1] = "DRIVERS_FRONT_WHEEL";
								temp[x + 2] = mediasubObj.getJSONObject("DRIVERS_FRONT_WHEEL").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("DRIVERS_FRONT_WHEEL").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("DRIVERS_FRONT_WHEEL").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("DRIVERS_FRONT_WHEEL").getString("url");
							} catch (Exception e) {
								temp[x + 1] = "DRIVERS_FRONT_WHEEL";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null";

							}
							try {
								x = x + 5;
								temp[x + 1] = "NAVIGATION_SYSTEM";
								temp[x + 2] = mediasubObj.getJSONObject("NAVIGATION_SYSTEM").getString("code");
								temp[x + 3] = mediasubObj.getJSONObject("NAVIGATION_SYSTEM").getString("name");
								temp[x + 4] = mediasubObj.getJSONObject("NAVIGATION_SYSTEM").getString("imageType");
								temp[x + 5] = mediasubObj.getJSONObject("NAVIGATION_SYSTEM").getString("url"); // [112]
							} catch (Exception e) {
								temp[x + 1] = "NAVIGATION_SYSTEM";
								temp[x + 2] = "null";
								temp[x + 3] = "null";
								temp[x + 4] = "null";
								temp[x + 5] = "null"; // [112]

							}

							for (int blank = 124; blank <= 129; blank++) {
								temp[blank] = "";
							}

							com_libs.writeToSheet(wsResultfile, temp);
						}
//					==========================end of media object==========================
//					==========================end of media object==========================	

//					=============================segments object=============================					
						JSONArray segmentsObject = result.getJSONObject(i).getJSONArray("segments");
						int segmentsObjectSize = segmentsObject.length();
//						modelsObj = Integer.toString(modelsObjSize);
						for (int j = 0; j < segmentsObjectSize; j++) {

							temp[0] = Integer.toString(countNum);
							temp[1] = env;
							temp[2] = client;
							temp[3] = modelidOrymmid;
							temp[4] = "";
							temp[5] = "";
							temp[6] = "";
							temp[7] = "[" + i + "]";
							temp[8] = "featuresObj";
							temp[9] = temp[9];
							temp[10] = temp[10];
							temp[11] = temp[11];
							temp[12] = temp[12];

//							temp[5] = Integer.toString(size);// result.toString();

							temp[13] = code;
							temp[14] = trim;
							temp[15] = year;
							temp[16] = modelCode;
							temp[17] = description;

							temp[18] = model;
							temp[19] = make;
							temp[20] = variation;

							for (int empty1 = 21; empty1 <= 127; empty1++) {
								temp[empty1] = "";
							}

							String segvalue = segmentsObject.getString(j).toString();
							temp[128] = "[" + j + "]";
							temp[129] = segvalue;

							com_libs.writeToSheet(wsResultfile, temp);
						}

//	=============================Pricing object=============================
//						JSONArray segmentsObject = result.getJSONObject(i).getJSONArray("segments");
						JSONObject pricingObject = result.getJSONObject(i).getJSONObject("pricing");
						int pricingObjectSize = pricingObject.length();
//						modelsObj = Integer.toString(modelsObjSize);
						if (pricingObjectSize > 2) {
							temp[125] = "pricingObjectSize > 2";
						} else {
							temp[0] = Integer.toString(countNum);
							temp[1] = env;
							temp[2] = client;
							temp[3] = modelidOrymmid;
							temp[4] = "";
							temp[5] = "";
							temp[6] = "";
							temp[7] = "[" + i + "]";
							temp[8] = "featuresObj";
							temp[9] = temp[9];
							temp[10] = temp[10];
							temp[11] = temp[11];
							temp[12] = temp[12];

//							temp[5] = Integer.toString(size);// result.toString();

							temp[13] = code;
							temp[14] = trim;
							temp[15] = year;
							temp[16] = modelCode;
							temp[17] = description;

							temp[18] = model;
							temp[19] = make;
							temp[20] = variation;

							for (int empty = 21; empty <= 124; empty++) {
								temp[empty] = "";
							}
							temp[128] = "";
							temp[129] = "";

							try {
								temp[125] = "pricing";
								temp[126] = Integer.toString(pricingObject.getInt("destinationCharge"));
								temp[127] = Integer.toString(pricingObject.getInt("msrp"));
							} catch (Exception e) {
								temp[125] = "pricing missing";
								temp[126] = "xxx";
								temp[127] = "xxx";
							}
							com_libs.writeToSheet(wsResultfile, temp);
						}

					}
				}
			} catch (Exception ex) {
				System.out.println("error occurs!");
				noObj++;
				temp[0] = Integer.toString(countNum);
				temp[1] = env;
				temp[2] = client;
				temp[3] = modelidOrymmid;
				temp[4] = "200 error";
				for (int emp = 5; emp <= 129; emp++) {
					temp[emp] = "";
				}
				System.out.println("S/N: " + countNum);
				System.out.println("ERROR 200 ON : " + URLString);
				com_libs.writeToSheet(wsResultfile, temp);
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
