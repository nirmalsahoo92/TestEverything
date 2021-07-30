package DriverFactory;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class InitBrowser extends BaseTest
{	
	@Before
	public void initBrowser() throws IOException 
	{
		getDriver();
	}
	@After
	public void closeBrowser() 
	{
		quitBrowser();
	}
}
