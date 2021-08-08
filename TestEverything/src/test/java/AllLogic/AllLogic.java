package AllLogic;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BaseTest;
import ObjectRepository.ObjectRepository;
import UIOperator.UIOperator;

public class AllLogic extends UIOperator
{
	public AllLogic() {	
		PageFactory.initElements(driver, ObjectRepository.class);
}
	public void login() throws IOException, InterruptedException 
	{
		driver.get(getProperty("url"));
		setData(ObjectRepository.USERNAME, BaseTest.getProperty("username"));
		setData(ObjectRepository.PASSWORD, BaseTest.getProperty("password"));
		clickElement(ObjectRepository.LOGINBTN);
		waitForElementToDisplay(ObjectRepository.HomePage);	
	}
	public void openMenu(String menu) throws InterruptedException
	{
		String[] menuItem = menu.split("=>");
		String xpath = null;
		for (int i = 0; i < menuItem.length; i++) 
		{
			switch (i) 
			{
			case 0:
				xpath = "//*[contains(@id,'"+menuItem[0]+"') and contains(@class,'level1')]";
				clickElement(ObjectRepository.BaseMenu.findElement(By.xpath(xpath)));
				break;
			case 1:
				xpath = "//*[contains(@id,'"+menuItem[1].replaceAll("\\s+","")+"') and contains(@class,'level2')]";
				clickElement(ObjectRepository.BaseMenu.findElement(By.xpath(xpath)));
				break;
			case 2:
				xpath = "//*[text()='"+menuItem[2]+"']";
				clickElement(ObjectRepository.BaseMenu.findElement(By.xpath(xpath)));
				break;
			}
		}
	}
	public void createUser(List<String> data) throws InterruptedException 
	{
		Thread.sleep(3000);
		setData(ObjectRepository.EmployeeName_AddUser, data.get(0));
		setData(ObjectRepository.UserName_AddUser, data.get(1));
		dynamicSelectValue(ObjectRepository.AdminRole_AddUser, data.get(2));
		setData(ObjectRepository.Password_AddUser, data.get(3));
		setData(ObjectRepository.ConfirmPassword_AddUser, data.get(4));
		clickElement(ObjectRepository.Save);
	}
	public void dynamicSelectValue(WebElement element,String value) 
	{
		clickElement(element);
		String[] data= element.toString().split("->")[1].replace("]]", "]").split(": ");
		String xpath= data[1];
		xpath = xpath+"//..//*[@role='option']//*[text()='"+value+"']";
		clickElement(driver.findElement(By.xpath(xpath)));
		
	}

}
