package TestNG2;

import org.testng.annotations.*;

public class AnnotationDemo1 {
	
	@BeforeMethod
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
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logout...");
	
	}

}
