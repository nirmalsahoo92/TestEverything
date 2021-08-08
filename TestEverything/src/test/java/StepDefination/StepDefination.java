package StepDefination;
import java.util.List;

import AllLogic.AllLogic;
import DriverFactory.BaseTest;
import ObjectRepository.ObjectRepository;
import UIOperator.UIOperator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefination extends BaseTest
{
	AllLogic alllogic = new AllLogic();
	

	@Given("^I login to portal$")
	public void i_login_to_portal() throws Throwable {
		alllogic.login();
	}
	@When("^I open menu \"([^\"]*)\"$")
	public void i_open_menu(String menu) throws Throwable {
		alllogic.openMenu(menu);
	}
	@When("I click on {string} button")
	public void i_click_on_button(String string) throws InterruptedException {
		 Thread.sleep(20000);
		 UIOperator.actionClick(ObjectRepository.AddButton);
	}
	@When("I create user with following data")
	public void i_create_user_with_following_data(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	{
		List<String> data= dataTable.asList();
		alllogic.createUser(data);
	}




}
