package DealerPortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class hello {

	public static void main(String[] args) {
		//See how to install WebDrivr for Edge - https://www.youtube.com/watch?v=YzGLpovLIoo
		WebDriver driver = new EdgeDriver();
		System.out.println("Hello world!");
		driver.get("http://lnoc-q13v-xwa1.autodata.org/DealerPortal/authenticate");

		System.out.println("Hello world!!");
		System.out.println("Hello world!!!");
	}

}
