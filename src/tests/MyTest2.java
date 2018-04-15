package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest2 {
	
	@Test
	public void testingFirstName(){
		
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	driver.get("http://www.facebook.com");

}
	
}
