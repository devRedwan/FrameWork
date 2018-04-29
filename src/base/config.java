package base;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


import utils.WebDriverFuncrions;

public class config extends WebDriverFuncrions {
	// do all the configuration
	// initiate the driver > setup Browser > Company URL > xyz
	
	
	
	String browsertype = "ch";
	
	@BeforeTest
	
public void initDrivers() throws InterruptedException{
	

	 if (browsertype.equalsIgnoreCase("FF")){
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	APPLICATION_LOGS.debug("FIREFOX BROWSER STARTED");
	
	
    } else if (browsertype.equalsIgnoreCase("ch")){
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	APPLICATION_LOGS.debug("CHROME BROWSER STARTED");
    	
    	
    }
	 driver.get("http://www.facebook.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicit wait - will wait for all elements to load
	 
  }	




}
