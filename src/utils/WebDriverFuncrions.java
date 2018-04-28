package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class WebDriverFuncrions {
	
	public static Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
	
	public WebDriver driver ;
	
	public void typeByXpath(String loc, String value){
		
		driver.findElement(By.xpath(loc)).sendKeys(value);
	
		
		}
	}
