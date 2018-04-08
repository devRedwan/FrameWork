package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTest {

	
	// Step 1: Initiate browser
	@Test
	public void testingFirstName(){
		
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	driver.get("http://www.facebook.com");
		// Jar is a collection of Java Classes 
	// test develop branch
	
	// testing feature Branch
	
	
    }
}