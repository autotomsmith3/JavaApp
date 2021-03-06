package DealerPortal;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.util.PDFTextStripper;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcceptLicenseAgreementtoContinue extends Comlibs {
	private final WebDriver driver;
	int lineNum;

	public AcceptLicenseAgreementtoContinue(WebDriver driver) throws IOException {
		this.driver = driver;
		// String wh1=driver.getWindowHandle();
		String sPageTitle = "Accept License Agreement to Continue";
		boolean existTitle = TitleDisplay(driver, sPageTitle);
		if (existTitle) {
			rwExcel("", true, "Page Title is displayed", sPageTitle);
		} else {
			rwExcel("", false, "Page title is NOT showing properly. Exceed time limit!",
					"The page title is NOT - " + sPageTitle);
		}
		if (!sPageTitle.equals(driver.getTitle())) {
			System.out.println("Page title does not matche. Expected page title =" + sPageTitle);
		}
	}

	By acceptBtnLocator = By.xpath("//button[@type='submit']");
	By cancelBtnLocator = By.xpath("(//button[@type='submit'])[2]");
	By agreementTitles = By.xpath("//*[@id=\"tabs\"]/li");
	By firstAgreementLocator = By.xpath("//*[@id=\"tabs\"]/li[1]/a");
	By secondAgreementLocator = By.xpath("//*[@id=\"tabs\"]/li[2]/a");
	By thirdAgreementLocator = By.xpath("//*[@id=\"tabs\"]/li[3]/a");
	By pdfURLLocator = By.xpath("//*[@id=\"stockpx\"]/iframe");
	// By Locator=
	// By Locator=
	// By Locator=
	// By Locator=
	// By Locator=
	// By Locator=

	public ImageGallery clickAcceptBtn(WebDriver driver) throws IOException {
		driver.findElement(acceptBtnLocator).click();
		return new ImageGallery(driver);
	}

	public AUTOpxLogin clickCancelBtn(WebDriver driver) throws IOException {
		driver.findElement(cancelBtnLocator).click();
		return new AUTOpxLogin(driver);
	}

	public DealerProfile clickAcceptPSBtn(WebDriver driver) throws IOException {
		driver.findElement(acceptBtnLocator).click();
		return new DealerProfile(driver);
	}

	public void clickFirstAgreementTab(WebDriver driver, String tc) throws IOException {
		boolean elementExist = elementExist(driver, firstAgreementLocator, true, tc);
		if (elementExist) {
			driver.findElement(firstAgreementLocator).click();
		}
	}

	public void clickSecondAgreementTab(WebDriver driver, String tc) throws IOException {
		boolean elementExist = elementExist(driver, secondAgreementLocator, true, tc);
		if (elementExist) {
			driver.findElement(secondAgreementLocator).click();
		}
	}

	public String getPdfURL(WebDriver driver, String px, String tc) throws IOException {
		By pdfURLLocator = By.xpath("//*[@id=\"" + px + "\"]/iframe");
		String pdfURL = "";
		boolean elementExist = elementExist(driver, pdfURLLocator, true, tc);
		if (elementExist) {
			pdfURL = driver.findElement(pdfURLLocator).getAttribute("src");
		}
		return pdfURL;
	}

	public void clickThirdAgreementTab(WebDriver driver, String tc) throws IOException {
		boolean elementExist = elementExist(driver, thirdAgreementLocator, true, tc);
		if (elementExist) {
			driver.findElement(thirdAgreementLocator).click();
		}
	}

	public String getAgreementText(WebDriver driver, By element, boolean agreementExist, String tc) throws IOException {
		String temp = "";
		boolean exist;
		exist = elementExist(driver, element, true, tc);
		if (exist) {
			temp = driver.findElement(element).getText();
		}
		return temp;
	}

	public int getNumOfAgreements(WebDriver driver, int numOfAgreements, String tc) throws IOException {
		int count = 0;
		boolean exist;
		exist = elementExist(driver, agreementTitles, true, tc);
		if (exist) {
			count = driver.findElements(agreementTitles).size();
			// if (count==numOfAgreements){
			// rwExcel(tc, true,"There is (are) "+count+" Agreement title (s) exist.", " The number of Agreement matches the expectation.");
			// }else{
			// rwExcel(tc, false,"There is (are) "+count+" Agreement title (s) exist.", " The number of Agreement does match the expectation ="+numOfAgreements);
			//
			// }
		}
		return count;
	}

	public boolean verifyFirstLeftAgreementTitle(WebDriver driver, int totalAgreement, String agreement,
			boolean agreementExist, String tc) throws IOException {
		String temp = "";
		boolean exist;
		int numOfAgreement = getNumOfAgreements(driver, totalAgreement, tc);
		if (!(numOfAgreement == totalAgreement)) {
			rwExcel(tc, false, "Number of Agreement should =" + totalAgreement,
					"But number of Agreement from site=" + numOfAgreement);
		}
		exist = elementExist(driver, firstAgreementLocator, agreementExist, tc);
		if (agreementExist && exist) {
			temp = driver.findElement(firstAgreementLocator).getText();
		}
		if (temp.equals(agreement) && agreementExist) {
			rwExcel(tc, true, "Verify " + agreement + " title exist on the first left", agreement + " title exists.");
		} else if (agreementExist) {
			rwExcel(tc, false, "Verify " + agreement + " title exist  on the first left",
					agreement + " title does not exist. The title from site is=" + temp);
		} else {
			rwExcel(tc, false, "Verify " + agreement + " title should not exist on the first left",
					"But the " + agreement + " title exists. The title from site is=" + temp);
			exist = false;
		}
		return exist;
	}

	public boolean verifyAgreementTitle(WebDriver driver, int totalAgreement, String agreement, boolean agreementExist,
			String tc) throws IOException {
		// One Agreement
		String temp = "";
		boolean exist;
		int numOfAgreement = getNumOfAgreements(driver, totalAgreement, tc);
		if (!(numOfAgreement == totalAgreement)) {
			rwExcel(tc, false, "Number of Agreement should =" + totalAgreement,
					"But number of Agreement from site=" + numOfAgreement);
		}
		exist = elementExist(driver, firstAgreementLocator, agreementExist, tc);
		if (agreementExist && exist) {
			temp = driver.findElement(firstAgreementLocator).getText();
		}
		if (temp.equals(agreement) && agreementExist) {
			rwExcel(tc, true, "Verify " + agreement + " title exist on the first left", agreement + " title exists.");
		} else if (agreementExist) {
			rwExcel(tc, false, "Verify " + agreement + " title exist  on the first left",
					agreement + " title does not exist. The title from site is=" + temp);
			exist = false;
		} else {
			rwExcel(tc, false, "Verify " + agreement + " title should not exist on the first left",
					"But the " + agreement + " title exists. The title from site is=" + temp);
			exist = false;
		}
		return exist;
	}

	public boolean verifyAgreementTitle(WebDriver driver, int totalAgreement, String agreement1, String agreement2,
			boolean agreementExist, String tc) throws IOException {
		// Two Agreements
		String temp = "";
		boolean exist1, exist2, combinedExist;
		int numOfAgreement = getNumOfAgreements(driver, totalAgreement, tc);
		if (!(numOfAgreement == totalAgreement)) {
			rwExcel(tc, false, "Number of Agreement should =" + totalAgreement,
					"But number of Agreement from site=" + numOfAgreement);
		}
		// First left
		exist1 = elementExist(driver, firstAgreementLocator, agreementExist, tc);
		if (agreementExist && exist1) {
			temp = driver.findElement(firstAgreementLocator).getText();
		}
		if (temp.equals(agreement1) && agreementExist) {
			rwExcel(tc, true, "Verify " + agreement1 + " title exist on the first left", agreement1 + " title exists.");
		} else if (agreementExist) {
			rwExcel(tc, false, "Verify " + agreement1 + " title exist  on the first left",
					agreement1 + " title does not exist. The title from site is=" + temp);
			exist1 = false;
		} else {
			rwExcel(tc, false, "Verify " + agreement1 + " title should not exist on the first left",
					"But the " + agreement1 + " title exists. The title from site is=" + temp);
			exist1 = false;
		}

		// Second left
		exist2 = elementExist(driver, secondAgreementLocator, agreementExist, tc);
		if (agreementExist && exist2) {
			temp = driver.findElement(secondAgreementLocator).getText();
		}
		if (temp.equals(agreement2) && agreementExist) {
			rwExcel(tc, true, "Verify " + agreement2 + " title exist on the second left",
					agreement2 + " title exists.");
		} else if (agreementExist) {
			rwExcel(tc, false, "Verify " + agreement2 + " title exist  on the second left",
					agreement2 + " title does not exist. The title from site is=" + temp);
			exist2 = false;
		} else {
			rwExcel(tc, false, "Verify " + agreement2 + " title should not exist on the second left",
					"But the " + agreement2 + " title exists. The title from site is=" + temp);
			exist2 = false;
		}
		combinedExist = exist1 && exist2;
		return combinedExist;
	}

	public boolean verifyAgreementTitle(WebDriver driver, int totalAgreement, String agreement1, String agreement2,
			String agreement3, boolean agreementExist, String tc) throws IOException {
		// Three Agreements
		String temp = "";
		boolean exist1, exist2, exist3, combinedExist;
		int numOfAgreement = getNumOfAgreements(driver, totalAgreement, tc);
		if (!(numOfAgreement == totalAgreement)) {
			rwExcel(tc, false, "Number of Agreement should =" + totalAgreement,
					"But number of Agreement from site=" + numOfAgreement);
		}
		// First left
		exist1 = elementExist(driver, firstAgreementLocator, agreementExist, tc);
		if (agreementExist && exist1) {
			temp = driver.findElement(firstAgreementLocator).getText();
		}
		if (temp.equals(agreement1) && agreementExist) {
			rwExcel(tc, true, "Verify " + agreement1 + " title exist on the first left", agreement1 + " title exists.");
		} else if (agreementExist) {
			rwExcel(tc, false, "Verify " + agreement1 + " title exist  on the first left",
					agreement1 + " title does not exist. The title from site is=" + temp);
			exist1 = false;
		} else {
			rwExcel(tc, false, "Verify " + agreement1 + " title should not exist on the first left",
					"But the " + agreement1 + " title exists. The title from site is=" + temp);
			exist1 = false;
		}

		// Second left
		exist2 = elementExist(driver, secondAgreementLocator, agreementExist, tc);
		if (agreementExist && exist2) {
			temp = driver.findElement(secondAgreementLocator).getText();
		}
		if (temp.equals(agreement2) && agreementExist) {
			rwExcel(tc, true, "Verify " + agreement2 + " title exist on the second left",
					agreement2 + " title exists.");
		} else if (agreementExist) {
			rwExcel(tc, false, "Verify " + agreement2 + " title exist  on the second left",
					agreement2 + " title does not exist. The title from site is=" + temp);
			exist2 = false;
		} else {
			rwExcel(tc, false, "Verify " + agreement2 + " title should not exist on the second left",
					"But the " + agreement2 + " title exists. The title from site is=" + temp);
			exist2 = false;
		}

		// Third left
		exist3 = elementExist(driver, thirdAgreementLocator, agreementExist, tc);
		if (agreementExist && exist3) {
			temp = driver.findElement(thirdAgreementLocator).getText();
		}
		if (temp.equals(agreement3) && agreementExist) {
			rwExcel(tc, true, "Verify " + agreement3 + " title exist on the third left", agreement3 + " title exists.");
		} else if (agreementExist) {
			rwExcel(tc, false, "Verify " + agreement3 + " title exist  on the third left",
					agreement3 + " title does not exist. The title from site is=" + temp);
			exist2 = false;
		} else {
			rwExcel(tc, false, "Verify " + agreement3 + " title should not exist on the third left",
					"But the " + agreement3 + " title exists. The title from site is=" + temp);
			exist2 = false;
		}

		combinedExist = exist1 && exist2;
		return combinedExist;
	}

	public void verifyPDF(WebDriver driver, int tab, String px, String[] content, int totalLines, String tc,
			String enviroment) throws IOException {
		if (enviroment.equalsIgnoreCase("QA")) {
			String srcURL = "";
			switch (tab) {

			case 1:
				clickFirstAgreementTab(driver, tc);
				srcURL = getPdfURL(driver, px, tc);
				break;
			case 2:
				clickSecondAgreementTab(driver, tc);
				srcURL = getPdfURL(driver, px, tc);
				break;
			case 3:
				clickThirdAgreementTab(driver, tc);
				srcURL = getPdfURL(driver, px, tc);
				break;
			default:
			}

			URL pdfURL = new URL(srcURL);
			BufferedInputStream TestFile = new BufferedInputStream(pdfURL.openStream());

			// BufferedReader TestFile = new BufferedReader(new InputStreamReader(pdfURL.openStream(), "UTF8")); //ok here

			PDFParser TestPDF = new PDFParser(TestFile);
			TestPDF.parse();
			String TestText = new PDFTextStripper().getText(TestPDF.getPDDocument());
			int failedlines = 0;

			boolean sentenceExist = false;
			// int lines=content.length;
			for (int i = 1; i < totalLines + 1; i++) {
				sentenceExist = TestText.contains(content[i]);
				if (sentenceExist) {
					// rwExcel(tc, true, "Verify "+px+" content line \""+i+"\" exist", "The content line \""+i+"\" exists in the PDF file");
					System.out.println("Verify " + px + " content line \"" + i + "\" exist. The content line \"" + i
							+ "\" exists in the PDF file");
				} else {
					rwExcel(tc, false, "Verify " + px + " Agreement PDF,  line \"" + i
							+ "\" does not match expected. The expected PDF should be=", content[i]);
					failedlines++;
				}
			}
			if (TestFile != null) {
				TestFile.close();
			}
			System.out.println("Verify " + px + " PDF. Failed lines " + failedlines);

			if (failedlines > 0) {
				rwExcel(tc, false, "Verify " + px + " Agreement PDF contents. Total lines=" + totalLines,
						"There are total " + failedlines + " lines failed. See details above.");
			} else {
				rwExcel(tc, true, "Verify " + px + " Agreement PDF contents. Total lines=" + totalLines,
						"Contents show as expected.");
			}
		}
	}

	// @Test
	// public void ReadPDF() throws Exception {
	// URL TestURL = new URL("http://www.axmag.com/download/pdfurl-guide.pdf");
	// String [] args;
	// FileInputStream file=null;
	//
	//// PdfRead reader=new PddfRead("");
	//// String myLine=PDFTextExtractor.getTextFromPage(reader,pageNumber);
	//// file=new FileInputStream(args[0]);
	//
	// BufferedInputStream TestFile = new BufferedInputStream(TestURL.openStream());
	//// BufferedReader TestFile = new BufferedReader(new InputStreamReader(TestURL.openStream(), "UTF8")); //ok here
	//
	//
	//
	//// parser = new PDFParser(new RandomAccessFile(file,"r")); // update for PDFBox V 2.0
	//
	//
	//// PDFParser TestPDF = new PDFParser((RandomAccessRead) new RandomAccessFile(TestFile,"r"));
	//
	//
	//
	//
	//
	//// PDFParser TestPDF = new PDFParser(TestFile);
	//// TestPDF.parse();
	//// String TestText = new PDFTextStripper().getText(TestPDF.getPDDocument());
	////
	//// Assert.assertTrue(TestText.contains("Open the setting.xml, you can see it is like this"));
	//
	// }
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

	public String[] getFile(String fileName) throws IOException {
		String[] line;
		line = new String[200];
		StringBuilder result = new StringBuilder("");

		// Get file from resources folder
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream file = classLoader.getResourceAsStream(fileName);

		// File file = new File(classLoader.getResource(fileName).getFile());
		int i = 1;
		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				line[i] = scanner.nextLine();
				i++;
				// result.append(line).append("\n");
			}
			lineNum = i - 1;
			file.close();
			scanner.close();
		}
		return line;
	}

	public int getLineNum() {
		return lineNum;
	}

}