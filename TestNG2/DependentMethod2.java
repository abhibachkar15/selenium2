  package TestNG2;

import org.testng.annotations.Test;

import graphql.Assert;

public class DependentMethod2 {
	
	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,  dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=5, dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}

}
