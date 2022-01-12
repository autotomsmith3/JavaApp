package CA;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class LoadWebServiceChryslerCA {
	private final String USER_AGENT = "Mozilla/5.0";
	public static String Var;
	public static String prodOutput = "";
	public static String QAOneOutput = "";
	// ***** below dataDir is replaced by config.properties DW_filePath,
	// DC_filePath
	// public String dataDir =
	// "F:\\Quality Assurance\\Chrysler Canada\\Testing\\23_DW API\\Test Cases\\ASIAUTOS 3.6.0.24\\Prod\\DW\\";
	// public static String prixS="<!--Generation Time="; //20 chars
	// public static String postS="EST 2014-->"; //11 chars
	public static String prixS = "Generation Time="; // 16 chars
	public static String postS = "EDT 2016"; // 8 chars or EDT 2016
	public static String prixS1 = "<SCRATCHSAVE>";
	public static String postS1 = "</SCRATCHSAVE>";

	// *****************Two files to compare - Settings************************
	// ***** Below first and second EnvName are still needed for the saved files
	// for comparing two files
	// Valid firstEnvName = QA, UAT, Prod, Prod-prod, QA9090, Prod-prod9090
	public String firstEnvName = "QA9090"; // Only compare same environment bwt
											// 2 folders below. URLs should be
											// same except date
	public String secondEnvName = ""; // This will not be used but do not remove
										// it

	// *************Result saved in this folder:
	public String dataDir = "F:\\Quality Assurance\\Chrysler Canada\\Testing\\23_DW API\\Test Cases\\ASIAUTOS 3.8.1.77_MSETL_LeasingHotFix2\\QA9090\\";
	// public String dataDir =
	// "C:\\My Documents\\Chrysler_CA\\QA\\Temp\\Leasing\\";
	// *****DW used
	public static String qafiledataDir = "F:\\Quality Assurance\\Chrysler Canada\\Testing\\23_DW API\\Test Cases\\ASIAUTOS 3.8.1.77_MSETL_LeasingHotFix2\\QA9090\\QA_DW\\";
	public static String prodfiledataDir = "F:\\Quality Assurance\\Chrysler Canada\\Testing\\23_DW API\\Test Cases\\ASIAUTOS 3.8.1.77_MSETL_LeasingHotFix2\\QA9090\\Prod_DW\\";

	// //// *****DC used
	// public static String qafiledataDir
	// ="F:\\Quality Assurance\\Chrysler Canada\\Testing\\23_DW API\\Test Cases\\ASIAUTOS 3.8.0.66_CreditAppDlr\\QA\\DC_withCreditAppOnly\\";
	// public static String prodfiledataDir
	// ="F:\\Quality Assurance\\Chrysler Canada\\Testing\\23_DW API\\Test Cases\\ASIAUTOS 3.8.0.66_CreditAppDlr\\QA\\DC_01\\";

	// *****************Two files to compare - Settings************************
	public String GetFolderName() {
		return Var;
	}

	public void SetFolderName(String V) {
		Var = V;
	}

	public String getSourceCodeOld(String prefix, String url) {
		String buffer = "";
		try {
			URL pageURL = new URL(prefix + url);
			HttpURLConnection urlConnection = (HttpURLConnection) pageURL
					.openConnection();
			int count = 1;
			while (true) {
				String header = urlConnection.getHeaderField(count);
				String key = urlConnection.getHeaderFieldKey(count);
				if (header == null || key == null) {
					break;
				}
				count++;
			}
			InputStream in = new BufferedInputStream(
					urlConnection.getInputStream());
			Reader r = new InputStreamReader(in);
			int c;
			while ((c = r.read()) != -1) {
				buffer += String.valueOf((char) c);
			}
		} catch (Exception ee) {
		}
		return buffer;
	}

	public static String getSourceCode(String prefix, String url) {
		String inputLine = "";
		String inputLineOne = "";
		try {
			URL MyURL = new URL(prefix + url);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					MyURL.openStream(), "UTF8"));
			while ((inputLineOne = in.readLine()) != null) {
				inputLine = inputLine + inputLineOne + "\n";
			}
			in.close();
		} catch (Exception ee) {
		}
		return inputLine;
	}

	public String getSourceCode(String urlParameters, String url1, String url2)
			throws Exception {
		URL obj = new URL(url1 + url2);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("PUT");//for daaSNI is "POST"
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

		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream(), "UTF8"));
		String inputLine;
		StringBuffer postData = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			postData.append(inputLine);
		}
		in.close();
		String outputString;
		outputString = postData.toString();
		con.disconnect();
		return outputString;
	}

	public void loadURLProd(String TCid, String TCnumber, String args1,
			String args2) {
		prodOutput = getSourceCode(args1, args2);
		String prefix_fileName;
		prefix_fileName = args2.substring(0, args2.indexOf("."));
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(dataDir
					+ prefix_fileName + firstEnvName + TCnumber + ".txt", true));
			out.newLine();
			out.write(args1 + args2);
			out.newLine();
			out.write(prodOutput);
			out.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		prefix_fileName = "";
	}

	public void loadURLProd(String TCid, String TCnumber, String Parameters,
			String args1, String args2) {
		try {
			prodOutput = getSourceCode(Parameters, args1, args2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String prefix_fileName;
		prefix_fileName = args2.substring(0, args2.indexOf("."));
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(dataDir
					+ prefix_fileName + firstEnvName + TCnumber + ".txt", true));
			out.newLine();
			out.write(args1 + args2 + "_Post_Parameters_" + Parameters);
			out.newLine();
			out.write(prodOutput);

			out.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		prefix_fileName = "";
	}

	public void loadURLQA(String TCid, String TCnumber, String args1,
			String args2) {
		String prefix_fileName;

		int pos = args2.indexOf(".xml");

		String str_1 = args2.substring(0, pos);

		if (str_1.indexOf("/") != -1) {
			String[] str_2 = str_1.split("/");
			prefix_fileName = str_2[1];
		} else {
			prefix_fileName = str_1;
		}
		QAOneOutput = getSourceCode(args1, args2);
		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter(dataDir + prefix_fileName + secondEnvName
							+ TCnumber + ".txt", true));
			out.newLine();
			out.write(args1 + args2);
			out.newLine();
			out.write(QAOneOutput);

			out.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

		try {
			BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
					+ prefix_fileName + "testingResult.txt", true));
			out2.newLine();
			out2.write(TCid + " " + TCnumber + prefix_fileName);
			out2.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

		// **************************save to one file***************************
		try {
			BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
					+ "testingResult.txt", true));
			out2.newLine();
			out2.write(TCid + " " + TCnumber + " " + prefix_fileName);
			out2.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

		// **************************save to one file***************************
		prefix_fileName = "";
	}

	public void loadURLQA(String TCid, String TCnumber, String Parameters,
			String args1, String args2) {
		String prefix_fileName;
		int pos = args2.indexOf(".xml");
		String str_1 = args2.substring(0, pos);
		if (str_1.indexOf("/") != -1) {
			String[] str_2 = str_1.split("/");
			prefix_fileName = str_2[1];
		} else {
			prefix_fileName = str_1;
		}
		try {
			QAOneOutput = getSourceCode(Parameters, args1, args2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter(dataDir + prefix_fileName + secondEnvName
							+ TCnumber + ".txt", true));
			out.newLine();
			out.write(args1 + args2 + "_Post_Parameters_=" + Parameters);
			out.newLine();
			out.write(QAOneOutput);
			out.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		try {
			BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
					+ prefix_fileName + "testingResult.txt", true));
			out2.newLine();
			out2.write(TCid + " " + TCnumber + prefix_fileName);
			out2.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

		// **************************save to one file***************************
		try {
			BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
					+ "testingResult.txt", true));
			out2.newLine();
			out2.write(TCid + " " + TCnumber + " " + prefix_fileName);
			out2.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

		// **************************save to one file***************************
		prefix_fileName = "";
	}

	public boolean compare(String ws, boolean testError) {
		boolean tE1;
		boolean tE2;
		if (testError) {
			tE1 = false;
			tE2 = true;
		} else {
			tE1 = false;
			tE2 = false;
		}
		prodOutput = afterremovedString(prodOutput, prixS, postS, tE1);
		QAOneOutput = afterremovedString(QAOneOutput, prixS, postS, tE2);

		if ((prodOutput.equals(QAOneOutput))
				&& ((!prodOutput.equals("")) || (!QAOneOutput.equals("")))) {
			System.out.println("Passed..." + datetimeString());
			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
						+ ws + "testingResult.txt", true));
				out2.write("    Passed...");
				out2.close();
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}

			// **************************save to one
			// file***************************
			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
						+ "testingResult.txt", true));
				out2.write("    Passed...");
				out2.close();
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}
			// **************************save to one
			// file***************************
			return true;
		} else {
			System.out.println("  Failed..." + datetimeString());
			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
						+ ws + "testingResult.txt", true));
				if ((prodOutput.equals("")) || (QAOneOutput.equals(""))) {
					out2.write("    Failed...Unable to load XML. Output =Empty. Need manual test!!!");
				} else {
					out2.write("    Failed...");
				}
				out2.close();
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}

			// **************************save to one
			// file***************************
			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
						+ "testingResult.txt", true));
				if ((prodOutput.equals("")) || (QAOneOutput.equals(""))) {
					out2.write("    Failed...Unable to load XML. Output =Empty. Need manual test!!!");
				} else {
					out2.write("    Failed...");
				}
				out2.close();
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}

			// **************************save to one
			// file***************************
			return false;
		}
	}

	public boolean compareSorted(String ws, boolean testError,
			String headString, String tailString) throws Exception {
		boolean tE1;
		boolean tE2;
		String prodsortedString;
		String qasortedString;
		if (testError) {
			tE1 = false;
			tE2 = true;
		} else {
			tE1 = false;
			tE2 = false;
		}
		prodOutput = afterremovedString(prodOutput, prixS, postS, tE1);
		QAOneOutput = afterremovedString(QAOneOutput, prixS, postS, tE2);
		sortXML stringSorted = new sortXML();
		prodsortedString = stringSorted.sortString(prodOutput, headString,
				tailString);
		qasortedString = stringSorted.sortString(QAOneOutput, headString,
				tailString);
		if ((prodsortedString.equals(qasortedString))
				&& ((!prodsortedString.equals("")) || (!qasortedString
						.equals("")))) {
			System.out.println("Passed..." + datetimeString());
			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
						+ ws + "testingResult.txt", true));
				out2.write(" after sorting   Passed...");
				out2.close();
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}
			// **************************save to one
			// file***************************
			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
						+ "testingResult.txt", true));
				out2.write(" after sorting   Passed...");
				out2.close();
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}
			// **************************save to one
			// file***************************
			prodOutput = "";
			QAOneOutput = "";
			return true;
		} else {
			System.out.println("  Failed..." + datetimeString());
			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
						+ ws + "testingResult.txt", true));
				if ((prodOutput.equals("")) || (QAOneOutput.equals(""))) {
					out2.write(" after sorting   Failed...Unable to load XML. Output =Empty. Need manual test!!!");
				} else {
					out2.write("  after sorting  Failed...");
				}
				out2.close();
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}

			// **************************save to one
			// file***************************
			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
						+ "testingResult.txt", true));
				if ((prodOutput.equals("")) || (QAOneOutput.equals(""))) {
					out2.write("  after sorting  Failed...Unable to load XML. Output =Empty. Need manual test!!!");
				} else {
					out2.write("  after sorting  Failed...");
				}
				out2.close();
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}

			// **************************save to one
			// file***************************
			prodOutput = "";
			QAOneOutput = "";
			return false;
		}
	}

	public boolean compareTwoFiles(String tc, String ws) {
		// remove date & time stamp
		prodOutput = afterremovedString(prodOutput, prixS, postS, false);
		QAOneOutput = afterremovedString(QAOneOutput, prixS, postS, true);

		if ((prodOutput.equals(QAOneOutput))
				&& ((!prodOutput.equals("")) || (!QAOneOutput.equals("")))) {
			System.out.println("Passed..." + datetimeString());

			// **************************save to one
			// file***************************
			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
						+ "testingResult.txt", true));
				out2.write(tc + " " + ws + "    Passed...");
				out2.newLine();
				out2.close();
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}
			// **************************save to one
			// file***************************
			prodOutput = "";
			QAOneOutput = "";
			return true;
		} else {
			System.out.println("  Failed..." + datetimeString());
			// **************************save to one
			// file***************************
			try {
				BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
						+ "testingResult.txt", true));
				if ((prodOutput.equals("")) || (QAOneOutput.equals(""))) {
					out2.write(tc
							+ " "
							+ ws
							+ "    Failed...Unable to load XML. Output =Empty. Need manual test!!!");
				} else {
					out2.write(tc + " " + ws + "    Failed...");
				}
				out2.newLine();
				out2.close();
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}
			// **************************save to one
			// file***************************
			prodOutput = "";
			QAOneOutput = "";
			return false;
		}
	}

	public String afterremovedString(String originalString, String prixString,
			String postString, boolean checkerror) {
		int firstPosition, lastPostion, lastStringLenth;
		String wholeString, trimedString;
		int checkErrorinString = originalString.indexOf("error");
		if (checkerror) {
			if (checkErrorinString == -1) {
			} else {
				originalString = "Found Error Here!" + originalString;
			}
		}
		firstPosition = originalString.indexOf(prixString);
		lastPostion = originalString.indexOf(postString);
		if ((firstPosition == -1) || (lastPostion == -1)) {
			System.out.println("String = " + prixString + "..." + postString
					+ "dosen't exist in original output!");
			return originalString;
		} else {
			lastStringLenth = postString.length();
			wholeString = originalString.substring(firstPosition, lastPostion
					+ lastStringLenth);
			trimedString = originalString.replace(
					originalString.substring(
							originalString.indexOf(wholeString),
							originalString.indexOf(wholeString)
									+ wholeString.length()), "");
			return trimedString;
		}

	}

	public String getString(String originalString, String prixString,
			String postString) {
		int firstPosition, lastPostion, lastStringLenth;
		String wholeString, trimedString;
		firstPosition = originalString.indexOf(prixString);
		lastPostion = originalString.indexOf(postString);
		if ((firstPosition == -1) || (lastPostion == -1)) {
			System.out
					.println("Warning!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  String = "
							+ prixString
							+ "..."
							+ postString
							+ "dosen't exist in original output!");
			return originalString;
		} else {
			lastStringLenth = postString.length();

			wholeString = originalString.substring(firstPosition, lastPostion
					+ lastStringLenth);
			lastStringLenth = wholeString.length();

			if (lastStringLenth < 40) {
				System.out
						.println("Warning!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! The String length ="
								+ lastStringLenth
								+ ".  ScratchSave="
								+ wholeString);
			} else {
				System.out.println("The String length is more than 40 ="
						+ lastStringLenth + ".  ScratchSave= NOT Print");
			}

			return wholeString;
		}
	}

	public String getStrings(String originalString, String prixString,
			String postString, String packageCode) {
		int firstPosition = 0, lastPostion = 0, totalLenth, lastStringLenth;
		String wholeString, trimedString;
		int secondPosition, secondlastPostion;
		totalLenth = originalString.length();
		firstPosition = originalString.indexOf(prixString, lastPostion);
		lastPostion = originalString.indexOf(postString, lastPostion + 1);
		while ((firstPosition != -1) & (lastPostion != -1)) {
			lastStringLenth = postString.length();

			wholeString = originalString.substring(firstPosition, lastPostion
					+ lastStringLenth);
			if (wholeString.indexOf(packageCode) != -1) {
				break;
			}
			lastStringLenth = wholeString.length();
			firstPosition = originalString.indexOf(prixString, lastPostion);
			lastPostion = originalString.indexOf(postString, lastPostion + 1);
		}
		if ((firstPosition == -1) || (lastPostion == -1)) {
			System.out
					.println("Warning!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  String = "
							+ prixString
							+ "..."
							+ postString
							+ "dosen't exist in original output!");
			return originalString;
		} else {
			lastStringLenth = postString.length();

			wholeString = originalString.substring(firstPosition, lastPostion
					+ lastStringLenth);
			lastStringLenth = wholeString.length();

			if (lastStringLenth < 40) {
				System.out
						.println("Warning!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! The String length ="
								+ lastStringLenth
								+ ".  ScratchSave="
								+ wholeString);
			} else {
				System.out.println("The String length is more than 40 ="
						+ lastStringLenth + ".  ScratchSave= NOT Print");
			}
			return wholeString;
		}
	}

	public String retriveString(String originalString, String prixString,
			String postString) {
		int firstPosition, lastPostion, lastStringLenth;
		String wholeString, trimedString;
		firstPosition = originalString.indexOf(prixString);
		lastPostion = originalString.indexOf(postString);
		if ((firstPosition == -1) || (lastPostion == -1)) {
			System.out
					.println("Warning!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  String = "
							+ prixString
							+ "..."
							+ postString
							+ "dosen't exist in original output!");
			return originalString;
		} else {
			lastStringLenth = postString.length();

			wholeString = originalString.substring(firstPosition, lastPostion
					+ lastStringLenth);
			lastStringLenth = wholeString.length();

			if (lastStringLenth < 40) {
				System.out
						.println("Warning!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! The String length ="
								+ lastStringLenth
								+ ".  ScratchSave="
								+ wholeString);
			} else {
				System.out.println("The String length is more than 40 ="
						+ lastStringLenth + ".  ScratchSave= NOT Print");
			}
			wholeString = wholeString.replace(wholeString.substring(
					wholeString.indexOf(prixS1), wholeString.indexOf(prixS1)
							+ prixS1.length()), "");
			wholeString = wholeString.replace(wholeString.substring(
					wholeString.indexOf(postS1), wholeString.indexOf(postS1)
							+ postS1.length()), "");
			trimedString = wholeString;
			return trimedString;
		}
	}

	public String removedString(String originalString, String prixString,
			String postString) {
		int firstPosition, lastPostion, lastStringLenth;
		String wholeString, trimedString;
		firstPosition = originalString.indexOf(prixString);
		lastPostion = originalString.indexOf(postString);
		if ((firstPosition == -1) || (lastPostion == -1)) {
			System.out
					.println("Warning!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! String = "
							+ prixString
							+ "..."
							+ postString
							+ "dosen't exist in original output!");
			return originalString;
		} else {
			lastStringLenth = postString.length();
			wholeString = originalString.substring(firstPosition, lastPostion
					+ lastStringLenth);
			trimedString = originalString.replace(
					originalString.substring(
							originalString.indexOf(wholeString),
							originalString.indexOf(wholeString)
									+ wholeString.length()), "");
			return trimedString;
		}
	}

	public static String datetimeString() {
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String timeStamp = sdf.format(cal.getTime());
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		Date d = new Date();
		String dateStamp = df.format(d);
		String datetimeStamp = dateStamp + "  " + timeStamp;
		return datetimeStamp;
	}

	public void LoadProdFile(String TCnumber, String wsName) {
		String sCurrentLine;
		StringBuilder sb = new StringBuilder();
		String prefix_fileName, tempfile;
		tempfile = "";
		prefix_fileName = wsName;
		String path = prodfiledataDir + prefix_fileName + firstEnvName
				+ TCnumber + ".txt";

		try {
			BufferedReader br = new BufferedReader(new FileReader(path)); // previous
																			// works
			while ((sCurrentLine = br.readLine()) != null) {
				sb.append(sCurrentLine);
			}
			prodOutput = sb.toString();
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		prefix_fileName = "";
	}

	public void LoadQAFile(String TCnumber, String wsName) {
		String sCurrentLine;
		StringBuilder sb = new StringBuilder();
		String prefix_fileName, tempfile;
		tempfile = "";
		prefix_fileName = wsName;
		String path = qafiledataDir + prefix_fileName + firstEnvName + TCnumber
				+ ".txt"; // Prod file *********2 of
							// 2********************************
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((sCurrentLine = br.readLine()) != null) {
				sb.append(sCurrentLine);
			}
			QAOneOutput = sb.toString();
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		prefix_fileName = "";
	}

	public String readFile(String path) throws IOException {
		String sCurrentLine;
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			while ((sCurrentLine = br.readLine()) != null) {
				sb.append(sCurrentLine);
			}
		}
		return sb.toString();
	}

	public void loadConfigVehicleOnly(String TCnumber, String args1,
			String args2) {

		String APIresult = getSourceCode(args1, args2);

	}

	public String getScratchFromConfigVehicle(String prefix, String Acode,
			String sPaintOnly, String DefaultColor, String PackageCode,
			String DaysToLive, String Language, String PostalCode,
			String IPAddress, String DealerCode, String Scratch,
			String TransactionID, String view) {
		String ConfigVehicleURL = "getconfigvehicle.xml?language=" + Language
				+ "&acode=" + Acode + "&scratchSave=" + Scratch
				+ "&paintsOnly=" + sPaintOnly + "&defaultColour="
				+ DefaultColor + "&packageCode=" + PackageCode + "&daysToLive="
				+ DaysToLive + "&postalCode=" + PostalCode + "&ipAddress="
				+ IPAddress + "&dealerCode=" + DealerCode + "&transactionId="
				+ TransactionID + "&view=" + view;
		String APIresult = getSourceCode(prefix, ConfigVehicleURL);
		String ScratchSaveOnly = retriveString(APIresult, prixS1, postS1);
		return ScratchSaveOnly;
	}

	public String getScratchFromgetSelectOption(String prefix, String Language,
			String Acode, String Code, String LMethod, String DIFONLY,
			String Scratch, String previousScratch, String showDelta,
			String paintsOnly, String defaultColour, String PackageCode,
			String DaysToLive, String postalCode, String ipAddress,
			String dealerCode, String transactionId, String view) {
		String getSelectOptionURL = "getselectoption.xml?language=" + Language
				+ "&acode=" + Acode + "&code=" + Code + "&lmethod=" + LMethod
				+ "&difonly=" + DIFONLY + "&scratchSave=" + Scratch
				+ "&previousState=" + previousScratch + "&showDelta="
				+ showDelta + "&paintsOnly=" + paintsOnly + "&defaultColour="
				+ defaultColour + "&packageCode=" + PackageCode
				+ "&daysToLive=" + DaysToLive + "&postalCode=" + postalCode
				+ "&ipAddress=" + ipAddress + "&dealerCode=" + dealerCode
				+ "&transactionId=" + transactionId + "&view=" + view;

		String APIresult = getSourceCode(prefix, getSelectOptionURL);
		String ScratchSaveOnly = retriveString(APIresult, prixS1, postS1);
		return ScratchSaveOnly;
	}

	public String getXMLFromGetConfigVehicle(String prefix, String Acode,
			String PaintOnly, String DefaultColor, String PackageCode,
			String DaysToLive, String Language, String PostalCode,
			String IPAddress, String DealerCode, String Scratch,
			String TransactionID, String view) {
		String ConfigVehicleURL = "getconfigvehicle.xml?language=" + Language
				+ "&acode=" + Acode + "&scratchSave=" + Scratch
				+ "&paintsOnly=" + PaintOnly + "&defaultColour=" + DefaultColor
				+ "&packageCode=" + PackageCode + "&daysToLive=" + DaysToLive
				+ "&postalCode=" + PostalCode + "&ipAddress=" + IPAddress
				+ "&dealerCode=" + DealerCode + "&transactionId="
				+ TransactionID + "&view=" + view;
		String APIresult = getSourceCode(prefix, ConfigVehicleURL);
		return APIresult;
	}

	public String getXMLFromGetSaveXML(String prefix, String Language,
			String Acode, String DaysToLive, String ScratchSave,
			String TransactionID) {
		String ConfigVehicleURL = "getsavexml.xml?language=" + Language
				+ "&acode=" + Acode + "&scratchSave=" + ScratchSave
				+ "&daysToLive=" + DaysToLive + "&transactionId="
				+ TransactionID;
		String APIresult = getSourceCode(prefix, ConfigVehicleURL);
		return APIresult;
	}

	// @Test
	public void unitTest() {
		String getSaveXML;
		LoadWebServiceChryslerCA getSaveXMLresult = new LoadWebServiceChryslerCA();
		String pf = "http://ln-qa-chca-was2:80/asiautos/";
		String ad = "CAC50DOS041B2";
		String SS = getSaveXMLresult.getScratchFromConfigVehicle(pf, ad,
				"false", "false", "", "", "", "", "", "", "", "", "1");
		getSaveXML = getSaveXMLresult.getXMLFromGetSaveXML(pf, "", ad, "", SS,
				"");
		System.out.println("getSaveXML output:\n" + getSaveXML);

	}

	public String getpackageCodeFromScratchSave(String scratchsave,
			int startposition, int endpostion) {
		String packageCode = scratchsave.substring(startposition, endpostion);
		return packageCode;
	}

	public void SaveScratch(int i, String Acode, String ScratchText) {
		try {
			BufferedWriter out2 = new BufferedWriter(new FileWriter(dataDir
					+ "Acodes.txt", true));
			// out2.write("("+i+"): "+Acode+": ");
			out2.write(i + ". " + Acode + ": ");
			out2.newLine();
			out2.write(ScratchText);
			out2.newLine();
			out2.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}

}