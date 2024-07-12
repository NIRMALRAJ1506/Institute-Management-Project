package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	static WebDriver driver;


@Given("User is on the home page")
public void user_is_on_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User is trying to log in");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://localhost:3000/");
    
}
//a[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit css-1j0lvuz-MuiButtonBase-root-MuiButton-root']
@Given("clicks on navigate login button")
public void clicks_on_navigate_login_button() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User is clicking on log in button");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.findElement(By.xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit css-1j0lvuz-MuiButtonBase-root-MuiButton-root']\r\n"
    		+ "")).click();

	
}
@Then("user is navigated to the login page")
public void user_is_navigated_to_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(driver.findElements(By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4 css-sgvcr0-MuiTypography-root']\r\n")).size()>0,"user is navigated to login page");
}


//li[normalize-space()='Student']

@When("User enters valid {string} and {string} and {string}")
public void user_enters_valid_and(String username, String password,String usertype) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions

    driver.findElement(By.xpath("//input[@id=':r1:']")).sendKeys(username);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id=':r3:']")).sendKeys(password);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id=':r5:']")).click();
    String clicking = "//li[normalize-space()='"+usertype+"']";
    driver.findElement(By.xpath(clicking)).click();


}

@When("clicks on login button")
public void clicks_on_login_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
}

@Then("user is navigated to the home page {string}")
public void user_is_navigated_to_the_home_page(String home) {
    // Write code here that turns the phrase above into concrete actions
    String header = "//h3[normalize-space()='"+home+"']";

	Assert.assertTrue(driver.findElements(By.xpath(header)).size()>0,"user is navigated to home  page");
}
//h3[normalize-space()='Dear Student Welcomeback']
//h3[normalize-space()='Dear Admin Welcomeback']
//h3[normalize-space()='Dear Trainer Welcomeback']

@Then("close the browser")
public void close_the_browser() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
System.out.println("close browser");
Thread.sleep(2000);
driver.close();

}




}
