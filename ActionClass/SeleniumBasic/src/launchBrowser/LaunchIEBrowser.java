package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LaunchIEBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "F:\\Selenium Library\\operadriver.exe");
		WebDriver driver= new OperaDriver();
		driver.get("http://www.facebook.com");
		driver.navigate().refresh();
	}

}
