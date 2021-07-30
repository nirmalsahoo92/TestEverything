package DriverFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static WebDriver getDriver() throws IOException
	{
		if (getProperty("browser").equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			List<String> excludeSwitches =  new ArrayList<String>();
			excludeSwitches.add("enable-automation");
			options.setExperimentalOption("excludeSwitches", excludeSwitches);
			options.setAcceptInsecureCerts(true);
			
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			return driver;	
		}
		if(getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			return driver;
		}
		if(getProperty("browser").equalsIgnoreCase("edge"))
		{			
		}
		return driver;	
	}

	public static void quitBrowser() 
	{
		driver.quit();
	}
	
	public static String getProperty(String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream("src/test/resources/EnvironmentConfig");
		Properties pro = new Properties();
		pro.load(fis);
		return (String) pro.get(key);	
	}
	
}
