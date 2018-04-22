package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test (priority=1)
	public void myTEST(){
		System.out.println("MY TEST CASE ! ! ");
		
	}
	
	@BeforeSuite
	public void beforeSuite(){
		
		System.out.println ("************ TEST SUITE STARTED");
		
	}
	
	@AfterSuite
	public void afterSuite(){
		
		System.out.println ("************ TEST SUITE Ended");
	
}
	
	@Test (priority=2)
	public void myTEST2(){
		System.out.println("MY TEST CASE 2 ! ! ");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("**** BEFORE TEST ");
		
	}
		
	@AfterTest
	public void aftertest(){
		
		System.out.println ("************ AFTER TEST ");
	
}
	
	@Test (priority=3)
	public void myTEST3(){
		System.out.println("MY TEST CASE 3 ! ! ");
	}
	
	@BeforeClass
	public void beforeCLass(){
		System.out.println("**** BEFORE CLASS ");
		
	}
		
	@AfterClass
	public void afterClass(){
		
		System.out.println ("************ AFTER Class ");
	
}
	
	@Test (priority=4)
	public void myTEST4(){
		System.out.println("MY TEST CASE 4 ! ! ");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("**** BEFORE Method ");
		
	}
		
	@AfterMethod
	public void afterMethod(){
		
		System.out.println ("************ AFTER Method ");
	
}

}