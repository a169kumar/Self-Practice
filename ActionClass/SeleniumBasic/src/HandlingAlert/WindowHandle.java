package HandlingAlert;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WindowHandle{

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Library\\chromedriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		//System.setProperty("webdriver.chrome.driver",".//browserdrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		//driver.get("https://www.toolsqa.com/selenium-webdriver/handling-multiple-browsers-in-selenium-webdriver/");
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	
	  //  driver.findElement(By.id("cookie-law-info-bar")); 
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.findElement(By.id("button1")).click();
	
	}

}
