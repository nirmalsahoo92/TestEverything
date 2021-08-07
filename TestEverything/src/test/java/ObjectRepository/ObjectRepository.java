package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import UIOperator.UIOperator;

public class ObjectRepository extends UIOperator
{

	//General Section
	
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
	@FindBy(how = How.XPATH, using = "//*[text()='add']")
	public static WebElement AddButton;	
	@FindBy(how = How.XPATH, using = "//div[@class='spinner-layer']")
	public static WebElement Spinner;
	@FindBy(how = How.XPATH, using = "//*[text()='Save']")
	public static WebElement Save;

	
    //Add User section
	@FindBy(how = How.XPATH, using = "//input[@id='selectedEmployee_value']")
	public static WebElement EmployeeName_AddUser;
	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	public static WebElement UserName_AddUser;
	@FindBy(how = How.XPATH, using = "//button[@data-id='adminrole']")
	public static WebElement AdminRole_AddUser;
	@FindBy(how = How.XPATH, using = "//*[@role='option']//*[text()='main']")
	public static WebElement AdminRoleMain_AddUser;
	@FindBy(how = How.XPATH, using = "//*[@id='confirmpassword']")
	public static WebElement ConfirmPassword_AddUser;
	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	public static WebElement Password_AddUser;

}
