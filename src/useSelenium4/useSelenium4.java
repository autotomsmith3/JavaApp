package useSelenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class useSelenium4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final WebDriver driver;
//		driver = WebDriver.Firefox();
//		System.out.print("Hello 1");
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.print("Hello 2");
	}

}
