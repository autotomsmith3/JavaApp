package compareBS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class compareBS_image_outPutAcodeNameAndSheet {
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
		String cc_SavePathFile = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + env + "_ImageSheet.xls";
//		String acode_or_styleid_savePath = "C:\\1\\Eclipse\\Test Results\\CompareBS\\";
		String[] titleStringPostImageWS = { "S/N", "Env", "Client", "acodeStryleid", "URL404error", "vehiclesArr",
				"vehiclesObj#", "code", "year", "description", "mediaObj", "currentColor", "variation", "trim",
				"modelCode", "model", "make", "mediaOptName", "REARObj", "REAR_code", "REAR_name", "REAR_imageType",
				"REAR_url", "REAR_SEATSObj", "REAR_SEATS_code", "REAR_SEATS_name", "REAR_SEATS_imageType",
				"REAR_SEATS_url", "FRONT_3QTR_LEFTObj", "FRONT_3QTR_LEFT_code", "FRONT_3QTR_LEFT_name",
				"FRONT_3QTR_LEFT_imageType", "FRONT_3QTR_LEFT_url", "FRONTObj", "FRONT_code", "FRONT_name",
				"FRONT_imageType", "FRONT_url", "FRONT_3QTR_RIGHTObj", "FRONT_3QTR_RIGHT_code", "FRONT_3QTR_RIGHT_name",
				"FRONT_3QTR_RIGHT_imageType", "FRONT_3QTR_RIGHT_url", "SIDE_PROFILE_RIGHTObj",
				"SIDE_PROFILE_RIGHT_code", "SIDE_PROFILE_RIGHT_name", "SIDE_PROFILE_RIGHT_imageType",
				"SIDE_PROFILE_RIGHT_url", "FULL_DASHBOARDObj", "FULL_DASHBOARD_code", "FULL_DASHBOARD_name",
				"FULL_DASHBOARD_imageType", "FULL_DASHBOARD_url", "DRIVERS_SEATObj", "DRIVERS_SEAT_code",
				"DRIVERS_SEAT_name", "DRIVERS_SEAT_imageType", "DRIVERS_SEAT_url", "DRIVERS_DASHBOARDObj",
				"DRIVERS_DASHBOARD_code", "DRIVERS_DASHBOARD_name", "DRIVERS_DASHBOARD_imageType",
				"DRIVERS_DASHBOARD_url", "SIDE_PROFILE_LEFTObj", "SIDE_PROFILE_LEFT_code", "SIDE_PROFILE_LEFT_name",
				"SIDE_PROFILE_LEFT_imageType", "SIDE_PROFILE_LEFT_url", "ENGINE_BAYObj", "ENGINE_BAY_code",
				"ENGINE_BAY_name", "ENGINE_BAY_imageType", "ENGINE_BAY_url", "REAR_3QTR_RIGHTObj",
				"REAR_3QTR_RIGHT_code", "REAR_3QTR_RIGHT_code", "REAR_3QTR_RIGHT_name", "REAR_3QTR_RIGHT_imageType",
				"REAR_3QTR_RIGHT_url", "PASSENGER_DASHBOARDObj", "PASSENGER_DASHBOARD_code", "PASSENGER_DASHBOARD_name",
				"PASSENGER_DASHBOARD_imageType", "PASSENGER_DASHBOARD_url", "STEREOObj", "STEREO_code", "STEREO_name",
				"STEREO_imageType", "STEREO_url", "TRUNK_OPENObj", "TRUNK_OPEN_code", "TRUNK_OPEN_name",
				"TRUNK_OPEN_imageType", "TRUNK_OPEN_url", "CENTER_CONSOLEObj", "CENTER_CONSOLE_code",
				"CENTER_CONSOLE_name", "CENTER_CONSOLE_imageType", "CENTER_CONSOLE_url", "REAR_3QTR_LEFTObj",
				"REAR_3QTR_LEFT_code", "REAR_3QTR_LEFT_name", "REAR_3QTR_LEFT_imageType", "REAR_3QTR_LEFT_url" };
		Properties prop = new Properties();
		try {
			prop.load(compareBS_image_outPutAcodeNameAndSheet.class.getClassLoader()
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
			String jsonImageWS = com_libs.getNewSourceCodeJsonPostImage(env, client, imageCode, imageCode, PostImageURL,
					"image", imageCode, count, headers[0], headers[1], headers[2], headers[3]);
			PostImage(env, client, imageCode, cc_SavePathFile, titleStringPostImageWS, jsonImageWS, "URLString",
					"parameterS", count);
		}

	}

	public static void PostImage(String env, String client, String acodeStryleid, String wsResultfile,
			String[] titleString, String text, String URLString, String parameterS, int countNum) throws IOException {
		com_libs.writeTitle(wsResultfile, titleString);
		String team001 = "";
		String team002 = "";
		String team003 = "";
		String team004 = "";
		String team005 = "";
		String team006 = "";
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
		String team017 = "";
		String team018 = "";
		String team019 = "";
		String team020 = "";
		String team021 = "";
		String team022 = "";
		String team023 = "";
		String team024 = "";
		String team025 = "";
		String team026 = "";
		String team027 = "";
		String team028 = "";
		String team029 = "";
		String team030 = "";
		String team031 = "";
		String team032 = "";
		String team033 = "";
		String team034 = "";
		String team035 = "";
		String team036 = "";
		String team037 = "";
		String team038 = "";
		String team039 = "";
		String team040 = "";
		String team041 = "";
		String team042 = "";
		String team043 = "";
		String team044 = "";
		String team045 = "";
		String team046 = "";
		String team047 = "";
		String team048 = "";
		String team049 = "";
		String team050 = "";
		String team051 = "";
		String team052 = "";
		String team053 = "";
		String team054 = "";
		String team055 = "";
		String team056 = "";
		String team057 = "";
		String team058 = "";
		String team059 = "";
		String team060 = "";
		String team061 = "";
		String team062 = "";
		String team063 = "";
		String team064 = "";
		String team065 = "";
		String team066 = "";
		String team067 = "";
		String team068 = "";
		String team069 = "";
		String team070 = "";
		String team071 = "";
		String team072 = "";
		String team073 = "";
		String team074 = "";
		String team075 = "";
		String team076 = "";
		String team077 = "";
		String team078 = "";
		String team079 = "";
		String team080 = "";
		String team081 = "";
		String team082 = "";
		String team083 = "";
		String team084 = "";
		String team085 = "";
		String team086 = "";
		String team087 = "";
		String team088 = "";
		String team089 = "";
		String team090 = "";
		String team091 = "";
		String team092 = "";
		String team093 = "";
		String team094 = "";
		String team095 = "";
		String team096 = "";
		String team097 = "";
		String team098 = "";
		String team099 = "";
		String team100 = "";
		String team101 = "";
		String team102 = "";
		String team103 = "";
		String team104 = "";
		String team105 = "";
		String team106 = "";
		String team107 = "";
		String team108 = "";
		String team109 = "";
		String team110 = "";
		String team111 = "";
		String team112 = "";

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

						temp[18] = "";
						temp[19] = "";
						temp[20] = "";
						temp[21] = "";

						temp[22] = "";
						temp[23] = "";
						temp[24] = "";
						;
						temp[25] = "";

						temp[26] = "";
						temp[27] = "";
						temp[28] = "";
						temp[29] = "";

						temp[30] = "";
						temp[31] = "";
						temp[32] = "";
						temp[33] = "";

						temp[34] = "";
						temp[35] = "";
						temp[36] = "";
						temp[37] = "";

						temp[38] = "";
						temp[39] = "";
						temp[40] = "";
						temp[41] = "";

						temp[42] = "";
						temp[43] = "";
						temp[44] = "";
						temp[45] = "";

						temp[46] = "";
						temp[47] = "";
						temp[48] = "";
						temp[49] = "";

						temp[50] = "";
						temp[51] = "";
						temp[52] = "";
						temp[53] = "";

						temp[54] = "";
						temp[55] = "";
						temp[56] = "";
						temp[57] = "";

						temp[58] = "";
						temp[59] = "";
						temp[60] = "";
						temp[61] = "";

						temp[62] = "";
						temp[63] = "";
						temp[64] = "";
						temp[65] = "";

						temp[66] = "";
						temp[67] = "";
						temp[68] = "";
						temp[69] = "";

						temp[70] = "";
						temp[71] = "";
						temp[72] = "";
						temp[73] = "";

						temp[74] = "";
						temp[75] = "";
						temp[76] = "";
						temp[77] = "";

						temp[78] = "";
						temp[79] = "";
						temp[80] = "";
						temp[81] = "";
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
							try {
								temp[17] = "null";
								temp[18] = "null";
								temp[19] = "null";
								temp[20] = "null";
							} catch (Exception e) {

							}

							try {
								temp[21] = mediasubObj.getJSONObject("REAR_SEATS").getString("code");
								temp[22] = mediasubObj.getJSONObject("REAR_SEATS").getString("name");
								temp[23] = mediasubObj.getJSONObject("REAR_SEATS").getString("imageType");
								temp[24] = mediasubObj.getJSONObject("REAR_SEATS").getString("url");
							} catch (Exception e) {

								temp[21] = "null";
								temp[22] = "null";
								temp[23] = "null";
								temp[24] = "null";

							}
							try {
								temp[25] = mediasubObj.getJSONObject("SIDE_PROFILE_RIGHT").getString("code");
								temp[26] = mediasubObj.getJSONObject("SIDE_PROFILE_RIGHT").getString("name");
								temp[27] = mediasubObj.getJSONObject("SIDE_PROFILE_RIGHT").getString("imageType");
								temp[28] = mediasubObj.getJSONObject("SIDE_PROFILE_RIGHT").getString("url");
							} catch (Exception e) {

								temp[25] = "null";
								temp[26] = "null";
								temp[27] = "null";
								temp[28] = "null";

							}
							try {
								temp[29] = mediasubObj.getJSONObject("FULL_DASHBOARD").getString("code");
								temp[30] = mediasubObj.getJSONObject("FULL_DASHBOARD").getString("name");
								temp[31] = mediasubObj.getJSONObject("FULL_DASHBOARD").getString("imageType");
								temp[32] = mediasubObj.getJSONObject("FULL_DASHBOARD").getString("url");
							} catch (Exception e) {

								temp[29] = "null";
								temp[30] = "null";
								temp[31] = "null";
								temp[32] = "null";

							}
							try {
								temp[33] = mediasubObj.getJSONObject("FRONT_3QTR_LEFT").getString("code");
								temp[34] = mediasubObj.getJSONObject("FRONT_3QTR_LEFT").getString("name");
								temp[35] = mediasubObj.getJSONObject("FRONT_3QTR_LEFT").getString("imageType");
								temp[36] = mediasubObj.getJSONObject("FRONT_3QTR_LEFT").getString("url");
							} catch (Exception e) {

								temp[33] = "null";
								temp[34] = "null";
								temp[35] = "null";
								temp[36] = "null";

							}
							try {
								temp[37] = mediasubObj.getJSONObject("FRONT").getString("code");
								temp[38] = mediasubObj.getJSONObject("FRONT").getString("name");
								temp[39] = mediasubObj.getJSONObject("FRONT").getString("imageType");
								temp[40] = mediasubObj.getJSONObject("FRONT").getString("url");
							} catch (Exception e) {

								temp[37] = "null";
								temp[38] = "null";
								temp[39] = "null";
								temp[40] = "null";

							}
							try {
								temp[41] = mediasubObj.getJSONObject("DRIVERS_SEAT").getString("code");
								temp[42] = mediasubObj.getJSONObject("DRIVERS_SEAT").getString("name");
								temp[43] = mediasubObj.getJSONObject("DRIVERS_SEAT").getString("imageType");
								temp[44] = mediasubObj.getJSONObject("DRIVERS_SEAT").getString("url");
							} catch (Exception e) {

								temp[41] = "null";
								temp[42] = "null";
								temp[43] = "null";
								temp[44] = "null";

							}
							try {
								temp[45] = mediasubObj.getJSONObject("DRIVERS_DASHBOARD").getString("code");
								temp[46] = mediasubObj.getJSONObject("DRIVERS_DASHBOARD").getString("name");
								temp[47] = mediasubObj.getJSONObject("DRIVERS_DASHBOARD").getString("imageType");
								temp[48] = mediasubObj.getJSONObject("DRIVERS_DASHBOARD").getString("url");
							} catch (Exception e) {
								temp[45] = "null";
								temp[46] = "null";
								temp[47] = "null";
								temp[48] = "null";

							}
							try {
								temp[49] = mediasubObj.getJSONObject("SIDE_PROFILE_LEFT").getString("code");
								temp[50] = mediasubObj.getJSONObject("SIDE_PROFILE_LEFT").getString("name");
								temp[51] = mediasubObj.getJSONObject("SIDE_PROFILE_LEFT").getString("imageType");
								temp[52] = mediasubObj.getJSONObject("SIDE_PROFILE_LEFT").getString("url");
							} catch (Exception e) {

								temp[49] = "null";
								temp[50] = "null";
								temp[51] = "null";
								temp[52] = "null";

							}
							try {
								temp[53] = mediasubObj.getJSONObject("ENGINE_BAY").getString("code");
								temp[54] = mediasubObj.getJSONObject("ENGINE_BAY").getString("name");
								temp[55] = mediasubObj.getJSONObject("ENGINE_BAY").getString("imageType");
								temp[56] = mediasubObj.getJSONObject("ENGINE_BAY").getString("url");
							} catch (Exception e) {
								temp[53] = "null";
								temp[54] = "null";
								temp[55] = "null";
								temp[56] = "null";

							}
							try {
								temp[57] = mediasubObj.getJSONObject("REAR_3QTR_RIGHT").getString("code");
								temp[58] = mediasubObj.getJSONObject("REAR_3QTR_RIGHT").getString("name");
								temp[59] = mediasubObj.getJSONObject("REAR_3QTR_RIGHT").getString("imageType");
								temp[60] = mediasubObj.getJSONObject("REAR_3QTR_RIGHT").getString("url");
							} catch (Exception e) {
								temp[57] = "null";
								temp[58] = "null";
								temp[59] = "null";
								temp[60] = "null";

							}
							try {
								temp[61] = mediasubObj.getJSONObject("FRONT_3QTR_RIGHT").getString("code");
								temp[62] = mediasubObj.getJSONObject("FRONT_3QTR_RIGHT").getString("name");
								temp[63] = mediasubObj.getJSONObject("FRONT_3QTR_RIGHT").getString("imageType");
								temp[64] = mediasubObj.getJSONObject("FRONT_3QTR_RIGHT").getString("url");
							} catch (Exception e) {

								temp[61] = "null";
								temp[62] = "null";
								temp[63] = "null";
								temp[64] = "null";

							}
							try {
								temp[65] = mediasubObj.getJSONObject("PASSENGER_DASHBOARD").getString("code");
								temp[66] = mediasubObj.getJSONObject("PASSENGER_DASHBOARD").getString("name");
								temp[67] = mediasubObj.getJSONObject("PASSENGER_DASHBOARD").getString("imageType");
								temp[68] = mediasubObj.getJSONObject("PASSENGER_DASHBOARD").getString("url");
							} catch (Exception e) {
								temp[65] = "null";
								temp[66] = "null";
								temp[67] = "null";
								temp[68] = "null";

							}

							try {
								temp[69] = mediasubObj.getJSONObject("STEREO").getString("code");
								temp[70] = mediasubObj.getJSONObject("STEREO").getString("name");
								temp[71] = mediasubObj.getJSONObject("STEREO").getString("imageType");
								temp[72] = mediasubObj.getJSONObject("STEREO").getString("url");
							} catch (Exception e) {
								temp[69] = "null";
								temp[70] = "null";
								temp[71] = "null";
								temp[72] = "null";

							}
							try {
								temp[73] = mediasubObj.getJSONObject("TRUNK_OPEN").getString("code");
								temp[74] = mediasubObj.getJSONObject("TRUNK_OPEN").getString("name");
								temp[75] = mediasubObj.getJSONObject("TRUNK_OPEN").getString("imageType");
								temp[76] = mediasubObj.getJSONObject("TRUNK_OPEN").getString("url");
							} catch (Exception e) {
								temp[73] = "null";
								temp[74] = "null";
								temp[75] = "null";
								temp[76] = "null";

							}
							try {
								temp[77] = mediasubObj.getJSONObject("CENTER_CONSOLE").getString("code");
								temp[78] = mediasubObj.getJSONObject("CENTER_CONSOLE").getString("name");
								temp[79] = mediasubObj.getJSONObject("CENTER_CONSOLE").getString("imageType");
								temp[80] = mediasubObj.getJSONObject("CENTER_CONSOLE").getString("url");
							} catch (Exception e) {
								temp[77] = "null";
								temp[78] = "null";
								temp[79] = "null";
								temp[80] = "null";

							}
							try {
								temp[81] = mediasubObj.getJSONObject("REAR_3QTR_LEFT").getString("code");
								temp[82] = mediasubObj.getJSONObject("REAR_3QTR_LEFT").getString("name");
								temp[83] = mediasubObj.getJSONObject("REAR_3QTR_LEFT").getString("imageType");
								temp[84] = mediasubObj.getJSONObject("REAR_3QTR_LEFT").getString("url");
							} catch (Exception e) {

								temp[81] = "null";
								temp[82] = "null";
								temp[83] = "null";
								temp[84] = "null";

							}

							com_libs.writeToSheet(wsResultfile, temp);
							System.out.println("make=");

						}

					}

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
			prop.load(compareBS_image_outPutAcodeNameAndSheet.class.getClassLoader()
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
