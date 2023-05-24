package TestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {
	
	//@Test
	void test_hardassertion()

	{
		System.out.println("testing...");
		System.out.println("testing...");
		System.out.println("testing...");
		System.out.println("testing...");
		
		Assert.assertEquals(1,2);//if it will fail below statement will not be executed
		
		System.out.println("hard assertion completed");
		
		Assert.assertEquals(1,1);
		
	}
	
	@Test
	void test_softassertion()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		System.out.println("testing...");
		System.out.println("testing...");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1,2);
		
		System.out.println("soft assertion completed");
		sa.assertEquals(1,2);
		
		sa.assertAll(); //mandatory
		
	}
}
