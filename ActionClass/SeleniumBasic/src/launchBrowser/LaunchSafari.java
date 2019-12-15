package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchSafari {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("http://www.gmail.com");

	}

}
