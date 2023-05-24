package TestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@SuppressWarnings("unused")
	@Test
	void test()
	{
		int x=10;
		int y=15;
		
		/*if (x==y)
		{
		System.out.println("test passed");
		}
	
	    else
	    {
	    	System.out.println("test failed");
	    }*/
		
		
		//Assert.assertEquals(x,y);
		
		//Assert.assertTrue(true); //pass
		//Assert.assertTrue(false);//pass
		
		int a=20;
		int b=10;
		 
		Assert.assertEquals(a>b,true,"a is greater than b");
		
		String s1="abc";
		String s2="abc1";
		
		Assert.assertEquals(s1,s2,"strings are not equal"); //pass
		
		Assert.assertNotEquals(s1,s2);//fail
		
		if(true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			//Assert.assertTrue(false);
			Assert.fail();
		}
	}

}
