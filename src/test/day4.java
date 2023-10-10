package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 
{
	@Parameters({"URL"})
	@Test
	public void WebLoginHome()
	{
		//Selenium
		System.out.println("Web Login Home");
		System.out.println("Web Login Home Personnal Loan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHome()
	{
		//Appium
		System.out.println("Mobile Login Home");
	}
	
	@Test
	public void LoginAPIHome()
	{
		//REST API Automation
		System.out.println("Login API Home");
	}

}
