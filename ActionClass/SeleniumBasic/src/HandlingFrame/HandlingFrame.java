package HandlingFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		String mw=driver.getWindowHandle();
		System.out.println(mw);
//	driver.switchTo().frame(0);
		//driver.findElement(By.id("a077aa5e")).click();
		 List<WebElement> s=driver.findElements(By.tagName("iframe"));
		System.out.println(s.size());
	     //for(int i=0;i<s.size();i++) {
			driver.switchTo().frame(3);
		String cw=	driver.getWindowHandle();
		System.out.println(cw);
			driver.findElement(By.xpath("//*[@src=\"Jmeter720.png\"]")).click();
			System.out.println(cw);
		//System.out.println(total);
		driver.switchTo().defaultContent();
		String mw1=driver.getWindowHandle();
		System.out.println(mw1);

		
	}
	
	Select n= new Select(null);
		
		}



