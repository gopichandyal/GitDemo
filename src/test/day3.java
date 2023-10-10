package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 
{
	@BeforeClass
	public void befrClass()
	{
		System.out.println("Class will execute before any method in day 3 class Excute");
	}
	@Parameters({"URL", "APIKey/usrname"})	
	@Test
	public void WebLogin(String urlnam, String Key)
	{
		//Selenium
		System.out.println("Web Login CAR");
		System.out.println(urlnam);
		System.out.println(Key);
	}
	
	@BeforeMethod
	public void befrEvery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@Test
	public void MobileLogin()
	{
		//Appium
		System.out.println("Mobile Login CAR");
	}
	
	@BeforeSuite
	public void BFSuite()
	{
		System.out.println("I am number one");
	}
	
	@AfterMethod
	public void afrEvery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	@AfterClass
	public void afrClass()
	{
		System.out.println("Class will execute after any method in day 3 class Excute");
	}
	@Test(groups= {"Smoke"})
	public void MobileSignIn()
	{
		//Appium1
		System.out.println("Mobile SignIn CAR");
	}
	@Test(dataProvider="getData")
	public void MobileLogOut(String user, String pass)
	{
		//Appium2
		System.out.println("Mobile Logout CAR");
		System.out.println(user);
		System.out.println(pass);
	}
	@Test(dependsOnMethods= {"WebLogin", "MobileSignIn"})
	public void APICar()
	{
		//REST API Automation
		System.out.println("Login API CAR");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st - Combination - username password - good credit history
		//2nd - username password - no credit history
		//3rd - Fraudelent credit history
		Object[][] data = new Object[3][2];
		//1st - set
		data[0][0] = "user01";
		data[0][1] = "pass01";
		//2nd - set
		data[1][0] = "user02";
		data[1][1] = "pass02";
		//3rd - set
		data[2][0] = "user03";
		data[2][1] = "pass03";
		
		return data;
	}

}
