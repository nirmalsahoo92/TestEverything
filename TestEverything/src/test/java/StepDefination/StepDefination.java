package StepDefination;
import AllLogic.AllLogic;
import DriverFactory.BaseTest;
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




}
