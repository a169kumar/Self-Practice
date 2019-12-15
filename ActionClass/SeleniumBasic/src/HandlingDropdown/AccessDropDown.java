package HandlingDropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AccessDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	WebElement country=	driver.findElement(By.name("country"));
		Select s= new Select(country);
	List<WebElement> l=	s.getOptions();
	System.out.println(l.size());
		//s.selectByIndex(1);   // select by index number
		//s.selectByValue("AMERICAN SAMOA"); // select by vALUE // STRING
	   /*for (int i=0;i<l.size();i++) {
		System.out.println( l.get(i).getText());
		if(l.get(i).getText().equalsIgnoreCase("ZAIRE")) {
			//l.get(i).click();
			s.selectByIndex(i);
		}
		System.out.println(l.get(i).getAttribute("value"));
		System.out.println(l.get(i).getAttribute("innerhtml"));
	   }*/
	
	/*Iterator<WebElement> o=l.iterator(); 
	while(o.hasNext()) {
		String g=o.next().getText();
		if(g.equalsIgnoreCase("VANUATU")) {
			//o.next().click();
		//s.selectByIndex(o);
			s.selectByValue(g);
			s.selectByVisibleText(g);
			
		}*/
	
	for(WebElement option:l) {
		System.out.println(option.getText());
		if(option.getText().equals("TAJIKISTAN")) {
			option.click();
			//return;
			break;
		}

		
	}}}
	
	   
	


