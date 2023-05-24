package TestNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is before Suite method");	
	}
	
	@AfterSuite()
	void as()
	{

		System.out.println("this is after Suite method");	
	}
	
	@BeforeTest
	void m()
	{
		System.out.println("this is before test method");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("this is after test method");	
	}
	
	@BeforeClass
	void login() 
	{
		System.out.println("This is before class...");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is after class...");
	
	}
	
	@BeforeMethod
	void bm() 
	{
		System.out.println("This is after method...");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is before method...");
	
	}
	
	@Test(priority=1)
	void tm1()
	{
		System.out.println("This is test method 1");
	
	}
	
	@Test(priority=2)
	void tm2()
	{
		System.out.println("This is test method  2.");
	
	}

}
