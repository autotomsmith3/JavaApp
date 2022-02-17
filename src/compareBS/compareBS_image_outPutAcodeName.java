package compareBS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class compareBS_image_outPutAcodeName {
	private static int blank = 0;
	private static int noObj = 0;

	public static void PostImage(String env, String client, String envClientTextURL, String headers[],
			String imageCodes[]) throws Exception {
		String VehicleSetCode = "";
		String LngCode = "";
		String CountryCode = "";
		String year = "";
		String makeId = "";
		String parameterString = "";
		String cc_SavePathFile = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + env + "_" + client + "_ImageSheet.xls";
//		String acode_or_styleid_savePath = "C:\\1\\Eclipse\\Test Results\\CompareBS\\";
		String[] titleStringPostImageWS = { "S/N", "Env", "Client", "acodeStryleid", "URL404error", "vehiclesArr",
				"vehiclesObj#", "code", "year", "description", "mediaObj", "currentColor", "variation", "trim",
				"modelCode", "model", "make", "mediaOptName", "REARObj", "REAR_code", "REAR_name", "REAR_imageType",
				"REAR_url", "REAR_SEATSObj", "REAR_SEATS_code", "REAR_SEATS_name", "REAR_SEATS_imageType",
				"REAR_SEATS_url", "SIDE_PROFILE_RIGHTObj", "SIDE_PROFILE_RIGHT_code", "SIDE_PROFILE_RIGHT_name",
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
			prop.load(compareBS_image_outPutAcodeName.class.getClassLoader()
					.getResourceAsStream("compareBS_data/compareBS_text.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		com_libs comlibs = new com_libs();

		String headerss = "";
//		String commonCompetitorsCodes[] = comlibs.loadTextFromDataFolder("empty", "./compareBS_data/" + client + "CommonCompetitors.txt");
		int testDataTotal = imageCodes.length;

		String envURL = envClientTextURL;// QA

		int count = 0;

		System.out.println(client + " - TestDataTotal = " + testDataTotal);
		parameterString = VehicleSetCode + "/" + LngCode + "/" + CountryCode + "/" + year;
		String PostImageURL = envURL;// + VehicleSetCode + "/" + LngCode + "/" + CountryCode + "/" + year;

		for (String imageCode : imageCodes) {
			count++;
			System.out.println("\nClient = " + client + "\n");
			String jsonImageWS = com_libs.getNewSourceCodeJsonPostImage(env, client, imageCode, imageCode, PostImageURL,
					"image", imageCode, count, headers[0], headers[1], headers[2], headers[3]);
//			PostImage(env, client, imageCode, cc_SavePathFile, titleStringPostImageWS, jsonImageWS, "URLString",
//					"parameterS", count);
		}

	}

	public static void PostImage(String env, String client, String acodeStryleid, String wsResultfile,
			String[] titleString, String text, String URLString, String parameterS, int countNum) throws IOException {
		com_libs.writeTitle(wsResultfile, titleString);

		String team007 = "";
		String team008 = "";
		String team009 = "";
		String team010 = "";
		String team011 = "";
		String team012 = "";
		String team013 = "";
		String team014 = "";
		String team015 = "";
		String team016 = "";
//		
		int x = 0;
		String[] temp = new String[135];
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

//				==============vehiclesArray==============
//				==============vehiclesArray==============
				JSONObject vehiclesObj = new JSONObject(text);
				int vehiclesSize = vehiclesObj.length();

				JSONArray vehiclesArr = vehiclesObj.getJSONArray("vehicles");

				int vehiclesize = vehiclesArr.length();

				for (int i = 0; i < vehiclesize; i++) {

					System.out.println("\ni = " + i + ";\n");
					team007 = vehiclesArr.getJSONObject(i).getString("code");
					System.out.println("code=" + team007);

					if (team007.equalsIgnoreCase("CAD00NIC161B0")) {
						System.out.println("wait here=");
					}

					team008 = vehiclesArr.getJSONObject(i).getString("year");
					System.out.println("year=" + team008);
					team009 = vehiclesArr.getJSONObject(i).getString("description");
					System.out.println("description=" + team009);

					try {
						team011 = vehiclesArr.getJSONObject(i).getString("currentColor");
						System.out.println("currentColor=" + team011);
					} catch (Exception e) {
						team011 = "null";
						System.err.println("currentColor = " + team011 + ". empty!!!");
					}

					team012 = vehiclesArr.getJSONObject(i).getString("variation");
					System.out.println("variation=" + team011);
					team013 = vehiclesArr.getJSONObject(i).getString("trim");
					System.out.println("trim=" + team012);
					team014 = vehiclesArr.getJSONObject(i).getString("modelCode");
					System.out.println("modelCode=" + team013);
					team015 = vehiclesArr.getJSONObject(i).getString("model");
					System.out.println("model=" + team014);
					team016 = vehiclesArr.getJSONObject(i).getString("make");
					System.out.println("make=" + team015);

//						==========================media object==========================
//						==========================media object==========================						

					JSONObject mediaObj = vehiclesArr.getJSONObject(i).getJSONObject("media");
					int mediaSize = mediaObj.length();
					if (mediaSize == 0) {
						temp[0] = Integer.toString(countNum);
						temp[1] = env;
						temp[2] = client;
						temp[3] = acodeStryleid;
						temp[4] = "";
						temp[5] = "vehiclesArr";
						temp[6] = "[" + i + "]";
						temp[7] = team007;
						temp[8] = team008;
						temp[9] = team009;
						temp[10] = "null";
						temp[11] = team011;
						temp[12] = team012;
						temp[13] = team013;

						temp[14] = team014;
						temp[15] = team015;
						temp[16] = team016;
						temp[17] = "";

						for (int p0 = 18; p0 <= 126; p0++) {
							temp[p0] = "";
						}

						com_libs.writeToSheet(wsResultfile, temp);

					}
					for (int j = 0; j < mediaSize; j++) {
						JSONArray mediaOptionArr = mediaObj.names();// get ["SWP"]
						int mSize = mediaOptionArr.length();
						for (int n = 0; n < mSize; n++) {
							String optionString = mediaOptionArr.getString(n); // get SWP - this is how to get dynomic
																				// object
							System.out.println("optionString=\n" + optionString);
							JSONObject mediasubObj = mediaObj.getJSONObject(optionString); // SWP - this is how to get
																							// dynomic object
							int mediasubObjsize = mediasubObj.length();

							temp[0] = Integer.toString(countNum);
							temp[1] = env;
							temp[2] = client;
							temp[3] = acodeStryleid;
							temp[4] = "";
							temp[5] = "vehiclesArr";
							temp[6] = "[" + i + "]";
							temp[7] = team007;
							temp[8] = team008;
							temp[9] = team009;
							temp[10] = "has media";
							temp[11] = team011;
							temp[12] = team012;
							temp[13] = team013;

							temp[14] = team014;
							temp[15] = team015;
							temp[16] = team016;
							temp[17] = optionString;
							x = 12;
							try {
								x = x + 5; // 16
								temp[x + 1] = "REAR"; // 17
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

						}

					}

//					colors
//					
					x = 113;
//					String colorsObj 
					// fails here 2
					JSONObject colorObjStr = vehiclesArr.getJSONObject(0).getJSONObject("colors"); // get
																									// exteriors
					int colorsSize = colorObjStr.length();
					for (int z = 0; z < colorsSize; z++) {
						JSONArray colorsArr = colorObjStr.names();
						int colorArrSize = colorsArr.length();
						for (int a = 0; a < colorArrSize; a++) {
							String exteriorsStr = colorsArr.getString(z);// get exterior Arrary name;

							JSONArray exteriorArr = colorObjStr.getJSONArray(exteriorsStr);// .getJSONObject(exteriorsStr);//.getJSONObject(exteriorsStr);
							int exteriorSize = exteriorArr.length();
							for (int b = 0; b < exteriorSize; b++) {
								temp[113] = "colors";

								temp[114] = exteriorsStr;

								temp[115] = "[" + b + "]";
								// fails here
								temp[116] = exteriorArr.getJSONObject(b).getString("code");
								temp[117] = exteriorArr.getJSONObject(b).getString("name");

								JSONObject colorsObj_exteriorsArr_mediaObj = exteriorArr.getJSONObject(b)
										.getJSONObject("media");
								int cSize = colorsObj_exteriorsArr_mediaObj.length();
								temp[118] = colorsObj_exteriorsArr_mediaObj.getString("primary");
								for (int bb = 0; bb < cSize; bb++) {
									if (cSize > 1) {
										temp[118] = "mediaObj>1, need to handel!";
										temp[119] = colorsObj_exteriorsArr_mediaObj.getString("primary");

									} else {
										temp[118] = "primary";
										temp[119] = colorsObj_exteriorsArr_mediaObj.getString("primary");
									}

								}

								temp[120] = exteriorArr.getJSONObject(b).getString("family");

								temp[0] = Integer.toString(countNum);
								temp[1] = env;
								temp[2] = client;
								temp[3] = acodeStryleid;
								temp[4] = "";
								temp[5] = "vehiclesArr";
								temp[6] = "[" + i + "]";
								temp[7] = team007;
								temp[8] = team008;
								temp[9] = team009;
								temp[10] = "has media";
								temp[11] = team011;
								temp[12] = team012;
								temp[13] = team013;

								temp[14] = team014;
								temp[15] = team015;
								temp[16] = team016;

								temp[121] = "";
								temp[122] = "";
								temp[123] = "";
								temp[124] = "";
								temp[125] = "";
								temp[126] = "";

								System.out.println("\n temp[113]=" + temp[113] + "\n temp[114]=" + temp[114]
										+ "\n temp[115]=" + temp[115] + "\n temp[116]=" + temp[116] + "\n temp[117]="
										+ temp[117]);
								com_libs.writeToSheet(wsResultfile, temp);

							}

							System.out.println("xxx");
						}

						System.out.println("xxx");

					}

					x = 121;
//					String colorsObj 
					JSONObject pricingObjStr = vehiclesArr.getJSONObject(i).getJSONObject("pricing"); // get
																										// exteriors
					int pricingSize = pricingObjStr.length();
					for (int zz = 0; zz < pricingSize; zz++) {
						if (pricingSize > 2) {
							temp[121] = "pricingObj>1, need to handel!";
							temp[122] = Integer.toString(pricingObjStr.getInt("destinationCharge"));
							temp[123] = Integer.toString(pricingObjStr.getInt("msrp"));

						} else {
							temp[121] = "pricing";
							temp[122] = Integer.toString(pricingObjStr.getInt("destinationCharge"));
							temp[123] = Integer.toString(pricingObjStr.getInt("msrp"));
						}

					}

					temp[0] = Integer.toString(countNum);
					temp[1] = env;
					temp[2] = client;
					temp[3] = acodeStryleid;
					temp[4] = "";
					temp[5] = "vehiclesArr";
					temp[6] = "[" + i + "]";
					temp[7] = team007;
					temp[8] = team008;
					temp[9] = team009;
					temp[10] = "has media";
					temp[11] = team011;
					temp[12] = team012;
					temp[13] = team013;

					temp[14] = team014;
					temp[15] = team015;
					temp[16] = team016;

					for (int p = 17; p <= 120; p++) {
						temp[p] = "";
					}

//					segments
//					
					x = 124;

					JSONArray segmentsArr = vehiclesArr.getJSONObject(i).getJSONArray("segments"); // get
																									// exteriors
					int segmentsArrSize = segmentsArr.length();
					for (int zzz = 0; zzz < segmentsArrSize; zzz++) {
						if (segmentsArrSize > 2) {
							temp[124] = "segmentsArrSize >2, need to handel!";
							temp[125] = segmentsArr.getString(zzz);

						} else {
							temp[124] = "[" + zzz + "]";
//							String segArr=segmentsArr.getString(zzz);

							temp[125] = segmentsArr.getString(zzz);
//	
						}

					}

					System.out.println("xxx");

					com_libs.writeToSheet(wsResultfile, temp);
					System.out.println("make=");

				}

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
			prop.load(compareBS_image_outPutAcodeName.class.getClassLoader()
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
			String imageURL = prop.getProperty(env + ".ImageURL");
			String imageCodes[] = comlibs.loadTextFromDataFolder("empty",
					"./compareBS_data/" + env + "." + client + "CommonCompetitors.txt");
			String Headers[] = fetchOneDemArrayFromPropFile(env + "." + client + ".Headers", prop);
			PostImage(env, client, imageURL, Headers, imageCodes);
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
