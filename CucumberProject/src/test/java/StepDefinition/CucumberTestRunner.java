package StepDefinition;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = " ",features = {"C:\\Users\\nirmalraj.s\\Desktop\\Selenium Cucumber\\CucumberProject\\src\\test\\resources\\features"},glue = {"StepDefinition"},
plugin = {"pretty","html:target/htmlreport.html"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

	

}