package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login.feature"},glue= {"DriverFactory","StepDefination"},monochrome=true,plugin= {"pretty","html:Reports/cucumber-reports"})
public class TestRunner 
{

}
