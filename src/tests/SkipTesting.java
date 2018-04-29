package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.config;

public class SkipTesting extends config{
	
	@Test
	public void goingToSKipThis(){
		System.out.println("I am going to skip this class");
		APPLICATION_LOGS.debug("THis TC will skip ");
		throw new SkipException ("THis one is no longer needed");
		
	}
	
	@Test (enabled=false)
	public void disableTest(){
		System.out.println("I am NOT going to skip this class");
}

	@Test
	public void notgoingToSKipThis(){
		System.out.println("I am NOT going to skip this class");
	}
	
	
}