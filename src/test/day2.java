package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 
{
	@Test(groups= {"Smoke"})
	public void PLoan()
	{
		System.out.println("Good");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I need to verify first");
		System.out.println("I need to verify first");
		System.out.println("I need to verify first");
		System.out.println("I need to verify first");
		System.out.println("I need to verify first");
		System.out.println("I need to verify first");
		System.out.println("I need to verify first");
		System.out.println("I need to verify first");
	}
	@BeforeTest
	public void prerequisite12()
	{
		System.out.println("I need to verify Asian");
		System.out.println("I need to verify Asian");
		System.out.println("I need to verify Asian");
		System.out.println("I need to verify Asian");
		System.out.println("I need to verify Asian");
		System.out.println("I need to verify Asian");
	}

}
