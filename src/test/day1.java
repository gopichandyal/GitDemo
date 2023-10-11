package test;


import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 
{
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I am going last");		
	}
	@Test
	public void Demo()
	{
		System.out.println("Hello World");
		Assert.assertTrue(false);
		
	}
	
	@AfterSuite
	public void asSuite()
	{
		System.out.println("I am the last one to exit this app");
	}
	
	public void SecondTest()
	{
		System.out.println("See you Later :-)");
		System.out.println("Bye");
	}

}
