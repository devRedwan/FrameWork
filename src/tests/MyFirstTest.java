package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTest {

	
	// Step 1: Initiate browser
	@Test
	public void testingFirstName(){
		
	
	WebDriver driver = new ChromeDriver();
	// Path of the chrome browser
	driver.get("http://www.facebook.com");
		// Jar is a collection of Java Classes 
	
	
}
}