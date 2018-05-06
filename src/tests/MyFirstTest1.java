package tests;

import org.testng.annotations.Test;
import Locators.Locators;
import Values.vlaues;
import base.config;

public class MyFirstTest1 extends config{

	Locators loc = new Locators ();
	vlaues val = new vlaues();
	
	
	
	// Step 1: Initiate browser
	@Test
	public void testingFirstName(){
		
	System.out.println("testingFirstName");
	
	// xpath - webelement/ locators
	// test data - value (using sendkeys)
	// driver.findElement
	
	
	APPLICATION_LOGS.debug("My test started xRED!");
	typeByXpath(loc.fnameLocator,val.fnameValue);
	
	
	APPLICATION_LOGS.debug("My Test EnededxRED@");
	
	
	
	//APPLICATION_LOGS.debug("My test started ");
	// Jar is a collection of Java Classes 
	//@test = Define a test
	// @BeforeTest = Define Run once before all tests
	// @AfterTest = Define Run once After all tests
	// BeforeClass = Define Run before every class
	// AfterClass = Define Run
		    }
}