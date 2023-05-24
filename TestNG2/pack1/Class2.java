package TestNG2.pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@ Test
	void xyz()
	{
		System.out.println("this is xyz from class2");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("this is after test method");	
	}

}
