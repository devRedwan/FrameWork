package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Locators.Locators;
import Values.vlaues;
import base.config;

public class MyFirstTest extends config{

	Locators loc = new Locators ();
	vlaues val = new vlaues();
	
	
	
	
	
	// Step 1: Initiate browser
	@Test
	public void testingFirstName(){
		
	System.out.println("testingFirstName");
	
	// xpath - webelement/ locators
	// test data - value (using sendkeys)
	// driver.findElement
	
	typeByXpath(loc.fnameLocator,val.fnameValue);
	driver.findElement(By.xpath(loc.fnameLocator)).sendKeys(val.fnameValue);
	// lastName
	driver.findElement(By.xpath(loc.lnameLocator)).sendKeys(val.lnameValue);
		// Jar is a collection of Java Classes 
	// test develop branch
	
	// testing feature Branch
	
	
    }
}