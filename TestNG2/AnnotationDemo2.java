package TestNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	
	@BeforeClass
	void login() 
	{
		System.out.println("Login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search...");
	
	}
	
	@Test(priority=2)
	void advancesearch()
	{
		System.out.println("Advance search...");
	
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("Logout...");
	
	}
	
	@AfterTest
	void n()
	{
		System.out.println("this is after test method");	
	}
	
	


}
