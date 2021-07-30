package AllLogic;

import java.io.IOException;

import org.openqa.selenium.By;
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
		String xpath = null;
		String[] menuList = menu.split("=>");
		for (int i = 0; i < menuList.length; i++) 
		{	
			switch (i) {
			case 0:
				xpath = "//li[contains(@id,'_"+menuList[0].toLowerCase()+"_') and contains(@class,'level1')]";
				clickElement(ObjectRepository.BaseMenu.findElement(By.xpath(xpath)));
				break;
			case 1:
				xpath = xpath.concat("//li[contains(@id,'"+menuList[1]+"') and contains(@class,'level2')]");
				clickElement(ObjectRepository.BaseMenu.findElement(By.xpath(xpath)));
				break;
			case 2:
				xpath = xpath.concat("//*[text()='"+menuList[2]+"']");
				clickElement(ObjectRepository.BaseMenu.findElement(By.xpath(xpath)));
				break;
			default:
				break;
			}
		}
		waitForPageTitleToBeLoaded();
	}

}
