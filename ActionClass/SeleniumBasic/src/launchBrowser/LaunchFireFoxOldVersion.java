package launchBrowser;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFireFoxOldVersion {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.gecko.driver", "F:\\Selenium Library\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "F:\\Selenium Library\\geckodriver.exe");
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");*/
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Library\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" ");
		driver.get(" ");
		Dimension d = new Dimension(800, 600);
		 driver.manage().window().setSize(d);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		driver.navigate().forward();
		
		driver.findElement(By.id("button1")).click();
		driver.manage().timeouts().pageLoadTimeout(20,  TimeUnit.SECONDS
				);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	
	
	}

}
