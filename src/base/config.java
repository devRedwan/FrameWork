package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.WebDriverFuncrions;

public class config extends WebDriverFuncrions {
	// do all the configuration
	// initiate the driver > setup Browser > Company URL > xyz
	
	
	
	@BeforeTest
	
public void initDrivers(){
	

	 driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	driver.get("http://www.facebook.com");

	
	
}
}
