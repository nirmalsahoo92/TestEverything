package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import UIOperator.UIOperator;

public class ObjectRepository extends UIOperator
{

	@FindBy(how = How.XPATH, using = "//input[@id='txtUsername']")
	public static WebElement USERNAME;
	@FindBy(how = How.XPATH, using = "//input[@id='txtPassword']")
	public static WebElement PASSWORD;
	@FindBy(how = How.XPATH, using = "//input[@id='btnLogin']")
	public static WebElement LOGINBTN;
	@FindBy(how = How.XPATH, using = "//li[text()='Dashboard']")
	public static WebElement HomePage;
	@FindBy(how = How.XPATH, using = "//*[@id='menu-content']")
	public static WebElement BaseMenu;
	@FindBy(how = How.XPATH, using = "//*[@class='page-title']")
	public static WebElement BasePageTitle;	
}
