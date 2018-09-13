package AdminPortal;

/**
* @author Zhoul
* Initial date: 
* Modified by ...
* replaced by replaced byreplaced by replaced by replaced by replaced by replaced by replaced by replaced by 
* replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by 
* replaced by replaced by replaced by replaced by replaced by replaced by replaced by 
* replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by   
 */
/*
 * replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by 
 * replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by
 * replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by 
 * replaced by replaced by replaced by replaced by replaced by replaced by replaced by replaced by 
 *  
 */
import java.awt.AWTException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
//Test updated 02
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPortalController extends Comlibs {
	private final WebDriver driver;
	final int wt_Secs = 0;
	static String[] vinpxConent = new String[200];
	static String[] stockpxConent = new String[200];
	static String[] lotpxConent = new String[200];
	final static int SINGLE_VIN_RENDER_MAX_WT = 10;
	final static int ALL_VINS_RENDER_MAX_WT = 20;

	public AdminPortalController(WebDriver driver, String myId) throws IOException {
		this.driver = driver;
		// String wh1=driver.getWindowHandle();

		String sPageTitle = "AUTOpx Login";
		boolean existTitle = TitleDisplay(driver, sPageTitle);
		if (existTitle)
			try {
				{
					rwExcel("", true, "Page Title is displayed", sPageTitle);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else {
			rwExcel("", false, "Page title is NOT showing properly. Exceed time limit!",
					"The page title is NOT - " + sPageTitle);
		}
		if (!sPageTitle.equals(driver.getTitle())) {
			// throw new IllegalStateException("The page title is NOT - "
			// + sPageTitle);
		}
	}

	/*
	 * ------------------------------ Home Page Object Repositories: ------------------------------
	 */
	By dealershipNameField = By.id("dealerName");
	By webSite = By.id("dealerSite");
	By tagLineMarkingMsg = By.id("dealerTag");
	By dealershipEmail = By.id("dealerEmail");
	By dealershipPhoneNumber = By.id("dealerPhone");
	By accountEmail = By.id("accEmail");
	By firstName = By.id("userFirstName");
	By lastName = By.id("userLastName");
	By receiveDailyInventoryEmailCheckBox = By.id("emailOptIn");
	By address1 = By.id("dealerAddr1");
	By address2 = By.id("dealerAddr2");
	By city = By.id("dealerCity");
	By country = By.id("dealerCountry");
	By stateProvince = By.id("dealerState");
	By zipPostalCode = By.id("dealerZip");
	By passwordLocator = By.id("userPassword");
	By confirmPasswordLocator = By.id("userConfirm");
	By saveLocator = By.id("saveBtn");
	By dealershipLogo = By.id("//img[@alt='Dealership Image']");
	By upLoadNewPicture = By.id("uploadLogo");
	By removeLogo = By.id("removeLogo");
	By VINpxCheckBox = By.id("vinpx");
	By LOTpxCheckBox = By.id("lotpx");
	By STOCKpxCheckBox = By.id("stockpx");
	By backGround7 = By.id("//div[@id='bg-7']/div/img");

	static String strHelpEmail = "contact@unityworksmedia.com"; // Prod:contact@unityworksmedia.com QA: tdautoaa@gmail.com
	static String strHelpTel = "1-800-293-2056";
	static int allVinNums = 0;
	static int allImageNums = 0;
	static String urlLink;

	public static VDVILogin loadURL(WebDriver driver, String bURL) throws IOException {
		driver.get(bURL);
		return new VDVILogin(driver);
	}

	public static void vehicleGallery(WebDriver driver, String brw, String envment)
			throws IOException, InterruptedException {
	}

	public static void inventoryGalleryTC(WebDriver driver, String brw, String envment, String ver)
			throws IOException, InterruptedException {
	}

	private static String[] fetchOneDemArrayFromPropFile(String propertyName, Properties propFile)
			throws IOException, InterruptedException {
		// get array split up by the colin
		String a[] = propFile.getProperty(propertyName).split(",");
		return a;
	}

	public static String getVehGUIDfromDealerCodeAndVIN(String dlrCode, String sVin)
			throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:sqlserver://LNOC-Q13V-MSQ1.autodata.org;user=VDVIWebServicesUserQA;password=HDuMy873JRFpkkU9;database=VDVI_Master");

		System.out.println("test");

		Statement sta = conn.createStatement();
		String Sql = "select dt01.DlrCode,vt01.VIN, vt01.VehGUID from DT01_Dealer as dt01 inner join VT01_DealerVehicles as vt01 on DT01.DlrGUID=VT01.DlrGUID where vt01.VIN=\'"
				+ sVin + "\' and dt01.DlrCode=\'" + dlrCode + "\'";
		String vGUID = "";
		ResultSet rs = sta.executeQuery(Sql);
		int icolumn = rs.getRow();
		while (rs.next()) {
			icolumn = rs.getRow();
			vGUID = rs.getString("VehGUID");
			System.out.println("Row =" + icolumn);
			System.out.println("Dealer Code = " + rs.getString("DlrCode") + "  VIN = " + rs.getString("VIN")
					+ "  VehGUID = " + rs.getString("VehGUID"));
		}
		if (icolumn == 1) {
			System.out.println("One VehGUID\n");
			// rs.getString("VehGUID");
			// String vGUID = rs.getString("VehGUID");
		} else {
			System.out.println("No any VehGUID or more than one\n");
			vGUID = "error!";
		}
		rs.close();
		sta.close();
		conn.close();
		return vGUID;
	}

	public static void RetriveValuesFrDealerSettingsPage(WebDriver driver, String brw, String versionNum,
			String envment, String checkEmail)
			throws IOException, InterruptedException, ClassNotFoundException, SQLException {

		// Load environment parameters
		Properties prop = new Properties();
		// testprop.load(new FileInputStream("data/autopxConf.properties"));
		try {
			prop.load(AdminPortalController.class.getClassLoader()
					.getResourceAsStream("AdminPortalData/adminPortalConf.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String env = prop.getProperty("AUTOpx.environment");
		String envBrowser = prop.getProperty("AUTOpx.browser");
		String render = prop.getProperty("AUTOpx.render");
		String addNewVIN = prop.getProperty("AUTOpx.addNewVIN");
		String accountEmail = prop.getProperty(env + ".VINpxEmail");
		String accountPS = prop.getProperty(env + ".VINpxPassword");
		// String baseURL = prop.getProperty(env + ".VINpxDealerPortalBaseURL");
		String dealershipName = prop.getProperty(env + ".VINpxDealershipname");
		String dealerCode = prop.getProperty(env + ".VINpxDealerCode");
		String vin01 = prop.getProperty(env + ".VINpxVin01");
		String vin02 = prop.getProperty(env + ".VINpxVin02");
		String vehGUID01 = prop.getProperty(env + ".VINpxVin01GUID");
		String vehGUID02 = prop.getProperty(env + ".VINpxVin02GUID");
		// String vinpxnewVin01 = prop.getProperty(env + ".VINpxNewVIN01");
		String[] VINpxNewVINs = fetchOneDemArrayFromPropFile(env + ".VINpxNewVINs", prop);
		String serverName = prop.getProperty(env + ".serverName");
		String dbName = prop.getProperty(env + ".dbName");
		String userName = prop.getProperty(env + ".userName");
		String password = prop.getProperty(env + ".password");
		String MaxVins = prop.getProperty(env + ".MaxVinsForPreview");
		int MaxVinsForPreview = Integer.parseInt(MaxVins);
		// Initial
		// final int wt_Secs = 6;
		String TCnum;
		// ====================
		String tempVIN = "";
		String tempVehGUID = "";
		String ProductVINpx = "";
		String ProductSTOCKpx = "";
		String ProductLOTpx = "";
		String Dealership_ID = "";
		String Dealership_Name = "";
		String Dealership_Email = "";
		String Account_Email = "";
		String Metadata = "";
		String dlrGuid = "";
		// ====================
		Comlibs ac = new Comlibs();
		ac.rwExcel("", "*********Retrive Values From Dealership Settings page**********", "");

		int count = 0;
		String getMetadataSavePathFile = "C:\\1\\Eclipse\\Test Results\\AUTOpx" + "\\Metadata_" + env + ".xls";
		String[] titleString = { "Env.", "S/N", "Dealership_ID", "Dealership_Name", "Account_Email", "Dealership_Email",
				"ProductVINpx", "ProductSTOCKpx", "ProductLOTpx", "Metadata", "dlrGuid" };
		// =================================================
		ac.writeTitle(getMetadataSavePathFile, titleString);
		int dataLength = 54;
		String[] metadataValues = new String[dataLength + 1];
		int datasize = metadataValues.length;

		// =================================================
		VDVILogin loginP = new VDVILogin(driver);
		int dealerN = 0;
		String dealerSN = "";
		loginP.login(driver, accountEmail, accountPS, "");
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		DealerList DealerListP = new DealerList(driver);
		DealerListP.clickDisplayDropDownBtn(driver, "3");
		DealerListP.scrollUp(driver, -3000, "ddd"); // QA -2000 Prod -3000

		for (int i = 0; i < 150; i++) {
			if (i >= 10) {
				ac.Wait(2);
				DealerListP.scrollUp(driver, 55, "ddd"); // 60 should be in Prod. 55 can run 150 records in QA. 120 - get almost 2 lines. 80 can run until 28 records, 60 can run until 110-120
				ac.Wait(2);
			}
			dealerN = dealerN + 1;
			dealerSN = String.valueOf(dealerN);
			DealerListP.clickEditBtn(driver, dealerSN);
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
			}
			DealerProfile DealerProfieP = new DealerProfile(driver);
			// =========================================
			ProductVINpx = DealerProfieP.getVINpxProduct(driver, "");
			ProductSTOCKpx = DealerProfieP.getSTOCKpxProduct(driver, "");
			ProductLOTpx = DealerProfieP.getLOTpxProduct(driver, "");
			Dealership_ID = DealerProfieP.getDealershipID(driver);
			Dealership_Name = DealerProfieP.getDealershipName(driver);
			Dealership_Email = DealerProfieP.getDealershipEmail(driver);
			Account_Email = DealerProfieP.getAccountEmail(driver);
			Metadata = DealerProfieP.getMetadata(driver);
			dlrGuid = DealerProfieP.getDlrGuid(driver);
			dlrGuid = DealerProfieP.trimURL(dlrGuid);
			// =========================================

			int wSize = titleString.length;
			String[] DealerSettingsArray = new String[wSize];

			DealerSettingsArray[0] = env;
			DealerSettingsArray[1] = Integer.toString(i);
			DealerSettingsArray[2] = Dealership_ID;
			DealerSettingsArray[3] = Dealership_Name;
			DealerSettingsArray[4] = Account_Email;
			DealerSettingsArray[5] = Dealership_Email;
			DealerSettingsArray[6] = ProductVINpx;
			DealerSettingsArray[7] = ProductSTOCKpx;
			DealerSettingsArray[8] = ProductLOTpx;
			DealerSettingsArray[9] = Metadata;
			DealerSettingsArray[10] = dlrGuid;
			ac.writeToSheet(getMetadataSavePathFile, DealerSettingsArray);

			// =========================================

			System.out.println("Dealer number=" + dealerN);
			System.out.println(
					"VINpx=" + ProductVINpx + "\n" + "STOCKpx= " + ProductSTOCKpx + "\n" + "LOTpx= " + ProductLOTpx);
			System.out.println("Dealership_ID: " + Dealership_ID + "\n" + "Dealership_Name: " + Dealership_Name + "\n"
					+ "Dealership_Email: " + Dealership_Email + "\n" + "Account_Email: " + Account_Email + "\n"
					+ "Metadata: " + Metadata + "\n" + "dlrGuid:" + dlrGuid + "\n");

			DealerProfieP.clickBackToDealerListBtn(driver, parentHandle, "TC_num");

		}
		driver.close();
	}

	public static void ManageDealerShips(WebDriver driver, String brw, String versionNum, String envment,
			String checkEmail) throws IOException, InterruptedException, ClassNotFoundException, SQLException {

		// Load environment parameters
		Properties prop = new Properties();
		// testprop.load(new FileInputStream("data/autopxConf.properties"));
		try {
			prop.load(AdminPortalController.class.getClassLoader()
					.getResourceAsStream("AdminPortalData/adminPortalConf.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String env = prop.getProperty("AUTOpx.environment");
		String envBrowser = prop.getProperty("AUTOpx.browser");
		String render = prop.getProperty("AUTOpx.render");
		String addNewVIN = prop.getProperty("AUTOpx.addNewVIN");
		String accountEmail = prop.getProperty(env + ".VINpxEmail");
		String accountPS = prop.getProperty(env + ".VINpxPassword");
		// String baseURL = prop.getProperty(env + ".VINpxDealerPortalBaseURL");
		String dealershipName = prop.getProperty(env + ".VINpxDealershipname");
		String dealerCode = prop.getProperty(env + ".VINpxDealerCode");
		String vin01 = prop.getProperty(env + ".VINpxVin01");
		String vin02 = prop.getProperty(env + ".VINpxVin02");
		String vehGUID01 = prop.getProperty(env + ".VINpxVin01GUID");
		String vehGUID02 = prop.getProperty(env + ".VINpxVin02GUID");
		// String vinpxnewVin01 = prop.getProperty(env + ".VINpxNewVIN01");
		String[] VINpxNewVINs = fetchOneDemArrayFromPropFile(env + ".VINpxNewVINs", prop);
		String serverName = prop.getProperty(env + ".serverName");
		String dbName = prop.getProperty(env + ".dbName");
		String userName = prop.getProperty(env + ".userName");
		String password = prop.getProperty(env + ".password");
		String MaxVins = prop.getProperty(env + ".MaxVinsForPreview");
		int MaxVinsForPreview = Integer.parseInt(MaxVins);
		// dealership profile:
		String OEM = prop.getProperty(env + ".OEM");
		String[] Brands = fetchOneDemArrayFromPropFile(env + ".Brands", prop);
		String DealershipID = prop.getProperty(env + ".DealershipID");
		String DealershipName = prop.getProperty(env + ".DealershipName");
		String[] Products = fetchOneDemArrayFromPropFile(env + ".Products", prop);
		String MetadataValues = prop.getProperty(env + ".MetadataValues");
		String Addrss = prop.getProperty(env + ".Addrss");
		String AddressLine2 = prop.getProperty(env + ".AddressLine2");
		String City = prop.getProperty(env + ".City");
		String StateProvince = prop.getProperty(env + ".StateProvince");
		String Country = prop.getProperty(env + ".Country");
		String ZipPostalCode = prop.getProperty(env + ".ZipPostalCode");
		String DealershipEmail = prop.getProperty(env + ".DealershipEmail");
		String AccountEmail = prop.getProperty(env + ".AccountEmail");
		String FirstName = prop.getProperty(env + ".FirstName");
		String LastName = prop.getProperty(env + ".LastName");
		String TagLineMarkingMsg = prop.getProperty(env + ".TagLineMarkingMsg");
		String Website = prop.getProperty(env + ".Website");
		String DealershipPhoneNumber = prop.getProperty(env + ".DealershipPhoneNumber");
		int TemplateSettings = Integer.parseInt(prop.getProperty(env + ".TemplateSettings"));
		int SelectBackgroundSet = Integer.parseInt(prop.getProperty(env + ".SelectBackgroundSet"));

		// Initial
		// final int wt_Secs = 6;
		String TCnum;
		// ====================
		String tempVIN = "";
		String tempVehGUID = "";
		String ProductVINpx = "";
		String ProductSTOCKpx = "";
		String ProductLOTpx = "";
		String Dealership_ID = "";
		String Dealership_Name = "";
		String Dealership_Email = "";
		String Account_Email = "";
		String Metadata = "";
		String dlrGuid = "";
		// ====================
		Comlibs ac = new Comlibs();
		ac.rwExcel("", "*********ManageDealerShips**********", "");

		int count = 0;
		String getMetadataSavePathFile = "C:\\1\\Eclipse\\Test Results\\AUTOpx" + "\\Metadata_" + env + ".xls";
		String[] titleString = { "Env.", "S/N", "Dealership_ID", "Dealership_Name", "Account_Email", "Dealership_Email",
				"ProductVINpx", "ProductSTOCKpx", "ProductLOTpx", "Metadata", "dlrGuid" };
		// =================================================
		ac.writeTitle(getMetadataSavePathFile, titleString);
		int dataLength = 54;
		String[] metadataValues = new String[dataLength + 1];
		int datasize = metadataValues.length;

		// =================================================
		VDVILogin loginP = new VDVILogin(driver);
		int dealerN = 0;
		String dealerSN = "";
		loginP.login(driver, accountEmail, accountPS, "");
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		DealerList DealerListP = new DealerList(driver);
		DealerListP.clickDisplayDropDownBtn(driver, "3");
		DealerListP.scrollUp(driver, -3000, "ddd"); // QA -2000 Prod -3000
		// click Add Dealership btn
		DealerListP.clickAddDealerShipBtn(driver);

		DealerProfile DealerProfieP = new DealerProfile(driver);
		DealerProfieP.selectOEM(driver, 13);
		// check Buick and Cadillac and Chevrolet and GMC
		// DealerProfieP.selectOEMBrands(driver, 1); // check Buick
		// DealerProfieP.selectOEMBrands(driver, 2); // check Cadillac
		// DealerProfieP.selectOEMBrands(driver, 3); // check Chevrolet
		// DealerProfieP.selectOEMBrands(driver, 4); // check GMC
		// DealerProfieP.selectOEMBrands(driver, 5); // check Hummer
		for (String brand : Brands) {
			DealerProfieP.selectOEMBrands(driver, Integer.parseInt(brand));
		}

		DealerProfieP.inputDealersipID(driver, DealershipID);
		DealerProfieP.selectVINpxProd(driver);
		DealerProfieP.selectSTOCKpxProd(driver);
		// DealerProfieP.selectLOTpxProd(driver);
		DealerProfieP.inputMetadata(driver, MetadataValues);

		DealerProfieP.selectTemplateSetting(driver, TemplateSettings);// DEFAULT=1; replace=2;overlay=3;
		DealerProfieP.selectBackGroundSet(driver, SelectBackgroundSet);// Generic Dealership=7; White Gradient=0

		// Stop here!!!
		// Enter Dealership ID and all fields

		driver.close();

		for (int i = 0; i < 150; i++) {
			if (i >= 10) {
				ac.Wait(2);
				DealerListP.scrollUp(driver, 55, "ddd"); // 60 should be in Prod. 55 can run 150 records in QA. 120 - get almost 2 lines. 80 can run until 28 records, 60 can run until 110-120
				ac.Wait(2);
			}
			dealerN = dealerN + 1;
			dealerSN = String.valueOf(dealerN);
			DealerListP.clickEditBtn(driver, dealerSN);
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
			}
			// DealerProfile DealerProfieP = new DealerProfile(driver);
			// =========================================
			ProductVINpx = DealerProfieP.getVINpxProduct(driver, "");
			ProductSTOCKpx = DealerProfieP.getSTOCKpxProduct(driver, "");
			ProductLOTpx = DealerProfieP.getLOTpxProduct(driver, "");
			Dealership_ID = DealerProfieP.getDealershipID(driver);
			Dealership_Name = DealerProfieP.getDealershipName(driver);
			Dealership_Email = DealerProfieP.getDealershipEmail(driver);
			Account_Email = DealerProfieP.getAccountEmail(driver);
			Metadata = DealerProfieP.getMetadata(driver);
			dlrGuid = DealerProfieP.getDlrGuid(driver);
			dlrGuid = DealerProfieP.trimURL(dlrGuid);
			// =========================================

			int wSize = titleString.length;
			String[] DealerSettingsArray = new String[wSize];

			DealerSettingsArray[0] = env;
			DealerSettingsArray[1] = Integer.toString(i);
			DealerSettingsArray[2] = Dealership_ID;
			DealerSettingsArray[3] = Dealership_Name;
			DealerSettingsArray[4] = Account_Email;
			DealerSettingsArray[5] = Dealership_Email;
			DealerSettingsArray[6] = ProductVINpx;
			DealerSettingsArray[7] = ProductSTOCKpx;
			DealerSettingsArray[8] = ProductLOTpx;
			DealerSettingsArray[9] = Metadata;
			DealerSettingsArray[10] = dlrGuid;
			ac.writeToSheet(getMetadataSavePathFile, DealerSettingsArray);

			// =========================================

			System.out.println("Dealer number=" + dealerN);
			System.out.println(
					"VINpx=" + ProductVINpx + "\n" + "STOCKpx= " + ProductSTOCKpx + "\n" + "LOTpx= " + ProductLOTpx);
			System.out.println("Dealership_ID: " + Dealership_ID + "\n" + "Dealership_Name: " + Dealership_Name + "\n"
					+ "Dealership_Email: " + Dealership_Email + "\n" + "Account_Email: " + Account_Email + "\n"
					+ "Metadata: " + Metadata + "\n" + "dlrGuid:" + dlrGuid + "\n");

			DealerProfieP.clickBackToDealerListBtn(driver, parentHandle, "TC_num");
		}
		driver.close();
	}

	public static void main(String[] args)
			throws IOException, InterruptedException, ClassNotFoundException, SQLException, AWTException {
		// Load environment parameters
		Properties prop = new Properties();
		// testprop.load(new FileInputStream("data/autopxConf.properties"));
		try {
			prop.load(AdminPortalController.class.getClassLoader()
					.getResourceAsStream("AdminPortalData/adminPortalConf.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String env = prop.getProperty("AUTOpx.environment");
		String versionNum = prop.getProperty("AUTOpx.versionNum");
		String tBrowser = prop.getProperty("AUTOpx.browser");
		String envDevice = prop.getProperty("AUTOpx.envDevice");
		String accountEmail = prop.getProperty(env + ".AllProdEmail");
		// String accountPS = prop.getProperty(env + ".AllProdPassword");
		String baseURL = prop.getProperty(env + ".AdminPortalBaseURL");
		String chkEmail = prop.getProperty("AUTOpx.checkEmail");

		// String dealershipName = prop.getProperty(env + ".Dealershipname");

		// String[] VINpxNewVIN01
		// =fetchOneDemArrayFromPropFile(env+".VINpxNewVINs",prop);
		for (int i = 0; i < 1; i++) {
			System.out.println("Testing is started in " + env + "\n");
			// Initial
			Comlibs bc = new Comlibs();
			final WebDriver driver;
			driver = bc.drivers(tBrowser);// Firefox, Chrome
			driver.manage().deleteAllCookies();
			System.out.println("Test Browser = " + tBrowser + "\n");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (!tBrowser.equalsIgnoreCase("Chromexxxxxxxxx")) { // only Chrome doesn't work since Chrome updated on Jul, 2017, works on Dec 13,2017 webdriver ver3.8.5
				bc.SelecBroswerResolution(driver, envDevice);
			}
			bc.rwExcel("", "****** Testing started ******" + (i + 1), "");
			bc.rwExcel("", "Test Browser", tBrowser);
			bc.rwExcel("", "Test Environment", env);

			loadURL(driver, baseURL);
			// tempDebug(driver);// ***************************************Debug*****************************************
			// AddAllVINs(driver, tBrowser, env); //works, need to execlude #VINpx only in properties file, and include ##Add All VINs to VINpx - Add all New VIN

			// //// 0.General Inventory Gallery
			// bc.rwExcel("", "-----General Inventory Gallery Testing started-----" + (i + 1), "");
			// inventoryGalleryTC(driver, tBrowser, env, versionNum);
			// vehicleGallery(driver, tBrowser, env);
			// verifyRerender(driver, tBrowser);

			////// 1.RetriveValuesFrDealerSettingsPage:
			// bc.rwExcel("", "-----RetriveValuesFrDealerSettingsPage Testing started-----" + (i + 1), "");
			// RetriveValuesFrDealerSettingsPage(driver, tBrowser, versionNum, env, chkEmail);
			////// 1.ManageDealerShips:
			bc.rwExcel("", "-----ManageDealerShips Testing started-----" + (i + 1), "");
			ManageDealerShips(driver, tBrowser, versionNum, env, chkEmail);

			// bc.rwExcel("", "****** Testing is complete ****** " + (i + 1), "");
			// driver.close();
			System.out.println("Test is complete!!!");
		}
		return;
	}
}