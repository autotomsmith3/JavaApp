package compareBS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

//
public class mySQLquery {
	
	public static String[] PullOneModelCodeToAcodesOrStyleids_From_Prod_CPP_DB_Get_Styleids(String env, String client, String ModelCode)
			throws Exception {
//		This is now perfect No. 1 since 2023-03-16.  _From_Prod_CPP_DB_Get_Styleids
//		It uses CPP Prod DB vindescriptionlookup.VSSLookup to get Styleids from Ymmid. Lost Stylieids less than StagingDB	


		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		Statement stmt = null;

		String[] AcodesOrStyleidsReal = new String[100];

		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
			// Connect From Staging CPP DB:
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMYS1.autodatacorp.org:3306",
					"cpp_readonly", "test123"); // Staging CPP MySQL DB
			stmt = conn.createStatement();
		} else {
			acode_or_ymmid = "ymmid";
			// Connect From QA CPP DB: no longer update since June 2022
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-dscp-xmys1.autodatacorp.org:3306",
					"readonly", "D*&5646AIFO2FCDER$%&0");
			stmt = conn.createStatement();
		}

//			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
//			Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMY1.autodatacorp.org:3306",
//					"cpp_readonly", "test123"); // Staging CPP MySQL DB
//			Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USD30ACC18
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, GVUID,CreatedDT "
					+ "FROM globalvehicle.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
//			} else {
//				// it's YMMID 5-6 digits ymmid = 35130
//				query = "SELECT DISTINCT vehicle_id FROM modelwalk_v113.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
//						+ ModelCode + "\")";
			//
//			}

			ResultSet rs = stmt.executeQuery(query);
//			
			int num = 0;
			while (rs.next()) {
				// do something with the extracted data...
				if (acode_or_ymmid.equalsIgnoreCase("acode")) {
					Acode = rs.getString("WarehouseKeyStr");
				} else {
					Acode = rs.getString("vehicle_id");//
					System.out.println(Acode);
				}

				if (Acode.length() > 13) {
//					Acode = Acode.substring(0, 13);
					System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
				} else {
					Acodes[num] = Acode;
					num++;
				}

				System.out.println(Acode);
			}
//			Save real size of String 
			int len = num;
			AcodesOrStyleidsReal = new String[len];
			for (int i = 0; i < len; i++) {
				AcodesOrStyleidsReal[i] = Acodes[i];
			}
		} else {

			// it's ymmid=34544
			query = "SELECT  DISTINCT styleid,ymmid FROM vindescriptionlookup.VSSLookup WHERE  ymmid=\""+ModelCode+"\"";

			ResultSet rs = stmt.executeQuery(query);
//			
			int num = 0;
			while (rs.next()) {
				// do something with the extracted data...
				if (acode_or_ymmid.equalsIgnoreCase("ymmid")) {
					Acode = rs.getString("styleid");
				} else {
//					Acode = rs.getString("vehicle_id");//
					System.out.println("something wrong!!!");
					System.out.println(Acode);
				}

				if (Acode.length() > 13) {
//					Acode = Acode.substring(0, 13);
					System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
				} else {
					Acodes[num] = Acode;
					num++;
				}

				System.out.println(Acode);
			}
//			Save real size of String 
			int len = num;
			AcodesOrStyleidsReal = new String[len];
			for (int i = 0; i < len; i++) {
				AcodesOrStyleidsReal[i] = Acodes[i];
			}
		
		}
		return AcodesOrStyleidsReal;
	}
	
	public static String[] PullOneModelCodeToAcodesOrStyleids_From_Staging_CPP_DB_Get_Styleids(String env, String client, String ModelCode)
			throws Exception {
//		This is now perfect No. 2 since 2023-03-17.  _From_Staging_CPP_DB_Get_Styleids
//		It uses CPP Staging DB vindescriptionlookup.VSSLookup to get Styleids from Ymmid. Lost Stylieids more than ProdDB	


		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		Statement stmt = null;

		String[] AcodesOrStyleidsReal = new String[100];

		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
			// Connect From Staging CPP DB:
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMYS1.autodatacorp.org:3306",
					"cpp_readonly", "test123"); // Staging CPP MySQL DB
			stmt = conn.createStatement();
		} else {
			acode_or_ymmid = "ymmid";
			// Connect From QA CPP DB: no longer update since June 2022
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-ppcp-xmys1.autodatacorp.org:3306",
					"cpp_readonly", "test123");
			stmt = conn.createStatement();
		}

//			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
//			Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMY1.autodatacorp.org:3306",
//					"cpp_readonly", "test123"); // Staging CPP MySQL DB
//			Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USD30ACC18
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, GVUID,CreatedDT "
					+ "FROM globalvehicle.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
//			} else {
//				// it's YMMID 5-6 digits ymmid = 35130
//				query = "SELECT DISTINCT vehicle_id FROM modelwalk_v113.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
//						+ ModelCode + "\")";
			//
//			}

			ResultSet rs = stmt.executeQuery(query);
//			
			int num = 0;
			while (rs.next()) {
				// do something with the extracted data...
				if (acode_or_ymmid.equalsIgnoreCase("acode")) {
					Acode = rs.getString("WarehouseKeyStr");
				} else {
					Acode = rs.getString("vehicle_id");//
					System.out.println(Acode);
				}

				if (Acode.length() > 13) {
//					Acode = Acode.substring(0, 13);
					System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
				} else {
					Acodes[num] = Acode;
					num++;
				}

				System.out.println(Acode);
			}
//			Save real size of String 
			int len = num;
			AcodesOrStyleidsReal = new String[len];
			for (int i = 0; i < len; i++) {
				AcodesOrStyleidsReal[i] = Acodes[i];
			}
		} else {

			// it's ymmid=34544
			query = "SELECT  DISTINCT styleid,ymmid FROM vindescriptionlookup.VSSLookup WHERE  ymmid=\""+ModelCode+"\"";

			ResultSet rs = stmt.executeQuery(query);
//			
			int num = 0;
			while (rs.next()) {
				// do something with the extracted data...
				if (acode_or_ymmid.equalsIgnoreCase("ymmid")) {
					Acode = rs.getString("styleid");
				} else {
//					Acode = rs.getString("vehicle_id");//
					System.out.println("something wrong!!!");
					System.out.println(Acode);
				}

				if (Acode.length() > 13) {
//					Acode = Acode.substring(0, 13);
					System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
				} else {
					Acodes[num] = Acode;
					num++;
				}

				System.out.println(Acode);
			}
//			Save real size of String 
			int len = num;
			AcodesOrStyleidsReal = new String[len];
			for (int i = 0; i < len; i++) {
				AcodesOrStyleidsReal[i] = Acodes[i];
			}
		
		}
		return AcodesOrStyleidsReal;
	}

	public static String[] PullOneModelCodeToAcodesOrStyleids_From_StagingCPPURL_ModleWalk_get_Styleids(String env,
			String client, String ModelCode) throws Exception {
//		This was perfect No. 1 since 2023-03-10.  -It  Used to be Best No 2.	
//		This "_From_StagingCPPURL_ModleWalk_get_Styleids" seems better because it will return more styleids than prod url.
//				Staging DB even /Primary call fails. - Use this. - 2022-10-25.
// 		This is now perfect No. 1 since modelwalk DB has been removed fro CPP Prod DB - 2023-03-10
//		int wSize = titleString.length;
//		String[] jsonValue = new String[wSize];

		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		Statement stmt = null;

		String[] AcodesOrStyleidsReal = new String[100];

		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
			// Connect From Staging CPP DB:
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMYS1.autodatacorp.org:3306",
					"cpp_readonly", "test123"); // Staging CPP MySQL DB
			stmt = conn.createStatement();
		} else {
			acode_or_ymmid = "ymmid";
			// Connect From QA CPP DB: no longer update since June 2022
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-q1cp-xmy1.autodatacorp.org:3306",
					"qa_admin", "dund@s");
			stmt = conn.createStatement();
		}

//		Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
//		Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMY1.autodatacorp.org:3306",
//				"cpp_readonly", "test123"); // Staging CPP MySQL DB
//		Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USD30ACC18
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, GVUID,CreatedDT "
					+ "FROM globalvehicle.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
//		} else {
//			// it's YMMID 5-6 digits ymmid = 35130
//			query = "SELECT DISTINCT vehicle_id FROM modelwalk_v113.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
//					+ ModelCode + "\")";
//
//		}

			ResultSet rs = stmt.executeQuery(query);
//		
			int num = 0;
			while (rs.next()) {
				// do something with the extracted data...
				if (acode_or_ymmid.equalsIgnoreCase("acode")) {
					Acode = rs.getString("WarehouseKeyStr");
				} else {
					Acode = rs.getString("vehicle_id");//
					System.out.println(Acode);
				}

				if (Acode.length() > 13) {
//				Acode = Acode.substring(0, 13);
					System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
				} else {
					Acodes[num] = Acode;
					num++;
				}

				System.out.println(Acode);
			}
//		Save real size of String 
			int len = num;
			AcodesOrStyleidsReal = new String[len];
			for (int i = 0; i < len; i++) {
				AcodesOrStyleidsReal[i] = Acodes[i];
			}
		} else {
			// it's YMMID 5-6 digits ymmid = 35130
//			query = "SELECT DISTINCT vehicle_id FROM modelwalk_v113.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
//					+ ModelCode + "\")";

//			get styleids from cpp model walk service
//			String env = "Prod";

//			Prod url:
//			String cppModelWalkURL = "https://cpp-stable.autodatacorp.org/model-walk/rest/trims/STYLEID/EN";

//			Staging url:
			String cppModelWalkURL = "https://cpp-latest.autodatacorp.org//model-walk/rest/trims/STYLEID/EN";

			
//			String[] Style_IDs = GetStyleidWSFromYmmid(env, client, cppModelWalkURL, ymmid);
			AcodesOrStyleidsReal = GetStyleidWSFromYmmid(env, client, cppModelWalkURL, ModelCode);
		}
		return AcodesOrStyleidsReal;
	}
	public static String[] PullOneModelCodeToAcodesOrStyleids_From_ProdCPPURL_ModleWalk_get_Styleids(String env,
			String client, String ModelCode) throws Exception {
//		This is now perfect No. 2 since 2023-03-10.  -It  Used to be Best No 2.	
//		This "_From_ProdCPPURL_ModleWalk_get_Styleids" seems some of ymmids return empty styleid.
// 		This is now perfect No. 2 since modelwalk DB has been removed fro CPP Prod DB - 2023-03-10
//		int wSize = titleString.length;
//		String[] jsonValue = new String[wSize];

		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		Statement stmt = null;

		String[] AcodesOrStyleidsReal = new String[100];

		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
			// Connect From Staging CPP DB:
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMYS1.autodatacorp.org:3306",
					"cpp_readonly", "test123"); // Staging CPP MySQL DB
			stmt = conn.createStatement();
		} else {
			acode_or_ymmid = "ymmid";
			// Connect From QA CPP DB: no longer update since June 2022
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-q1cp-xmy1.autodatacorp.org:3306",
					"qa_admin", "dund@s");
			stmt = conn.createStatement();
		}

//		Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
//		Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMY1.autodatacorp.org:3306",
//				"cpp_readonly", "test123"); // Staging CPP MySQL DB
//		Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USD30ACC18
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, GVUID,CreatedDT "
					+ "FROM globalvehicle.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
//		} else {
//			// it's YMMID 5-6 digits ymmid = 35130
//			query = "SELECT DISTINCT vehicle_id FROM modelwalk_v113.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
//					+ ModelCode + "\")";
//
//		}

			ResultSet rs = stmt.executeQuery(query);
//		
			int num = 0;
			while (rs.next()) {
				// do something with the extracted data...
				if (acode_or_ymmid.equalsIgnoreCase("acode")) {
					Acode = rs.getString("WarehouseKeyStr");
				} else {
					Acode = rs.getString("vehicle_id");//
					System.out.println(Acode);
				}

				if (Acode.length() > 13) {
//				Acode = Acode.substring(0, 13);
					System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
				} else {
					Acodes[num] = Acode;
					num++;
				}

				System.out.println(Acode);
			}
//		Save real size of String 
			int len = num;
			AcodesOrStyleidsReal = new String[len];
			for (int i = 0; i < len; i++) {
				AcodesOrStyleidsReal[i] = Acodes[i];
			}
		} else {
			// it's YMMID 5-6 digits ymmid = 35130
//			query = "SELECT DISTINCT vehicle_id FROM modelwalk_v113.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
//					+ ModelCode + "\")";

//			get styleids from cpp model walk service
//			String env = "Prod";

//			Prod url:
			String cppModelWalkURL = "https://cpp-stable.autodatacorp.org/model-walk/rest/trims/STYLEID/EN";

//			Staging url:
//			String cppModelWalkURL = "http://cpp-latest.autodatacorp.org//model-walk/rest/trims/STYLEID/EN";

			
//			String[] Style_IDs = GetStyleidWSFromYmmid(env, client, cppModelWalkURL, ymmid);
			AcodesOrStyleidsReal = GetStyleidWSFromYmmid(env, client, cppModelWalkURL, ModelCode);
		}
		return AcodesOrStyleidsReal;
	}

	public static String[] PullOneModelCodeToAcodesOrStyleids_From_CPP_Prod_DB_MW_both_Acode_and_Styleid(String env,
			String client, String ModelCode) throws Exception {
//		No longer Perfect! No 1.	This "_From_CPP_Prod_DB_MW_both_Acode_and_Styleid" 
//		No longer perfect since modelwalk DB has been removed from CPP DB in Prod  - 2023-03-10.
//			CPP_QA_DB should not be used since QA Model Walk DB 
//			is no longer be available from June, 2022 (no new update)
//			int wSize = titleString.length;
//			String[] jsonValue = new String[wSize];

		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
		} else {
			acode_or_ymmid = "ymmid";
		}

		Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
		Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-dscp-xmys1.autodatacorp.org:3306", "readonly",
				"D*&5646AIFO2FCDER$%&0");
		Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USC90HYS17
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, CreatedDT,Gvuid "
					+ "FROM globalvehicle.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
		} else {
			// it's YMMID 5-6 digits ymmid = 35130
			query = "SELECT DISTINCT vehicle_id FROM modelwalk.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
					+ ModelCode + "\")";

		}

		ResultSet rs = stmt.executeQuery(query);
//		
		int num = 0;
		while (rs.next()) {
			// do something with the extracted data...
			if (acode_or_ymmid.equalsIgnoreCase("acode")) {
				Acode = rs.getString("WarehouseKeyStr");
			} else {
				Acode = rs.getString("vehicle_id");//
				System.out.println(Acode);
			}

			if (Acode.length() > 13) {
//				Acode = Acode.substring(0, 13);
				System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
			} else {
				Acodes[num] = Acode;
				num++;
			}

			System.out.println(Acode);
		}
//		Save real size of String 
		int len = num;
		String[] AcodesOrStyleidsReal = new String[len];
		for (int i = 0; i < len; i++) {
			AcodesOrStyleidsReal[i] = Acodes[i];
		}

		return AcodesOrStyleidsReal;
	}

	public static String[] PullOneModelCodeToAcodesOrStyleids_From_CPP_Staging_DB_MW_cp_from_Prod_both_Acode_and_Styleid(
			String env, String client, String ModelCode) throws Exception {
//		No longer Perfect! No 2. since modelwalk has been removed from CPP Prod DB.
//		This "_From_CPP_Staging_DB_MW_cp_from_Prod_both_Acode_and_Styleid" 
//		Exactly same with Perfect! No1. on 2023-01-06 but some errors will occur because of performance issue? Don't know.
//		Just need to re-run the failed one.
//		
//			CPP_QA_DB should not be used since QA Model Walk DB 
//			is no longer be available from June, 2022 (no new update)
//			int wSize = titleString.length;
//			String[] jsonValue = new String[wSize];

		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
		} else {
			acode_or_ymmid = "ymmid";
		}

		Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
		Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-ppcp-xmys1.autodatacorp.org:3306",
				"cpp_readonly", "test123");
		Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USC90HYS17
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, CreatedDT,Gvuid "
					+ "FROM globalvehicle.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
		} else {
			// it's YMMID 5-6 digits ymmid = 35130
			query = "SELECT DISTINCT vehicle_id FROM modelwalk.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
					+ ModelCode + "\")";

		}

		ResultSet rs = stmt.executeQuery(query);
//		
		int num = 0;
		while (rs.next()) {
			// do something with the extracted data...
			if (acode_or_ymmid.equalsIgnoreCase("acode")) {
				Acode = rs.getString("WarehouseKeyStr");
			} else {
				Acode = rs.getString("vehicle_id");//
				System.out.println(Acode);
			}

			if (Acode.length() > 13) {
//				Acode = Acode.substring(0, 13);
				System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
			} else {
				Acodes[num] = Acode;
				num++;
			}

			System.out.println(Acode);
		}
//		Save real size of String 
		int len = num;
		String[] AcodesOrStyleidsReal = new String[len];
		for (int i = 0; i < len; i++) {
			AcodesOrStyleidsReal[i] = Acodes[i];
		}

		return AcodesOrStyleidsReal;
	}

	public static String[] PullOneModelCodeToAcodesOrStyleids_From_CPP_Model_Walk_get_both_Ordering_and_Styleids(
			String env, String client, String ModelCode) throws Exception {
//	OK.	This "_From_CPP_Model_Walk_get_both_Ordering_and_Styleids" is not perfect because 
//		it will fail to get Ordering Acodes when /primary call failed to return. The Acodes will instead with model. - 2022-10-25.

//		int wSize = titleString.length;
//		String[] jsonValue = new String[wSize];

		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		Statement stmt = null;

		String[] AcodesOrStyleidsReal = new String[100];

		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
			// Connect From Staging CPP DB:
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMY1.autodatacorp.org:3306",
					"cpp_readonly", "test123"); // Staging CPP MySQL DB
			stmt = conn.createStatement();
		} else {
			acode_or_ymmid = "ymmid";
			// Connect From QA CPP DB: no longer update since June 2022
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-q1cp-xmy1.autodatacorp.org:3306",
					"qa_admin", "dund@s");
			stmt = conn.createStatement();
		}

//		Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
//		Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMY1.autodatacorp.org:3306",
//				"cpp_readonly", "test123"); // Staging CPP MySQL DB
//		Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USD30ACC18. This model walk service would not
			// include Discontinued trims (confirmed).
			String cppModelWalkURL = "https://cpp-stable.autodatacorp.org/model-walk/rest/trims/ORDERING/EN";

			AcodesOrStyleidsReal = GetStyleidWSFromYmmid(env, client, cppModelWalkURL, ModelCode);

//			AcodesOrStyleidsReal = new String[len];
//			for (int i = 0; i < len; i++) {
//				AcodesOrStyleidsReal[i] = Acodes[i];
//			}
		} else {
			// it's YMMID 5-6 digits ymmid = 35130

//			get styleids from cpp model walk service. This model walk service would not include Discontinued trims (confirmed). 
//			String env = "Prod";

			String cppModelWalkURL = "https://cpp-stable.autodatacorp.org/model-walk/rest/trims/STYLEID/EN";

			AcodesOrStyleidsReal = GetStyleidWSFromYmmid(env, client, cppModelWalkURL, ModelCode);
		}
		return AcodesOrStyleidsReal;
	}

	public static String[] PullOneModelCodeToAcodesOrStyleids_From_CPP_Staging_DB_MW_both_Acode_and_Styleid(String env,
			String client, String ModelCode) throws Exception {
//		Not good.	This "_From_CPP_Staging_DB_MW_both_Acode_and_Styleid" 
//		Missing a lot of Styleids vs to best. It looks not good.
//			CPP_QA_DB should not be used since QA Model Walk DB 
//			is no longer be available from June, 2022 (no new update)
//			int wSize = titleString.length;
//			String[] jsonValue = new String[wSize];

		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
		} else {
			acode_or_ymmid = "ymmid";
		}

		Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
		Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-ppcp-xmys1.autodatacorp.org:3306",
				"cpp_readonly", "test123");
		Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USC90HYS17
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, CreatedDT,Gvuid "
					+ "FROM globalvehicle.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
		} else {
			// it's YMMID 5-6 digits ymmid = 35130
			query = "SELECT DISTINCT vehicle_id FROM modelwalk.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
					+ ModelCode + "\")";

		}

		ResultSet rs = stmt.executeQuery(query);
//		
		int num = 0;
		while (rs.next()) {
			// do something with the extracted data...
			if (acode_or_ymmid.equalsIgnoreCase("acode")) {
				Acode = rs.getString("WarehouseKeyStr");
			} else {
				Acode = rs.getString("vehicle_id");//
				System.out.println(Acode);
			}

			if (Acode.length() > 13) {
//				Acode = Acode.substring(0, 13);
				System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
			} else {
				Acodes[num] = Acode;
				num++;
			}

			System.out.println(Acode);
		}
//		Save real size of String 
		int len = num;
		String[] AcodesOrStyleidsReal = new String[len];
		for (int i = 0; i < len; i++) {
			AcodesOrStyleidsReal[i] = Acodes[i];
		}

		return AcodesOrStyleidsReal;
	}

	public static String[] PullOneModelCodeToAcodesOrStyleids_From_CPP_QA_DB(String ModelCode) throws Exception {
//		Worse one.	This "_From_CPP_QA_DB" should not be used since QA Model Walk DB is no longer be available from June, 2022 (no new update)
//			int wSize = titleString.length;
//			String[] jsonValue = new String[wSize];

		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
		} else {
			acode_or_ymmid = "ymmid";
		}

		Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
		Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-q1cp-xmy1.autodatacorp.org:3306", "qa_admin",
				"dund@s");
		Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USC90HYS17
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, CreatedDT,Gvuid "
					+ "FROM globalvehicle_v111.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
		} else {
			// it's YMMID 5-6 digits ymmid = 35130
			query = "SELECT DISTINCT vehicle_id FROM modelwalk_v113.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
					+ ModelCode + "\")";

		}

		ResultSet rs = stmt.executeQuery(query);
//			
		int num = 0;
		while (rs.next()) {
			// do something with the extracted data...
			if (acode_or_ymmid.equalsIgnoreCase("acode")) {
				Acode = rs.getString("WarehouseKeyStr");
			} else {
				Acode = rs.getString("vehicle_id");//
				System.out.println(Acode);
			}

			if (Acode.length() > 13) {
//					Acode = Acode.substring(0, 13);
				System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
			} else {
				Acodes[num] = Acode;
				num++;
			}

			System.out.println(Acode);
		}
//			Save real size of String 
		int len = num;
		String[] AcodesOrStyleidsReal = new String[len];
		for (int i = 0; i < len; i++) {
			AcodesOrStyleidsReal[i] = Acodes[i];
		}

		return AcodesOrStyleidsReal;
	}

	public static String[] PullOneModelCodeToAcodesOrStyleids_From_CPP_Staging_DB_for_Ordering(String ModelCode)
			throws Exception {
//	Not good.	This "_CPP_Staging_DB_for_Ordering" is ok for Ordering Acodes but not for Styleids since Styleid is still using old QA DB which is not updated since June, 2022.

//		int wSize = titleString.length;
//		String[] jsonValue = new String[wSize];

		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		Statement stmt = null;
		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
			// Connect From Staging CPP DB:
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMY1.autodatacorp.org:3306",
					"cpp_readonly", "test123"); // Staging CPP MySQL DB
			stmt = conn.createStatement();
		} else {
			acode_or_ymmid = "ymmid";
			// Connect From QA CPP DB: no longer update since June 2022
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-q1cp-xmy1.autodatacorp.org:3306",
					"qa_admin", "dund@s");
			stmt = conn.createStatement();
		}

//		Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
//		Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMY1.autodatacorp.org:3306",
//				"cpp_readonly", "test123"); // Staging CPP MySQL DB
//		Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USD30ACC18
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, GVUID,CreatedDT "
					+ "FROM globalvehicle.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
		} else {
			// it's YMMID 5-6 digits ymmid = 35130
			query = "SELECT DISTINCT vehicle_id FROM modelwalk_v113.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
					+ ModelCode + "\")";

		}

		ResultSet rs = stmt.executeQuery(query);
//		
		int num = 0;
		while (rs.next()) {
			// do something with the extracted data...
			if (acode_or_ymmid.equalsIgnoreCase("acode")) {
				Acode = rs.getString("WarehouseKeyStr");
			} else {
				Acode = rs.getString("vehicle_id");//
				System.out.println(Acode);
			}

			if (Acode.length() > 13) {
//				Acode = Acode.substring(0, 13);
				System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
			} else {
				Acodes[num] = Acode;
				num++;
			}

			System.out.println(Acode);
		}
//		Save real size of String 
		int len = num;
		String[] AcodesOrStyleidsReal = new String[len];
		for (int i = 0; i < len; i++) {
			AcodesOrStyleidsReal[i] = Acodes[i];
		}

		return AcodesOrStyleidsReal;
	}

	public static String[] PullOneModelCodeToAcodesOrStyleids(String env, String client, String ModelCode)
			throws Exception {
//		This is now perfect No. 2 since 2023-03-17.  _From_Staging_CPP_DB_Get_Styleids
//		It uses CPP Staging DB vindescriptionlookup.VSSLookup to get Styleids from Ymmid. Lost Stylieids more than ProdDB	


		String[] Acodes = new String[500];
		String query = "";
		String CountryCode = "";
		String Acode = "";
		int ModelCodeLen = ModelCode.length();
		String acode_or_ymmid;
		Statement stmt = null;

		String[] AcodesOrStyleidsReal = new String[100];

		if (ModelCodeLen == 10) {
			acode_or_ymmid = "acode";
			// Connect From Staging CPP DB:
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMYS1.autodatacorp.org:3306",
					"cpp_readonly", "test123"); // Staging CPP MySQL DB
			stmt = conn.createStatement();
		} else {
			acode_or_ymmid = "ymmid";
			// Connect From QA CPP DB: no longer update since June 2022
			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
			Connection conn = DriverManager.getConnection("jdbc:mysql://lnoc-ppcp-xmys1.autodatacorp.org:3306",
					"cpp_readonly", "test123");
			stmt = conn.createStatement();
		}

//			Class.forName("com.mysql.jdbc.Driver");// Class.forName("com.mysql.cj.jdbc.Driver"); not work
//			Connection conn = DriverManager.getConnection("jdbc:mysql://LNOC-PPCP-XMY1.autodatacorp.org:3306",
//					"cpp_readonly", "test123"); // Staging CPP MySQL DB
//			Statement stmt = conn.createStatement();
		if (acode_or_ymmid.equalsIgnoreCase("acode")) {
			// it's modelcode 10 digit Acode = USD30ACC18
			query = "SELECT DISTINCT WarehouseKeyStr, CountryCode, GVUID,CreatedDT "
					+ "FROM globalvehicle.globalvehicle WHERE WarehouseKeyStr LIKE  \"" + ModelCode + "%" + "\"";
//			} else {
//				// it's YMMID 5-6 digits ymmid = 35130
//				query = "SELECT DISTINCT vehicle_id FROM modelwalk_v113.vehiclesearchcriteria WHERE ISOLngCode=\"en\" AND vehiclesetcode=\"Styleid\" AND Model_Year_ID IN (\""
//						+ ModelCode + "\")";
			//
//			}

			ResultSet rs = stmt.executeQuery(query);
//			
			int num = 0;
			while (rs.next()) {
				// do something with the extracted data...
				if (acode_or_ymmid.equalsIgnoreCase("acode")) {
					Acode = rs.getString("WarehouseKeyStr");
				} else {
					Acode = rs.getString("vehicle_id");//
					System.out.println(Acode);
				}

				if (Acode.length() > 13) {
//					Acode = Acode.substring(0, 13);
					System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
				} else {
					Acodes[num] = Acode;
					num++;
				}

				System.out.println(Acode);
			}
//			Save real size of String 
			int len = num;
			AcodesOrStyleidsReal = new String[len];
			for (int i = 0; i < len; i++) {
				AcodesOrStyleidsReal[i] = Acodes[i];
			}
		} else {

			// it's ymmid=34544
			query = "SELECT  DISTINCT styleid,ymmid FROM vindescriptionlookup.VSSLookup WHERE  ymmid=\""+ModelCode+"\"";

			ResultSet rs = stmt.executeQuery(query);
//			
			int num = 0;
			while (rs.next()) {
				// do something with the extracted data...
				if (acode_or_ymmid.equalsIgnoreCase("ymmid")) {
					Acode = rs.getString("styleid");
				} else {
//					Acode = rs.getString("vehicle_id");//
					System.out.println("something wrong!!!");
					System.out.println(Acode);
				}

				if (Acode.length() > 13) {
//					Acode = Acode.substring(0, 13);
					System.out.print(Acode + "			- Acode length > 13, ignore!  - ");
				} else {
					Acodes[num] = Acode;
					num++;
				}

				System.out.println(Acode);
			}
//			Save real size of String 
			int len = num;
			AcodesOrStyleidsReal = new String[len];
			for (int i = 0; i < len; i++) {
				AcodesOrStyleidsReal[i] = Acodes[i];
			}
		
		}
		return AcodesOrStyleidsReal;
	}

	public static String[] GetStyleidWSFromYmmid(String env, String client, String cppModelWalkURL, String ymmid)
			throws Exception {
		String country = GetCountryCodeFromClientName(client);
		Properties prop = new Properties();
		try {
			prop.load(compareBS_commonCompetitors_outPutAcodeName.class.getClassLoader()
					.getResourceAsStream("compareBS_data/compareBS_text.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String envURL = cppModelWalkURL + "/" + country + "/" + ymmid;// QA

		String[] jsonModelWalkWSStyleids = getStyleidsFromYmmid(env, client, ymmid, envURL, "", "getStyleidFromYmmid",
				1, "", "", "", "");
		return jsonModelWalkWSStyleids;
	}

	public static String[] getStyleidsFromYmmid(String environment, String client, String cc_code, String url1,
			String url2, String auth_key, int s_number, String lang, String appid, String product_key,
			String profile_Key) throws Exception {

		int wt = 2;
		String dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;

		String acode_or_styleid = cc_code.replace("/", "");

		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_CommonCompetitors_StatusCode.txt";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + s_number + "_" + environment + "."
				+ client + "_CompareBS_CommonCompetitors_Returns_" + acode_or_styleid + ".txt";

		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy-MM-dd");
		timeStamp = sdf.format(cal.getTime());
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		Date d = new Date();
		dateStamp = df.format(d);
		timeStamp = dateStamp + "  " + timeStamp;
		filePath_statusCode = filePath_statusCode.replace(".txt", "");
		filePath_statusCode = filePath_statusCode + "_" + sdfmt.format(d) + ".txt";

		filePath_return = filePath_return.replace(".txt", "");
		filePath_return = filePath_return + "_" + sdfmt.format(d) + ".txt";

		final String USER_AGENT = "Mozilla/5.0";
		String[] styleids = new String[1];
		String urlS = url1;
		URL obj = new URL(urlS);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("GET");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//			*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//			con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//			con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//			con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//			con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//			*************QA*************

		con.setDoOutput(true);
//			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//			wr.writeBytes(BSBody);
//			wr.flush();
//			wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
//			String acode_or_styleid = cc_code.replace("/","");

//			acode_or_styleid = getSubText(acode_or_styleid, '"');// "\"" - "
//			filePath_return = filePath_return + "_" + acode_or_styleid + "_" + sdfmt.format(d) + ".txt";

		if (!(responseCode == 404) && !(responseCode == 403) && !(responseCode == 402) && !(responseCode == 401)
				&& !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//					System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();

			System.out.println(client + ". " + s_number + " - Return data Size = " + len + "  - Return Status Code: "
					+ responseCode);

			// model walk stop here
			// parse the outputString here:
			styleids = GetStyleids(client, outputString, "text", "URLString", "parameterS", 10);
			int s = styleids.length;
			System.out.println("\n");
			for (int i = 0; i < s; i++) {
				System.out.println("Styleid " + (i + 1) + " = " + styleids[i]);
			}
			System.out.println("\nEnd=\n");
		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			String[] errorStreamJson = { "1", "2", "3" };
			;

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getErrorStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//					System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			String errorStream = postData.toString();
			con.disconnect();
			styleids[0] = acode_or_styleid + "-No Trims";
//				errorStreamJson = GetJsonErrorDetails(errorStream);

			outputString = "";
			System.out.println(client + ". " + s_number
					+ " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode
					+ ". ErrorCode = " + errorStreamJson[2]);

		}
		return styleids;
	}

	public static String[] GetStyleids(String client, String wsResultfile, String text, String URLString,
			String parameterS, int countNum) throws IOException {

		String serverTime = "";
		String error = "";
		String executionTimeMS = "";
		String resultObj = "";
		String id = "";
		String mfgCode = "";
		String trim = "";
		String variation = "";

		String modelsObj = "";
		String modelYearId = "";

		String[] temp = new String[30];
		String[][] jsonValue = new String[100][1];
		int size = 0;
		if (text.equals("")) {
			temp[0] = Integer.toString(countNum);
			temp[1] = URLString;
			temp[2] = "";
			temp[3] = "404 error";
			System.out.println("S/N: " + countNum);
			System.out.println("404 ERROR ON : " + URLString);

		} else {
			try {
				JSONObject obj = new JSONObject(wsResultfile);

				JSONArray result = obj.getJSONArray("result");
				size = result.length();

				if (size == 0) {

					temp[0] = Integer.toString(countNum);
					temp[1] = URLString;
					temp[2] = "";
					temp[3] = "result [] object is blank";

					System.out.println("gvuid = " + "  " + " - Result [] object is blank. ");

				} else {
					for (int i = 0; i < size; i++) {
						try {
							id = result.getJSONObject(i).getString("id");
						} catch (Exception ex) {
							id = "null";
						}
						try {
							mfgCode = result.getJSONObject(i).getString("mfgCode");
						} catch (Exception ex) {
							mfgCode = "null";
						}
						try {
							trim = result.getJSONObject(i).getString("trim");
						} catch (Exception ex) {
							trim = "null";
						}
						try {
							variation = result.getJSONObject(i).getString("variation");
						} catch (Exception ex) {
							variation = "null";
						}
//							JSONArray modelsObject = result.getJSONObject(i).getJSONArray("models");
//							int modelsObjSize = modelsObject.length();
//							modelsObj = Integer.toString(modelsObjSize);
						for (int j = 0; j < 1; j++) {
//								try {
//									modelYearId = modelsObject.getJSONObject(j).getString("modelYearId");
//								} catch (Exception ex) {
//									modelYearId = "";
//								}
//								try {
//									model = modelsObject.getJSONObject(j).getString("model");
//								} catch (Exception ex) {
//									model = "";
//								}

							System.out.println("No.=" + (i + 1) + ".  id: " + id);

//								String[] jsonValue = new String[11];

							jsonValue[i][0] = id;
//		

						}
					}
				}
			} catch (Exception ex) {
				System.out.println("error occurs!");

				temp[0] = Integer.toString(countNum);
				temp[1] = URLString;
				temp[2] = "";
				temp[3] = "200 error";
				System.out.println("S/N: " + countNum);
				System.out.println("ERROR 200 ON : " + URLString);

			}

		}
		String styleids[] = new String[size];
		for (int i = 0; i < size; i++) {
			styleids[i] = jsonValue[i][0];
		}

		return styleids;
	}

	public static String GetCountryCodeFromClientName(String client) throws IOException {
		String country = "CA";
		switch (client) {
		case "Kia":
			country = "CA";
			break;
		case "KiaUS":
			country = "US";
			break;
		case "Mazda":
			country = "US";
			break;
		case "MazdaCA":
			country = "CA";
			break;
		case "Mitsubishi":
			country = "CA";
			break;
		case "MitsubishiShowRoom":
			country = "CA";
			break;
		case "Subaru":
			country = "CA";
			break;
		case "SubaruUS":
			country = "US";
			break;
		case "Hyundai":
			country = "US";
			break;
		case "GenesisUS":
			country = "US";
			break;
		case "ToyotaCA":
			country = "CA";
			break;
		case "LexusCA":
			country = "CA";
			break;
		case "VolkswagenCA":
			country = "CA";
			break;
		case "AudiUS":
			country = "US";
			break;
		case "JeepUS":
			country = "US";
			break;
		default:
			country = "US";
		}
		return country;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String Acode = "USC90HYC012A0+STDTN-6AT";// USD30ACC18
//		System.out.println("ignore now");
//
//		String Acodes[];
//
////		Acodes = PullOneModelCodeToAcodesOrStyleids("35130");
//		Acodes = PullOneModelCodeToAcodesOrStyleids("35047"); //no return currently: 35676, has return: 35047
//		// can be: USC90HYC02, 35130
//		int len = Acodes.length;
//		System.out.println("\nTotal Aocdes = " + len);
//		for (int i = 0; i < len; i++) {
//
//			System.out.println(Acodes[i]);
//
//		} 
		String env = "Prod";

		String cppModelWalkURL = "https://cpp-stable.autodatacorp.org/model-walk/rest/trims/STYLEID/EN";
		String ymmid = "3436";
		String client = "Mazda";

		String[] Style_IDs = GetStyleidWSFromYmmid(env, client, cppModelWalkURL, ymmid);

	}

}

//		String sqlSelectAllPersons = "SELECT * FROM person";
//		String connectionUrl = "jdbc:mysql://lnoc-q1cp-xmy1.autodatacorp.org:3306/modelwalk_v113?serverTimezone=UTC";
//
//
//		try (Connection conn = DriverManager.getConnection(connectionUrl, "qa_admin", "dund@s"); 
//		        PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons); 
//		        ResultSet rs = ps.executeQuery()) {
//
//		        while (rs.next()) {
//		            long id = rs.getLong("ID");
//		            String name = rs.getString("FIRST_NAME");
//		            String lastName = rs.getString("LAST_NAME");
//
//		            // do something with the extracted data...
//		        }
//		} catch (SQLException e) {
//		    // handle the exception
//		}	
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
//		
//		
//		
//		
//	}
//
//}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Date;
//
//public class mySQLquery {
//    private Connection connect = null;
//    private Statement statement = null;
//    private PreparedStatement preparedStatement = null;
//    private ResultSet resultSet = null;
//
//    public void readDataBase() throws Exception {
//        try {
//            // This will load the MySQL driver, each DB has its own driver
//            Class.forName("com.mysql.jdbc.Driver");
//            // Setup the connection with the DB
//            // lnoc-q1cp-xmy1.autodatacorp.org:3306/modelwalk_v113", "qa_admin", "dund@s"
//            
//            connect = DriverManager
//                    .getConnection("jdbc:mysql://lnoc-q1cp-xmy1.autodatacorp.org/modelwalk_v113?"
//                            + "user=qa_admin&password=dund@s");
//
//            // Statements allow to issue SQL queries to the database
//            statement = connect.createStatement();
//            // Result set get the result of the SQL query
//            resultSet = statement
//                    .executeQuery("SELECT * FROM modelwalk_v113.vehiclesearchcriteria");
//            writeResultSet(resultSet);
//
//            // PreparedStatements can use variables and are more efficient
//            preparedStatement = connect
//                    .prepareStatement("insert into  feedback.comments values (default, ?, ?, ?, ? , ?, ?)");
//            // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
//            // Parameters start with 1
//            preparedStatement.setString(1, "Test");
//            preparedStatement.setString(2, "TestEmail");
//            preparedStatement.setString(3, "TestWebpage");
//            preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
//            preparedStatement.setString(5, "TestSummary");
//            preparedStatement.setString(6, "TestComment");
//            preparedStatement.executeUpdate();
//
//            preparedStatement = connect
//                    .prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from feedback.comments");
//            resultSet = preparedStatement.executeQuery();
//            writeResultSet(resultSet);
//
//            // Remove again the insert comment
//            preparedStatement = connect
//            .prepareStatement("delete from feedback.comments where myuser= ? ; ");
//            preparedStatement.setString(1, "Test");
//            preparedStatement.executeUpdate();
//
//            resultSet = statement
//            .executeQuery("select * from feedback.comments");
//            writeMetaData(resultSet);
//
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            close();
//        }
//
//    }
//
//    private void writeMetaData(ResultSet resultSet) throws SQLException {
//        //  Now get some metadata from the database
//        // Result set get the result of the SQL query
//
//        System.out.println("The columns in the table are: ");
//
//        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
//        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
//            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
//        }
//    }
//
//    private void writeResultSet(ResultSet resultSet) throws SQLException {
//        // ResultSet is initially before the first data set
//        while (resultSet.next()) {
//            // It is possible to get the columns via name
//            // also possible to get the columns via the column number
//            // which starts at 1
//            // e.g. resultSet.getSTring(2);
//            String user = resultSet.getString("myuser");
//            String website = resultSet.getString("webpage");
//            String summary = resultSet.getString("summary");
//            Date date = resultSet.getDate("datum");
//            String comment = resultSet.getString("comments");
//            System.out.println("User: " + user);
//            System.out.println("Website: " + website);
//            System.out.println("summary: " + summary);
//            System.out.println("Date: " + date);
//            System.out.println("Comment: " + comment);
//        }
//    }
//
//    // You need to close the resultSet
//    private void close() {
//        try {
//            if (resultSet != null) {
//                resultSet.close();
//            }
//
//            if (statement != null) {
//                statement.close();
//            }
//
//            if (connect != null) {
//                connect.close();
//            }
//        } catch (Exception e) {
//
//        }
//    }
//
//}
