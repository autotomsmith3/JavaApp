package compareBS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
//import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.json.*;

//import competitiveCompareGoAllTrimsUI.competitiveCompareUIController;

public class com_libs {
	public static String getSourceCode(String prefix, String url) {
		String inputLine = "";
		String inputLineOne = "";
		try {
			URL MyURL = new URL(prefix + url);
			BufferedReader in = new BufferedReader(new InputStreamReader(MyURL.openStream(), "UTF8"));
			while ((inputLineOne = in.readLine()) != null) {
				inputLine = inputLine + inputLineOne + "\n";
			}
			in.close();
		} catch (Exception ee) {
			System.out.println("Exception through out: " + ee);
		}
		return inputLine;
	}

	public static String getSourceCode(String urlParameters, String url1, String url2) throws Exception {
		// PUT method - works
		final String USER_AGENT = "Mozilla/5.0";
		URL obj = new URL(url1 + url2);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("PUT");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		// con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		// //Original
		con.setRequestProperty("Accept-Language", "en-US,fr-CA;q=0.7,en;q=0.3");
		// Send post request en-US,fr-CA;q=0.7,en;q=0.3
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 400) && !(responseCode == 503) && !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				postData.append(inputLine);
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
		} else {
			outputString = "";
		}
		return outputString;
	}

	public static String getSourceCodeJson(String urlParameters, String url1, String url2) throws Exception {
		// PUT method Json - works
		final String USER_AGENT = "Mozilla/5.0";
		URL obj = new URL(url1 + url2);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("PUT");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Type", "application/json");
		// con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		// //Original
		con.setRequestProperty("Accept-Language", "en-US,fr-CA;q=0.7,en;q=0.3");
		// Send post request en-US,fr-CA;q=0.7,en;q=0.3
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 400) && !(responseCode == 503) && !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				postData.append(inputLine);
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
		} else {
			outputString = "";
		}
		return outputString;
	}

	public static String getSourceCodeJson(String url1, String auth_key) throws Exception {
		// GET method - Works after removed below #1 to #5
		// add auth_key in Headers
		final String USER_AGENT = "Mozilla/5.0";
		URL obj = new URL(url1);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");//
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("auth_key", auth_key);
		// con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		// //Original
		con.setRequestProperty("Accept-Language", "en-US,fr-CA;q=0.7,en;q=0.3");
		// Send post request en-US,fr-CA;q=0.7,en;q=0.3
		con.setDoOutput(true);
		// #1 DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		// #2 String urlParameters="urlParameters";
		// #3 wr.writeBytes(urlParameters);
		// #4 wr.flush();
		// #5 wr.close();

		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 400) && !(responseCode == 401) && !(responseCode == 402)
				&& !(responseCode == 403) && !(responseCode == 503) && !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				postData.append(inputLine);
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
		} else {
			outputString = "";
		}
		return outputString;
	}

	public static String getSourceCodeJson(String urlParameters, String url1, String url2, String auth_key)
			throws Exception {
		// POST method - works
		// add auth_key in Headers
		final String USER_AGENT = "Mozilla/5.0";
		URL obj = new URL(url1 + url2);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("auth_key", auth_key);
		// con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		// //Original
		con.setRequestProperty("Accept-Language", "en-US,fr-CA;q=0.7,en;q=0.3");
		// Send post request en-US,fr-CA;q=0.7,en;q=0.3
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 400) && !(responseCode == 503) && !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				postData.append(inputLine);
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
		} else {
			outputString = "";
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonPostTextOriginal(String environment, String client, String BSBody,
			String url1, String url2, String auth_key, int s_number, String lang, String appid, String product_key,
			String profile_Key) throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;

		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_Text_StatusCode.txt";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_Text_Returns.txt";

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
		URL obj = new URL(url1 + url2);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("POST");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//				*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//				con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//				con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//				con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//				con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//				*************QA*************

		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(BSBody);
		wr.flush();
		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
		String acode_or_styleid = BSBody.substring(22, 35);
		acode_or_styleid = getSubText(acode_or_styleid, '"');// "\"" - "
		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//						System.out.println("Return data Size = "+inputLine.length());
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
			SaveScratch(filePath_statusCode, client + ". " + acode_or_styleid + ". " + s_number + ". "
					+ " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
			SaveScratch(filePath_return, client + ". " + acode_or_styleid + ". " + s_number + ". "
					+ " - Return data Size = " + len + "  - Return result = " + outputString);
		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";
			System.out.println(client + ". " + s_number
					+ " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);
			SaveScratch(filePath_statusCode, client + ". " + acode_or_styleid + ". " + s_number + ". "
					+ " - Return data Size = " + "- 0." + "  - Return Status Code: " + responseCode + " - Failed.");
			SaveScratch(filePath_return, client + ". " + acode_or_styleid + ". " + s_number + ". "
					+ " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonPostTextOutPutAcodeName(String environment, String client, String BSBody,
			String url1, String url2, String auth_key, int s_number, String lang, String appid, String product_key,
			String profile_Key) throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;

		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_Text_StatusCode.txt";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + s_number + "_" + environment + "."
				+ client + "CompareBS_Text_Returns.txt";

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
//		filePath_return = filePath_return + "_" + BSBody +"_"+sdfmt.format(d) + ".txt";

		final String USER_AGENT = "Mozilla/5.0";
		URL obj = new URL(url1 + url2);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("POST");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//		*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//		con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//		con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//		con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//		*************QA*************

		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(BSBody);
		wr.flush();
		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
		String acode_or_styleid = BSBody.substring(22, 35);
		acode_or_styleid = getSubText(acode_or_styleid, '"');// "\"" - "
		filePath_return = filePath_return + "_" + acode_or_styleid + "_" + sdfmt.format(d) + ".txt";

		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//				System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
			outputString = formatJSON(environment, client, outputString);
//			outputString = "Acode or Styleid = " + acode_or_styleid + "\n" + outputString;//Add to first line

			System.out.println(client + ". " + s_number + " - Return data Size = " + len + "  - Return Status Code: "
					+ responseCode);
			SaveScratch(filePath_statusCode, client + ". " + acode_or_styleid + ". " + s_number + ". "
					+ " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
//			SaveScratch(filePath_return, client + ". " + acode_or_styleid + ". " + s_number + ". "
//					+ " - Return data Size = " + len + "  - Return result = " + outputString);
			SaveScratch(filePath_return, outputString);

		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";
			System.out.println(client + ". " + s_number
					+ " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);
			SaveScratch(filePath_statusCode, client + ". " + acode_or_styleid + ". " + s_number + ". "
					+ " - Return data Size = " + "- 0." + "  - Return Status Code: " + responseCode + " - Failed.");
			SaveScratch(filePath_return, client + ". " + acode_or_styleid + ". " + s_number + ". "
					+ " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonPostTextToComopare(String environment, String client, String BSBody,
			String url1, String url2, String auth_key, int s_number, String lang, String appid, String product_key,
			String profile_Key, String preDateFolder, String currentDateFolder) throws Exception {

		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;
		String acode_or_styleid = BSBody.substring(22, 35);
		acode_or_styleid = getSubText(acode_or_styleid, '"');
		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "\\" + "text" + "\\"
				+ currentDateFolder + "\\" + environment + "." + client + "CompareBS_Text_StatusCode";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "\\" + "text" + "\\"
				+ currentDateFolder + "\\" + s_number + "_" + environment + "." + client + "CompareBS_Text_Returns.txt";

		String inputfilePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "\\" + "text"
				+ "\\" + preDateFolder + "\\" + s_number + "_" + environment + "." + client + "CompareBS_Text_Returns_"
				+ acode_or_styleid + "_" + preDateFolder + ".txt";

		filePath_statusCode = filePath_statusCode + "_" + currentDateFolder + "_CompareTo_" + preDateFolder + ".txt";

		filePath_return = filePath_return.replace(".txt", "");
//		filePath_return = filePath_return + "_" + BSBody +"_"+sdfmt.format(d) + ".txt";

		final String USER_AGENT = "Mozilla/5.0";
		URL obj = new URL(url1 + url2);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("POST");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//		*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//		con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//		con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//		con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//		*************QA*************

		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(BSBody);
		wr.flush();
		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
		String inputString;
//		acode_or_styleid = BSBody.substring(22, 35);
//		acode_or_styleid = getSubText(acode_or_styleid, '"');// "\"" - "
//		filePath_return = filePath_return + "_" + acode_or_styleid + "_" + sdfmt.format(d) + ".txt";//currentDateFolder
		filePath_return = filePath_return + "_" + acode_or_styleid + "_" + currentDateFolder + ".txt";

		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//				System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
			outputString = formatJSON(environment, client, outputString);
//			outputString="Acode or Styleid = "+acode_or_styleid+"\n"+outputString;

//			read previous return
//			inputString = readFile(
//					"C:\\1\\Eclipse\\Test Results\\CompareBS\\QA\\2022-01-19\\1_QA.KiaCompareBS_Text_Returns_CAD00KIC031A0_2022-01-19.txt");
			inputString = readFile(inputfilePath_statusCode);
			try {
				inputString = formatJSON(environment, client, inputString);
			} catch (Exception ex) {

				System.out.println("Unable to format JSON file for " + s_number + ". " + acode_or_styleid
						+ "_inputString = " + inputString);
			}

//			System.out.println(inputString);
//			compare two 
			MyStrComparable comp = new MyStrComparable();
			int pass = comp.compare(outputString, inputString);
			if (pass == 1) {
				// =1 -- passed: All match.

				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + len
								+ "  - Return Status Code: " + responseCode + ". Compare to previous return: Passed!");

			} else if (pass == -1) {

				// =-1 --failed: some of them do not match.
				SaveScratch(filePath_statusCode, client + ". " + acode_or_styleid + ". " + s_number + ". "
						+ " - Return data Size = " + len + "  - Return Status Code: " + responseCode
						+ ". ------Compare to previous return: Failed!!! - lots do not match! Previous one is empty! - current API returns - Working now! - Passed!");
			} else if (pass == 2) {
				// =2 -- failed: lots do not match.
				// result
				SaveScratch(filePath_statusCode, client + ". " + acode_or_styleid + ". " + s_number + ". "
						+ " - Return data Size = " + len + "  - Return Status Code: " + responseCode
						+ ". ------Compare to previous return: Failed! - some of them do not match!!! - Failed!");
			} else {
				// = -- failed: lots do not match.
				// result
				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + len
								+ "  - Return Status Code: " + responseCode
								+ ". ------Compare to previous return: Failed!!!!!! <>-1,<>1,<>2");

			}

			SaveScratch(filePath_return, outputString);

			System.out.println(s_number + " - " + client + ". " + acode_or_styleid
					+ " - Return compare two Strings 1-All match,2-Some not match,-1-Lots not match = " + pass);

		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";

			inputString = readFile(inputfilePath_statusCode);
			if (inputString.contains("Return result = empty")) {
				System.out.println(client + ". " + s_number + ". " + acode_or_styleid
						+ " - Failed! Previous one contains empty result!, return Status Code = " + responseCode);
				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + "- 0."
								+ "  - Return Status Code: " + responseCode
								+ " - Failed! Previous return is also empty! - Passed!");

			} else {

				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + "- 0."
								+ "  - Return Status Code: " + responseCode
								+ " - Failed. Previous retrun does not conturn empty!! - Failed");

			}

			System.out.println(client + ". " + s_number + ". " + acode_or_styleid
					+ " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);

			SaveScratch(filePath_return, client + ". " + acode_or_styleid + ". " + s_number + ". "
					+ " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonGETcommonCompetitors(String environment, String client, String cc_code,
			String url1, String url2, String auth_key, int s_number, String lang, String appid, String product_key,
			String profile_Key) throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
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

		String urlS = url1 + "/" + url2 + "/" + auth_key;
		URL obj = new URL(urlS);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("GET");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//		*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//		con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//		con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//		con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//		*************QA*************

		con.setDoOutput(true);
//		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//		wr.writeBytes(BSBody);
//		wr.flush();
//		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
//		String acode_or_styleid = cc_code.replace("/","");

//		acode_or_styleid = getSubText(acode_or_styleid, '"');// "\"" - "
//		filePath_return = filePath_return + "_" + acode_or_styleid + "_" + sdfmt.format(d) + ".txt";

		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//				System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
			outputString = formatJSON(environment, client, outputString);
			System.out.println(client + ". " + s_number + " - Return data Size = " + len + "  - Return Status Code: "
					+ responseCode);
			SaveScratch(filePath_statusCode, client + ". " + cc_code + ". " + s_number + ". " + " - Return data Size = "
					+ len + "  - Return Status Code: " + responseCode);
			SaveScratch(filePath_return, outputString);
		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";
			System.out.println(client + ". " + s_number
					+ " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);
			SaveScratch(filePath_statusCode, client + ". " + cc_code + ". " + s_number + ". " + " - Return data Size = "
					+ "- 0." + "  - Return Status Code: " + responseCode + " - Failed.");
			SaveScratch(filePath_return, client + ". " + cc_code + ". " + s_number + ". "
					+ " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonGETcommonCompetitorsToCompare(String environment, String client,
			String cc_code, String url1, String url2, String auth_key, int s_number, String lang, String appid,
			String product_key, String profile_Key, String preDateFolder, String currentDateFolder) throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;

		String acode_or_styleid = cc_code.replace("/", "");

		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "\\"
				+ "common_competitors" + "\\" + currentDateFolder + "\\" + environment + "." + client
				+ "_CompareBS_CommonCompetitors_StatusCode";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "\\" + "common_competitors"
				+ "\\" + currentDateFolder + "\\" + s_number + "_" + environment + "." + client + "_"
				+ "CompareBS_CommonCompetitors_Returns.txt";

		String inputfilePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "\\"
				+ "common_competitors" + "\\" + preDateFolder + "\\" + s_number + "_" + environment + "." + client
				+ "_CompareBS_CommonCompetitors_Returns_" + acode_or_styleid + "_" + preDateFolder + ".txt";
		filePath_statusCode = filePath_statusCode + "_" + currentDateFolder + "_" + "Compared_To_" + preDateFolder
				+ ".txt";

		filePath_return = filePath_return.replace(".txt", "");

		final String USER_AGENT = "Mozilla/5.0";

		String urlS = url1 + url2 + auth_key;
		URL obj = new URL(urlS);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("GET");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//		*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//		con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//		con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//		con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//		*************QA*************

		con.setDoOutput(true);

		int responseCode = con.getResponseCode();
		String outputString;
		String inputString;

		filePath_return = filePath_return + "_" + acode_or_styleid + "_" + currentDateFolder + ".txt";

		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//				System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
			outputString = formatJSON(environment, client, outputString);

			inputString = readFile(inputfilePath_statusCode);
			try {
				inputString = formatJSON(environment, client, inputString);
			} catch (Exception ex) {

				System.out.println("Unable to format JSON file for " + s_number + ". " + acode_or_styleid
						+ "_inputString = " + inputString);
			}

//			System.out.println(inputString);
//			compare two 
			MyStrComparable comp = new MyStrComparable();
			int pass = comp.compare(outputString, inputString);
			if (pass == 1) {
				// =1 -- passed: All match.

				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + len
								+ "  - Return Status Code: " + responseCode + ". Compare to previous return: Passed!");

			} else if (pass == -1) {

				// =-1 --failed: some of them do not match.
				SaveScratch(filePath_statusCode, client + ". " + acode_or_styleid + ". " + s_number + ". "
						+ " - Return data Size = " + len + "  - Return Status Code: " + responseCode
						+ ". ------Compare to previous return: Failed!!! - lots do not match! Previous one is empty! - current API returns - Working now! - Passed!");
			} else if (pass == 2) {
				// =2 -- failed: lots do not match.
				// result
				SaveScratch(filePath_statusCode, client + ". " + acode_or_styleid + ". " + s_number + ". "
						+ " - Return data Size = " + len + "  - Return Status Code: " + responseCode
						+ ". ------Compare to previous return: Failed! - some of them do not match!!! - Failed!");
			} else {
				// = -- failed: lots do not match.
				// result
				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + len
								+ "  - Return Status Code: " + responseCode
								+ ". ------Compare to previous return: Failed!!!!!! <>-1,<>1,<>2");

			}

			SaveScratch(filePath_return, outputString);

			System.out.println(s_number + " - " + client + ". " + acode_or_styleid
					+ " - Return compare two Strings 1-All match,2-Some not match,-1-Lots not match = " + pass);

		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";

			inputString = readFile(inputfilePath_statusCode);
			if (inputString.contains("Return result = empty")) {
				System.out.println(client + ". " + s_number + ". " + acode_or_styleid
						+ " - Failed! Previous one contains empty result!, return Status Code = " + responseCode);
				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + "- 0."
								+ "  - Return Status Code: " + responseCode
								+ " - Failed! Previous return is also empty! - Passed!");

			} else {

				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + "- 0."
								+ "  - Return Status Code: " + responseCode
								+ " - Failed. Previous retrun does not conturn empty!! - Failed");

			}

			System.out.println(client + ". " + s_number + ". " + acode_or_styleid
					+ " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);

			SaveScratch(filePath_return, client + ". " + acode_or_styleid + ". " + s_number + ". "
					+ " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;

	}

	public static String getNewSourceCodeJsonGETvehiclesToCompare(String environment, String client, String cc_code,
			String url1, String url2, String auth_key, int s_number, String lang, String appid, String product_key,
			String profile_Key, String preDateFolder, String currentDateFolder) throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;

		String acode_or_styleid = cc_code.replace("/", "");

		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "\\" + "vehicles"
				+ "\\" + currentDateFolder + "\\" + environment + "." + client + "_CompareBS_Vehicles_StatusCode";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "\\" + "vehicles" + "\\"
				+ currentDateFolder + "\\" + s_number + "_" + environment + "." + client + "_" + "Vehicles_Returns.txt";

		String inputfilePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "\\" + "vehicles"
				+ "\\" + preDateFolder + "\\" + s_number + "_" + environment + "." + client + "_Vehicles_Returns_"
				+ acode_or_styleid + "_" + preDateFolder + ".txt";
		filePath_statusCode = filePath_statusCode + "_" + currentDateFolder + "_" + "Compared_To_" + preDateFolder
				+ ".txt";

		filePath_return = filePath_return.replace(".txt", "");

		final String USER_AGENT = "Mozilla/5.0";

		String urlS = url1 + "/" + url2 + auth_key;
		URL obj = new URL(urlS);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("GET");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//		*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//		con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//		con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//		con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//		*************QA*************

		con.setDoOutput(true);

		int responseCode = con.getResponseCode();
		String outputString;
		String inputString;

		filePath_return = filePath_return + "_" + acode_or_styleid + "_" + currentDateFolder + ".txt";

		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//				System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
			outputString = formatJSON(environment, client, outputString);

			inputString = readFile(inputfilePath_statusCode);
			try {
				inputString = formatJSON(environment, client, inputString);
			} catch (Exception ex) {

				System.out.println("Unable to format JSON file for " + s_number + ". " + acode_or_styleid
						+ "_inputString = " + inputString);
			}

//			System.out.println(inputString);
//			compare two 
			MyStrComparable comp = new MyStrComparable();
			int pass = comp.compare(outputString, inputString);
			if (pass == 1) {
				// =1 -- passed: All match.

				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + len
								+ "  - Return Status Code: " + responseCode + ". Compare to previous return: Passed!");

			} else if (pass == -1) {

				// =-1 --failed: some of them do not match.
				SaveScratch(filePath_statusCode, client + ". " + acode_or_styleid + ". " + s_number + ". "
						+ " - Return data Size = " + len + "  - Return Status Code: " + responseCode
						+ ". ------Compare to previous return: Failed!!! - lots do not match! Previous one is empty! - current API returns - Working now! - Passed!");
			} else if (pass == 2) {
				// =2 -- failed: lots do not match.
				// result
				SaveScratch(filePath_statusCode, client + ". " + acode_or_styleid + ". " + s_number + ". "
						+ " - Return data Size = " + len + "  - Return Status Code: " + responseCode
						+ ". ------Compare to previous return: Failed! - some of them do not match!!! - Failed!");
			} else {
				// = -- failed: lots do not match.
				// result
				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + len
								+ "  - Return Status Code: " + responseCode
								+ ". ------Compare to previous return: Failed!!!!!! <>-1,<>1,<>2");

			}

			SaveScratch(filePath_return, outputString);

			System.out.println(s_number + " - " + client + ". " + acode_or_styleid
					+ " - Return compare two Strings 1-All match,2-Some not match,-1-Lots not match = " + pass);

		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";

			inputString = readFile(inputfilePath_statusCode);
			if (inputString.contains("Return result = empty")) {
				System.out.println(client + ". " + s_number + ". " + acode_or_styleid
						+ " - Failed! Previous one contains empty result!, return Status Code = " + responseCode);
				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + "- 0."
								+ "  - Return Status Code: " + responseCode
								+ " - Failed! Previous return is also empty! - Passed!");

			} else {

				SaveScratch(filePath_statusCode,
						client + ". " + acode_or_styleid + ". " + s_number + ". " + " - Return data Size = " + "- 0."
								+ "  - Return Status Code: " + responseCode
								+ " - Failed. Previous retrun does not conturn empty!! - Failed");

			}

			System.out.println(client + ". " + s_number + ". " + acode_or_styleid
					+ " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);

			SaveScratch(filePath_return, client + ". " + acode_or_styleid + ". " + s_number + ". "
					+ " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;

	}

	public static String getNewSourceCodeJsonGETvehicles(String environment, String client, String vehicles_code,
			String url1, String url2, String auth_key, int s_number, String lang, String appid, String product_key,
			String profile_Key) throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;

		String acode_or_styleid = vehicles_code.replace("/", "");

		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "Vehicles_StatusCode.txt";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + s_number + "_" + environment + "."
				+ client + "_Vehicles_Returns_" + acode_or_styleid + ".txt";

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

		String urlS = url1 + "/" + url2 + "/" + auth_key;
		URL obj = new URL(urlS);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("GET");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//		*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//		con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//		con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//		con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//		*************QA*************

		con.setDoOutput(true);
//		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//		wr.writeBytes(BSBody);
//		wr.flush();
//		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
//		String acode_or_styleid = cc_code.replace("/","");

//		acode_or_styleid = getSubText(acode_or_styleid, '"');// "\"" - "
//		filePath_return = filePath_return + "_" + acode_or_styleid + "_" + sdfmt.format(d) + ".txt";

		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//				System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
			outputString = formatJSON(environment, client, outputString);
			System.out.println(client + ". " + s_number + " - Return data Size = " + len + "  - Return Status Code: "
					+ responseCode);
			SaveScratch(filePath_statusCode, client + ". " + vehicles_code + ". " + s_number + ". "
					+ " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
			SaveScratch(filePath_return, outputString);
		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";
			System.out.println(client + ". " + s_number
					+ " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);
			SaveScratch(filePath_statusCode, client + ". " + vehicles_code + ". " + s_number + ". "
					+ " - Return data Size = " + "- 0." + "  - Return Status Code: " + responseCode + " - Failed.");
			SaveScratch(filePath_return, client + ". " + vehicles_code + ". " + s_number + ". "
					+ " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonGETPrimary(String environment, String client, String BSBody, String url1,
			String url2, String auth_key, int s, String lang, String appid, String product_key, String profile_Key)
			throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;

		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment
				+ "CompareBS_Primary_StatusCode.txt";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_Primary_Returns.txt";

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

		String urlS = url1 + url2 + auth_key;
		URL obj = new URL(urlS);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("GET");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//		*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//		con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//		con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//		con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//		*************QA*************

		con.setDoOutput(true);
//		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//		wr.writeBytes(BSBody);
//		wr.flush();
//		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//				System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();

			outputString = formatJSON(environment, client, outputString);

			con.disconnect();

			System.out.println(s + " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
			SaveScratch(filePath_statusCode,
					client + ". " + s + " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
			SaveScratch(filePath_return,
					client + ". " + s + " - Return data Size = " + len + "  - Return result = " + outputString);
		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";
			System.out.println(
					s + " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);
			SaveScratch(filePath_statusCode, client + ". " + s + " - Return data Size = " + " - 0."
					+ "  - Return Status Code: " + responseCode + " - Failed.");
			SaveScratch(filePath_return, client + ". " + s + " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonGETPrimaryAndSaveModelCode_or_YMMID(String environment, String client,
			String BSBody, String url1, String url2, String auth_key, int s, String lang, String appid,
			String product_key, String profile_Key) throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;

		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment
				+ "CompareBS_Primary_StatusCode.txt";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_Primary_Returns.txt";

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

		String urlS = url1 + url2 + auth_key;
		URL obj = new URL(urlS);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("GET");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//		*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//		con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//		con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//		con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//		*************QA*************

		con.setDoOutput(true);
//		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//		wr.writeBytes(BSBody);
//		wr.flush();
//		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//				System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();

			outputString = formatJSON(environment, client, outputString);

			con.disconnect();

			System.out.println(s + " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
//			SaveScratch(filePath_statusCode,
//					client + ". " + s + " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
//			SaveScratch(filePath_return,
//					client + ". " + s + " - Return data Size = " + len + "  - Return result = " + outputString);
		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";
			System.out.println(
					s + " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);
//			SaveScratch(filePath_statusCode, client + ". " + s + " - Return data Size = " + " - 0."
//					+ "  - Return Status Code: " + responseCode + " - Failed.");
//			SaveScratch(filePath_return, client + ". " + s + " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonGETVehiclesToSheet(String environment, String client, String vehicles_code,
			String url1, String url2, String auth_key, int s, String lang, String appid, String product_key,
			String profile_Key) throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;
		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment
				+ "CompareBS_Vehicles_StatusCode.txt";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_Vehicles_Returns.txt";

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

		String urlS = url1 + url2 + auth_key;
		URL obj = new URL(urlS);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("GET");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//		*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//		con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//		con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//		con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//		*************QA*************

		con.setDoOutput(true);
//		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//		wr.writeBytes(BSBody);
//		wr.flush();
//		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//				System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();

			outputString = formatJSON(environment, client, outputString);

			con.disconnect();

			System.out.println(s + " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
			SaveScratch(filePath_statusCode,
					client + ". " + s + " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
			SaveScratch(filePath_return,
					client + ". " + s + " - Return data Size = " + len + "  - Return result = " + outputString);
		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";
			System.out.println(
					s + " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);
			SaveScratch(filePath_statusCode, client + ". " + s + " - Return data Size = " + " - 0."
					+ "  - Return Status Code: " + responseCode + " - Failed.");
			SaveScratch(filePath_return, client + ". " + s + " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonGET(String environment, String client, String BSBody, String url1,
			String url2, String url3, int s, String lang, String appid, String product_key, String profile_Key)
			throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		Properties prop = new Properties();
		prop.load(compareBS_commonCompetitors.class.getClassLoader()
				.getResourceAsStream("./compareBS_data/compareBS_text.properties"));
		String resultfile1 = prop.getProperty("CommonCompetitors.StatusCode_resutlPathFile");
		String resultfile2 = prop.getProperty("CommonCompetitors.return_resutlPathFile");
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;

		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;

		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy-MM-dd");
		timeStamp = sdf.format(cal.getTime());
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		Date d = new Date();
		dateStamp = df.format(d);
		timeStamp = dateStamp + "  " + timeStamp;
		resultfile1 = resultfile1.replace(".txt", "");
		resultfile1 = resultfile1 + "_" + sdfmt.format(d) + ".txt";

		resultfile2 = resultfile2.replace(".xls", "");
		resultfile2 = resultfile2 + "_" + sdfmt.format(d) + ".txt";

//			String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\"+environment+"."+client+"CompareBS_CommonCompetitors_StatusCode.txt";
//			String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\"+environment+"."+client+"CompareBS_CommonCompetitors_Returns.txt";

		String filePath_statusCode = resultfile1;
		String filePath_return = resultfile2;

		final String USER_AGENT = "Mozilla/5.0";
		String fURL = url1 + url2 + url3;
		URL obj = new URL(fURL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setConnectTimeout(CONNECTION_TIMEOUT);
		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("GET");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Length", Integer.toString(11416884));// 11416884

		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json");
//		*************QA*************
		con.setRequestProperty("Accept-Language", lang);

//		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=\"autodata-2ClEuwgRighfN83ccSskw3TA\"");
		con.setRequestProperty("Authorization", "Atmosphere atmosphere_app_id=" + appid);

//		con.setRequestProperty("chrome-appId", "autodata-2ClEuwgRighfN83ccSskw3TA");
		con.setRequestProperty("chrome-appId", "autodata-" + appid);

//		con.setRequestProperty("chrome-chrome-productKey", "comparev3");
		con.setRequestProperty("chrome-chrome-productKey", product_key);

//		con.setRequestProperty("X-Profile-Key", "kiaordering-ca-default");
		con.setRequestProperty("X-Profile-Key", profile_Key);
//		*************QA*************

		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//		wr.writeBytes(BSBody);
		wr.flush();
		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			int len = 0;

			while ((inputLine = in.readLine()) != null) {
//				System.out.println("Return data Size = "+inputLine.length());
				len = inputLine.length();
				if (!inputLine.isEmpty()) {
					postData.append(inputLine);
				}
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();

			System.out.println(s + " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
			SaveScratch(environment + "." + client + filePath_statusCode,
					client + ". " + s + " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
			SaveScratch(environment + "." + client + filePath_return,
					client + ". " + s + " - Return data Size = " + len + "  - Return result = " + outputString);
		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";
			System.out.println(
					s + " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);
			SaveScratch(environment + "." + client + filePath_statusCode, client + ". " + s + " - Return data Size = "
					+ " - 0." + "  - Return Status Code: " + responseCode + " - Failed.");
			SaveScratch(environment + "." + client + filePath_return,
					client + ". " + s + " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonGETVehicles(String environment, String client, String BSBody, String url1,
			String url2, String vehiclesS, int s_number, String lang, String appid, String product_key,
			String profile_Key) throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;
		String urlString = url1 + "/" + url2 + vehiclesS;
		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_Vehicles_StatusCode.txt";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_Vehicles_Returns.txt";

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
		URL obj = new URL(urlString);
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
		con.setUseCaches(false);
		con.setDoOutput(true);

//		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
////			wr.writeBytes(BSBody);
//		wr.flush();
//		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
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
			SaveScratch(filePath_statusCode, client + ". " + BSBody + ". " + s_number + " - Return data Size = " + len
					+ "  - Return Status Code: " + responseCode);
			SaveScratch(filePath_return, client + ". " + BSBody + ". " + s_number + " - Return data Size = " + len
					+ "  - Return result = " + outputString);
		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";
			System.out.println(client + ". " + s_number
					+ " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);
			SaveScratch(filePath_statusCode, client + ". " + BSBody + ". " + s_number + " - Return data Size = "
					+ " - 0." + "  - Return Status Code: " + responseCode + " - Failed.");
			SaveScratch(filePath_return,
					client + ". " + BSBody + ". " + s_number + " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getNewSourceCodeJsonGETVehiclesUse_OutputStream_same_Not_work(String environment,
			String client, String BSBody, String url1, String url2, String vehiclesS, int s, String lang, String appid,
			String product_key, String profile_Key) throws Exception {
		// POST method - works but lost data...20201121
		// add auth_key in Headers
		int wt = 2;
		String sName, passOrfail, dateStamp, timeStamp;
		final int CONNECTION_TIMEOUT = 1000 * 900;
		final int DATARETREIVAL_TIMEOUT = 1000 * 900;
		String urlString = url1 + url2 + vehiclesS;
		String filePath_statusCode = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_Vehicles_StatusCode.txt";
		String filePath_return = "C:\\1\\Eclipse\\Test Results\\CompareBS\\" + environment + "." + client
				+ "CompareBS_Vehicles_Returns.txt";

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
		URL obj = new URL(urlString);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//		con.setConnectTimeout(CONNECTION_TIMEOUT);
//		con.setReadTimeout(DATARETREIVAL_TIMEOUT);

		con.setRequestMethod("GET");// for daaSNI is "POST"
		con.setDoOutput(true);

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

//		con.setDoOutput(true);
		OutputStream wr = con.getOutputStream();
//			wr.writeBytes(BSBody);
		wr.flush();
		wr.close();
		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 405) && !(responseCode == 400) && !(responseCode == 503)
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

			System.out.println(s + " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
			SaveScratch(filePath_statusCode,
					client + ". " + s + " - Return data Size = " + len + "  - Return Status Code: " + responseCode);
			SaveScratch(filePath_return,
					client + ". " + s + " - Return data Size = " + len + "  - Return result = " + outputString);
		} else {
			// error shows: 400,404, 500, 503,
			// write to txt file for acode or styleid and error code here:
			//
			outputString = "";
			System.out.println(
					s + " - Failed!Failed!Failed!Failed!Failed!Failed!Failed!, return Status Code = " + responseCode);
			SaveScratch(filePath_statusCode, client + ". " + s + " - Return data Size = " + " - 0."
					+ "  - Return Status Code: " + responseCode + " - Failed.");
			SaveScratch(filePath_return, client + ". " + s + " - Return data Size = 0  - Return result = empty!!!");
		}
		return outputString;
	}

	public static String getSourceCodeJsonPost(String urlParameters, String url1, String url2) throws Exception {
		// POST method - works
		final String USER_AGENT = "Mozilla/5.0";
		URL obj = new URL(url1 + url2);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");// for daaSNI is "POST"
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("api_key", "QWERTYUIOP"); // This is for Car360 Login API only
		// con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		// //Original
		con.setRequestProperty("Accept-Language", "en-US,fr-CA;q=0.7,en;q=0.3");
		// Send post request en-US,fr-CA;q=0.7,en;q=0.3
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		String outputString;
		if (!(responseCode == 404) && !(responseCode == 400) && !(responseCode == 403) && !(responseCode == 503)
				&& !(responseCode == 500)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF8"));
			String inputLine;
			StringBuffer postData = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				postData.append(inputLine);
			}
			in.close();
			outputString = postData.toString();
			con.disconnect();
		} else {
			outputString = "";
		}
		return outputString;
	}

	public static String[] fetchOneDemArrayFromPropFile(String propertyName, Properties propFile) {
		// get array split up by the colin
		String a[] = propFile.getProperty(propertyName).split(",");
		return a;
	}

	public static String[][] fetchArrayFromPropFile(String propertyName, Properties propFile) {

		// get array split up by the semicolin
		String[] a = propFile.getProperty(propertyName).split(";");

		// create the two dimensional array with correct size
		String[][] array = new String[a.length][a.length];

		// combine the arrays split by semicolin and comma
		for (int i = 0; i < a.length; i++) {
			array[i] = a[i].split(",");
		}
		return array;
	}

	public static void writeTitle(String resultfile, String[] tString) throws IOException {
		int tStringLength = tString.length;
		int n = 0;
		File f = new File(resultfile);
		if (f.exists()) {
			FileInputStream file = new FileInputStream(new File(resultfile));
		} else {
			// Write an empty file with a title.
			HSSFWorkbook workbook = new HSSFWorkbook();
			// Create first sheet from the workbook
			HSSFSheet s = workbook.createSheet();
			HSSFCellStyle hdstyle = workbook.createCellStyle();
			hdstyle.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
			hdstyle.setFillForegroundColor(HSSFColor.LIGHT_ORANGE.index);

			Font titleFont = workbook.createFont();
			titleFont.setFontHeight((short) 220);
			titleFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
			hdstyle.setFont(titleFont);

			s.createRow(0);
			n = s.getLastRowNum();
			Row r1 = s.getRow(n);
			n = r1.getRowNum();

			for (int i = 0; i < tStringLength; i++) {
				Cell cell0 = r1.createCell(i);
				cell0.setCellValue(tString[i]);
				cell0.setCellStyle(hdstyle);
			}

			hdstyle.setFillPattern(CellStyle.SOLID_FOREGROUND);

			try {
				FileOutputStream out = new FileOutputStream(resultfile); //
				workbook.write(out);
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void Wait(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeToSheet(String resultfile, String[] jSONValues) throws IOException {
		int n = 0;
		String sName, passOrfail, dateStamp, timeStamp;
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		timeStamp = sdf.format(cal.getTime());
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		Date d = new Date();
		dateStamp = df.format(d);
		timeStamp = dateStamp + "  " + timeStamp;
		// writeTitle(resultfile);

		FileInputStream file = new FileInputStream(new File(resultfile));
		int jSONValuesLength = jSONValues.length;

		// Get the workbook instance for XLS file
		HSSFWorkbook workbook = new HSSFWorkbook(file);

		// Get first sheet from the workbook
		HSSFSheet s = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = s.iterator();

		n = s.getLastRowNum();
		sName = s.getSheetName();
		s.createRow(n + 1);
		n = s.getLastRowNum();
		Row r1 = s.getRow(n);
		n = r1.getRowNum();

		for (int i = 0; i < jSONValuesLength; i++) {
			r1.createCell(i).setCellValue(jSONValues[i]);
		}

		try {
			FileOutputStream out = new FileOutputStream(resultfile);
			workbook.write(out);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String[] loadTextFromDataFolder(String env, String filePathName) throws IOException {
		boolean loadFromClasspath = true;
//		String fileName = "StagingAllURLs.txt"; // provide an absolute path here to be sure that file is found
		BufferedReader reader = null;
		String[] empty = { "" };
		try {

			if (loadFromClasspath) {
				InputStream in = getClass().getClassLoader().getResourceAsStream(filePathName);
				reader = new BufferedReader(new InputStreamReader(in));
			} else {
				// load from file system
				reader = new BufferedReader(new FileReader(new File(filePathName)));
			}
			List<String> liness = new ArrayList<String>();
			String line = null;
//	        String liness="";
			while ((line = reader.readLine()) != null) {
				// do something with the line here
				System.out.println("Line read: " + line);
				liness.add(line);
			}

			String urls[] = liness.toArray(new String[0]);
			int arrsize = urls.length;
			System.out.println("\nArrary lenght=" + arrsize);
			for (String url : urls) {
				System.out.println("URL=" + url);
			}
			System.out.println("\nArrary lenght=" + arrsize);
			return urls;
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + " for AllURLs.txt", "File Error",
					JOptionPane.ERROR_MESSAGE);
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		return empty;
	}

	public static void SaveScratch(String pathfilename, String ScratchText) {
		try {
			// BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir+
			// "Acodes.txt", true)); //original OK
			BufferedWriter out2 = new BufferedWriter(new FileWriter(pathfilename, true));
			// out2.write("("+i+"): "+Acode+": ");
			// out2.write(i + ". " + Acode + ": "); //Original OK
			// out2.newLine();
			out2.write(ScratchText);
			out2.newLine();
			out2.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static String getSubText(String textString, char startString) throws Exception { // "\""
		String returnString = "";
		String styleid = "";
//		String acode = textString.substring(22, 35);
		int startPlace = textString.indexOf(startString);
		if (startPlace >= 3) {
			// styleid
			styleid = textString.substring(0, 12 - startPlace);
			returnString = styleid;
		} else {
			// acode
			returnString = textString;
		}

		return returnString;
	}

	public static String formatJSON(String env, String client, String jsonString) throws Exception {

//		JsonParser parser = new JsonParser();
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//		JsonElement el = parser.parse(jsonString);
//		jsonString = gson.toJson(el); // done

		// if it's not already, convert to a JSON object
		JSONObject jsonObject = new JSONObject(jsonString);
		// To string method prints it with specified indentation
//		System.out.println(jsonObject.toString(4));

		jsonString = jsonObject.toString(4);

		return jsonString;
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

	public String getCurrentyyyy_mm_dd() throws IOException {
		String dateStamp, timeStamp, yyyy_mm_dd;
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy-MM-dd");
		timeStamp = sdf.format(cal.getTime());
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		Date d = new Date();
		dateStamp = df.format(d);
		timeStamp = dateStamp + "  " + timeStamp;
		yyyy_mm_dd = sdfmt.format(d);
		return yyyy_mm_dd;
	}

	public void SaveScratch(int i, String Acode, String ScratchText) {
//		try {
//			BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
//					+ "Acodes.txt", true));
//			// out2.write("("+i+"): "+Acode+": ");
//			out2.write(i + ". " + Acode + ": ");
//			out2.newLine();
//			out2.write(ScratchText);
//			out2.newLine();
//			out2.close();
//		} catch (Exception e) {// Catch exception if any
//			System.err.println("Error: " + e.getMessage());
//		}
	}

	public void SaveAcode_StyleidGoodToAddCodeToFile(String path, String env, String client, String BS_Name,
			String Acode_or_Styleid) {
		String pathAndFileName = path + env + "." + client + BS_Name + ".txt";
		try {
			BufferedWriter out2 = new BufferedWriter(new FileWriter(pathAndFileName, true));
			out2.write(Acode_or_Styleid);
			out2.newLine();
			out2.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public void SaveAcode_Styleid(String path, String env, String client, String BS_Name, String Acode_or_Styleid) {
		String pathAndFileName = path + env + "." + client + BS_Name + ".txt";
		try {
			BufferedWriter out2 = new BufferedWriter(new FileWriter(pathAndFileName, true));
			out2.write(Acode_or_Styleid);
			out2.newLine();
			out2.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public void SaveAcode_Styleid(String path, String env, String client, String BS_Name, String[] Acodes_or_Styleids) {
		String pathAndFileName = path + env + "." + client + BS_Name + ".txt";
//		int Acodes_or_Styleids_len = Acodes_or_Styleids.length;
		for (String Acode_or_Styleid : Acodes_or_Styleids) {

			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(pathAndFileName, true));
				out2.write(Acode_or_Styleid);
				out2.newLine();
				out2.close();
			} catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		}
	}

	public void SaveAcode_Styleid_for_text_body(String path, String env, String client, String BS_Name,
			String[] Acodes_or_Styleids) {
		String pathAndFileName = path + env + "." + client + BS_Name + ".txt";
//		int Acodes_or_Styleids_len = Acodes_or_Styleids.length;
		for (String Acode_or_Styleid : Acodes_or_Styleids) {

			// TextBody added here
//			Acode_or_Styleid = "asd===========fas" + Acode_or_Styleid	+ "asdfasdasdfasdsdfasdfffff====================fasdfasdfa";

			Acode_or_Styleid = "{\"vehicles\":[{\"code\":\"" + Acode_or_Styleid
					+ "\"}],\"include\": {\"vehicleDetails\": true,\"includeCategories\": true}}";

			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(pathAndFileName, true));
				out2.write(Acode_or_Styleid);
				out2.newLine();
				out2.close();
			} catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		}
	}

	public void pull_Acodes_or_Styleids_From_MySQL_from_modelcode_or_ymmid_SaveAcodes_Styleids(String path, String env,
			String client, String BS_Name_cc, String code) throws Exception {
		// TODO Auto-generated method stub
//		String[] acodes_or_styleids=new String[500];

		mySQLquery queryAcodesOrStyleids = new mySQLquery();
		String[] acodes_or_styleids = queryAcodesOrStyleids.PullOneModelCodeToAcodesOrStyleids(code);
		int code_len = acodes_or_styleids.length;
		System.err.println("code_len: " + code_len);
		// save to: QA.ToyotaCACommonCompetitors.txt = BS_Name_cc

		SaveAcode_Styleid(path, env, client, BS_Name_cc, acodes_or_styleids);
	}

	public void pull_Acodes_or_Styleids_From_MySQL_from_modelcode_or_ymmid_SaveAcodes_Styleids_SAVE_to_Text(String path,
			String env, String client, String BS_Name_Text, String code) throws Exception {
		// TODO Auto-generated method stub
//		String[] acodes_or_styleids=new String[500];
		String textBodywithCode = "";
		mySQLquery queryAcodesOrStyleids = new mySQLquery();
		String[] acodes_or_styleids = queryAcodesOrStyleids.PullOneModelCodeToAcodesOrStyleids(code);
		int code_len = acodes_or_styleids.length;
		System.err.println("code_len: " + code_len);
		// save to: QA.ToyotaCACommonCompetitors.txt = BS_Name_cc
		textBodywithCode = "" + textBodywithCode + "";
		SaveAcode_Styleid_for_text_body(path, env, client, BS_Name_Text, acodes_or_styleids);
	}

}