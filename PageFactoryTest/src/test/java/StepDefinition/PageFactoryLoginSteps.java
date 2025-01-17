package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

public class PageFactoryLoginSteps {

	static WebDriver driver;
	
	HomePageFactory home;
	LoginPageFactory login;
	@Given("User is on Home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is trying to log in");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://localhost:3000/");
	    home=new HomePageFactory(driver);
	    home.logoIsDisplayed();
	}

	@When("User clicks on AboutUs button")
	public void user_clicks_on_about_us_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[normalize-space()='About Us']")).click();
		home=new HomePageFactory(driver);
	    home.MapisDisplayed();
	}

	@When("User clicks on Placements button")
	public void user_clicks_on_placements_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//a[normalize-space()='Placements']")).click();
			home=new HomePageFactory(driver);
		    home.placementisDisplayed();
	}

	@When("User clicks on Departments button")
	public void user_clicks_on_departments_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//a[normalize-space()='Departments']")).click();
			home=new HomePageFactory(driver);
		    home.csisDisplayed();
	}

	@When("User clicks on ContactUs button")
	public void user_clicks_on_contact_us_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click();
			home=new HomePageFactory(driver);
		    home.smsisDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

@Given("User is on the home page")
public void user_is_on_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
	 	driver.get("http://localhost:3000/");
	    home=new HomePageFactory(driver);
	    home.logoIsDisplayed();
}

@And("clicks on navigate login button")
public void clicks_on_navigate_login_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 JavascriptExecutor js = (JavascriptExecutor) driver;
     
     // Scroll down to the bottom of the page
//     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//     
     // Alternatively, you can scroll to a specific element if needed
WebElement LOGINBUTTON = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
      js.executeScript("arguments[0].scrollIntoView(true);", LOGINBUTTON);
	System.out.println("User is clicking on log in button");
	
	
	Thread.sleep(2000);
    LOGINBUTTON.click();
}

@Then("user is navigated to the login page")
public void user_is_navigated_to_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
//	login=new LoginPageFactory(driver);
//	login.logoDisplayed();
	
}

@When("User enters valid {string} and {string} and {string}")
public void user_enters_valid_and_and(String username, String password, String usertype) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 Thread.sleep(1000);
	 	driver.findElement(By.xpath("//input[@id=':r1:']")).sendKeys(username);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id=':r3:']")).sendKeys(password);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id=':r5:']")).click();
	    String clicking = "//li[normalize-space()='"+usertype+"']";
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(clicking)).click();
	    Thread.sleep(2000);
	
}

@Then("clicks on login button")
public void clicks_on_login_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}


































@Given("User is on the Student home page")
public void user_is_on_the_student_home_page() throws InterruptedException {
	Thread.sleep(1000);

    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(driver.findElements(By.xpath("//h3[normalize-space()='Dear Student Welcomeback']")).size()>0,"user is navigated to Student Home page");


}

@Given("clicks on navigate Student Database button")
public void clicks_on_navigate_student_database_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(2000);

 JavascriptExecutor js = (JavascriptExecutor) driver;
     
     // Scroll down to the bottom of the page
//     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//     
     // Alternatively, you can scroll to a specific element if needed
WebElement sdButton = driver.findElement(By.xpath("//span[normalize-space()='Students Database']"));
      js.executeScript("arguments[0].scrollIntoView(true);", sdButton);
	System.out.println("User is clicking on student database button");
	 Thread.sleep(1000);
	//span[normalize-space()='Students Database']
    driver.findElement(By.xpath("//span[normalize-space()='Students Database']")).click();
    Thread.sleep(2000);
	//h2[normalize-space()='This is Student Database']
	WebElement sdHead = driver.findElement(By.xpath("//h2[normalize-space()='This is Student Database']"));
    js.executeScript("arguments[0].scrollIntoView(true);", sdHead);
	
}

@Then("clicks on Add student button")
public void clicks_on_add_student_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(2000);

    driver.findElement(By.xpath("//a[@class='btn btn-outline-success']")).click();
}

@When("students enters valid {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
public void students_enters_valid_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='RollNo']")).sendKeys(string);
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(string2);
	driver.findElement(By.xpath("//input[@name='Dept']")).sendKeys(string3);
	driver.findElement(By.xpath("//input[@name='Contact']")).sendKeys(string4);
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(string5);
	 JavascriptExecutor js = (JavascriptExecutor) driver;

	WebElement sgender = driver.findElement(By.xpath("//input[@name='Gender']"));
    js.executeScript("arguments[0].scrollIntoView(true);", sgender);
    Thread.sleep(1000);

	
	
	driver.findElement(By.xpath("//input[@name='Gender']")).sendKeys(string6);
	driver.findElement(By.xpath("//input[@name='DOB']")).sendKeys(string7);
	driver.findElement(By.xpath("//input[@name='Address']")).sendKeys(string8);
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(string9);
	WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='submit']"));
    js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
	Thread.sleep(1000);
	subbutton.click();
	   Alert alert = driver.switchTo().alert();
		
       Thread.sleep(2000);
       // Get the text of the aler
       // Accept the alert (click OK)
       alert.accept();

	
	

}

@Then("clicks on edit button")
public void clicks_on_edit_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    WebElement bttm = driver.findElement(By.xpath("//div[@class='text-center p-4 footer']"));
    js.executeScript("arguments[0].scrollIntoView(true);", bttm);
    Thread.sleep(1000);
  //tbody/tr[27]/td[11]/a[1]
    driver.findElement(By.xpath("//tbody/tr[18]/td[11]/a[1]")).click();
    Thread.sleep(1000);
    WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='submit']"));
    js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
	Thread.sleep(1000);
	subbutton.click();
	 Alert alert = driver.switchTo().alert();
		
     Thread.sleep(2000);
     // Get the text of the aler
     // Accept the alert (click OK)
     alert.accept();

}



@Then("clicks on delete button")
public void clicks_on_delete_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement bttm = driver.findElement(By.xpath("//div[@class='text-center p-4 footer']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", bttm);
	    Thread.sleep(1000);
	    
	    
	    driver.findElement(By.xpath("//tbody/tr[18]/td[11]/button[1]")).click();

	    Alert alert = driver.switchTo().alert();
		
	       Thread.sleep(2000);
	       // Get the text of the aler
	       // Accept the alert (click OK)
	       alert.accept();
		    Thread.sleep(1000);

	       Alert alert2 = driver.switchTo().alert();
			
	       Thread.sleep(2000);
	       // Get the text of the aler
	       // Accept the alert (click OK)
	       alert2.accept();

}


@Then("clicks on logout button")
public void clicks_on_logout_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement head = driver.findElement(By.xpath("//h3[normalize-space()='Dear Student Welcomeback']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", head);
	    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
    Alert alert2 = driver.switchTo().alert();
	
    Thread.sleep(2000);
    // Get the text of the aler
    // Accept the alert (click OK)
    alert2.accept();

}


@Given("User is on the Trainer home page")
public void user_is_on_the_trainer_home_page() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(driver.findElements(By.xpath("//h3[normalize-space()='Dear Trainer Welcomeback']")).size()>0,"user is navigated to Student Home page");
}
@Then("Clicks on courses database button")
public void clicks_on_courses_database_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	  Thread.sleep(2000);

	  JavascriptExecutor js = (JavascriptExecutor) driver;
	      
	      // Scroll down to the bottom of the page
//	      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	      
	      // Alternatively, you can scroll to a specific element if needed
	 WebElement sdButton = driver.findElement(By.xpath("//span[normalize-space()='Courses Database']"));
	       js.executeScript("arguments[0].scrollIntoView(true);", sdButton);
	 	System.out.println("User is clicking on student database button");
	 	 Thread.sleep(1000);
	     sdButton.click();

	 	//h2[normalize-space()='This is Student Database']
	       js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h2[normalize-space()='This is Course Database']")));
	 	System.out.println("User is clicking on courses database button");
	 	 Thread.sleep(1000);
	 	 
}

@Then("Clicks on courses add button")
public void clicks_on_courses_add_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[@class='btn btn-outline-success']")).click();}

@When("User is on courses add page {string} and {string} and {string} and {string}")
public void user_is_on_courses_add_page_and_and_and(String string, String string2, String string3, String string4) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[contains(@name,'CourseID')]")).sendKeys(string);
	driver.findElement(By.xpath("//input[@name='CourseName']")).sendKeys(string2);
	driver.findElement(By.xpath("//input[@name='CourseTrainer']")).sendKeys(string3);
	driver.findElement(By.xpath("//input[@name='CourseDuration']")).sendKeys(string4);
	  JavascriptExecutor js = (JavascriptExecutor) driver;

	WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='submit']"));
    js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
	Thread.sleep(1000);
	subbutton.click();
	   Alert alert = driver.switchTo().alert();
		
       Thread.sleep(2000);
       // Get the text of the aler
       // Accept the alert (click OK)
       alert.accept();

}

@Then("clicks on course edit button")
public void clicks_on_course_edit_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    WebElement bttm = driver.findElement(By.xpath("//div[@class='text-center p-4 footer']"));
    js.executeScript("arguments[0].scrollIntoView(true);", bttm);
    Thread.sleep(1000);
  //tbody/tr[27]/td[11]/a[1]
    driver.findElement(By.xpath("//tbody/tr[14]/td[6]/a[1]//*[name()='svg']")).click();
    Thread.sleep(1000);
  //button[normalize-space()='submit']
    WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='submit']"));
    js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
	Thread.sleep(1000);
	subbutton.click();
	 Alert alert = driver.switchTo().alert();
		
     Thread.sleep(2000);
     // Get the text of the aler
     // Accept the alert (click OK)
     alert.accept();}

@Then("clicks on course delete button")
public void clicks_on_course_delete_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement bttm = driver.findElement(By.xpath("//div[@class='text-center p-4 footer']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", bttm);
	    Thread.sleep(1000);
	    
	    
	    driver.findElement(By.xpath("//tbody/tr[14]/td[6]/button[1]")).click();

	    Alert alert = driver.switchTo().alert();
		
	       Thread.sleep(2000);
	       // Get the text of the aler
	       // Accept the alert (click OK)
	       alert.accept();
		    Thread.sleep(1000);

	       Alert alert2 = driver.switchTo().alert();
			
	       Thread.sleep(2000);
	       // Get the text of the aler
	       // Accept the alert (click OK)
	       alert2.accept();}


@Then("clicks on trainer logout button")
public void clicks_on_trainer_logout_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement head = driver.findElement(By.xpath("//h3[normalize-space()='Dear Trainer Welcomeback']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", head);
	    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
    Alert alert2 = driver.switchTo().alert();
	
    Thread.sleep(2000);
    // Get the text of the aler
    // Accept the alert (click OK)
    alert2.accept();

}










@Given("User is on the Admin home page")
public void user_is_on_the_admin_home_page() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(driver.findElements(By.xpath("//h3[normalize-space()='Dear Admin Welcomeback']")).size()>0,"user is navigated to Student Home page");
}
@Then("Admin clicks on Add student button")
public void admin_clicks_on_add_student_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);

    driver.findElement(By.xpath("//a[@class='btn btn-outline-success']")).click();
    }
@When("Admin enters valid {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
public void admin_enters_valid_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@name='RollNo']")).sendKeys(string);
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(string2);
	driver.findElement(By.xpath("//input[@name='Dept']")).sendKeys(string3);
	driver.findElement(By.xpath("//input[@name='Contact']")).sendKeys(string4);
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(string5);
	 JavascriptExecutor js = (JavascriptExecutor) driver;

	WebElement sgender = driver.findElement(By.xpath("//input[@name='Gender']"));
    js.executeScript("arguments[0].scrollIntoView(true);", sgender);
    Thread.sleep(1000);

	
	
	driver.findElement(By.xpath("//input[@name='Gender']")).sendKeys(string6);
	driver.findElement(By.xpath("//input[@name='DOB']")).sendKeys(string7);
	driver.findElement(By.xpath("//input[@name='Address']")).sendKeys(string8);
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(string9);
	WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='submit']"));
    js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
	Thread.sleep(1000);
	subbutton.click();
	   Alert alert = driver.switchTo().alert();
		
       Thread.sleep(2000);
       // Get the text of the aler
       // Accept the alert (click OK)
       alert.accept();

	
}
@Then("Admin clicks on edit button")
public void admin_clicks_on_edit_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    WebElement bttm = driver.findElement(By.xpath("//div[@class='text-center p-4 footer']"));
    js.executeScript("arguments[0].scrollIntoView(true);", bttm);
    Thread.sleep(1000);
  //tbody/tr[27]/td[11]/a[1]
    driver.findElement(By.xpath("//tbody/tr[18]/td[11]/a[1]")).click();
    Thread.sleep(1000);
    WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='submit']"));
    js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
	Thread.sleep(1000);
	subbutton.click();
	 Alert alert = driver.switchTo().alert();
		
     Thread.sleep(2000);
     // Get the text of the aler
     // Accept the alert (click OK)
     alert.accept();
}
@Then("Admin clicks on delete button")
public void admin_clicks_on_delete_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement bttm = driver.findElement(By.xpath("//div[@class='text-center p-4 footer']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", bttm);
	    Thread.sleep(1000);
	    
	    
	    driver.findElement(By.xpath("//tbody/tr[18]/td[11]/button[1]")).click();

	    Alert alert = driver.switchTo().alert();
		
	       Thread.sleep(2000);
	       // Get the text of the aler
	       // Accept the alert (click OK)
	       alert.accept();
		    Thread.sleep(1000);

	       Alert alert2 = driver.switchTo().alert();
			
	       Thread.sleep(2000);
	       // Get the text of the aler
	       // Accept the alert (click OK)
	       alert2.accept();
}
@Then("Admin Clicks on courses database button")
public void admin_clicks_on_courses_database_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);

	  JavascriptExecutor js = (JavascriptExecutor) driver;
	      
	      // Scroll down to the bottom of the page
//	      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	      
	      // Alternatively, you can scroll to a specific element if needed
	 WebElement sdButton = driver.findElement(By.xpath("//span[normalize-space()='Courses Database']"));
	       js.executeScript("arguments[0].scrollIntoView(true);", sdButton);
	 	System.out.println("User is clicking on student database button");
	 	 Thread.sleep(1000);
	     sdButton.click();

	 	//h2[normalize-space()='This is Student Database']
	       js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h2[normalize-space()='This is Course Database']")));
	 	System.out.println("User is clicking on courses database button");
	 	 Thread.sleep(1000);
}
@Then("Admin Clicks on courses add button")
public void admin_clicks_on_courses_add_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[@class='btn btn-outline-success']")).click();
	    }
@When("Admin is on courses add page {string} and {string} and {string} and {string}")
public void admin_is_on_courses_add_page_and_and_and(String string, String string2, String string3, String string4) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[contains(@name,'CourseID')]")).sendKeys(string);
	driver.findElement(By.xpath("//input[@name='CourseName']")).sendKeys(string2);
	driver.findElement(By.xpath("//input[@name='CourseTrainer']")).sendKeys(string3);
	driver.findElement(By.xpath("//input[@name='CourseDuration']")).sendKeys(string4);
	  JavascriptExecutor js = (JavascriptExecutor) driver;

	WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='submit']"));
    js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
	Thread.sleep(1000);
	subbutton.click();
	   Alert alert = driver.switchTo().alert();
		
       Thread.sleep(2000);
       // Get the text of the aler
       // Accept the alert (click OK)
       alert.accept();
}
@Then("Admin clicks on course edit button")
public void admin_clicks_on_course_edit_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    WebElement bttm = driver.findElement(By.xpath("//div[@class='text-center p-4 footer']"));
    js.executeScript("arguments[0].scrollIntoView(true);", bttm);
    Thread.sleep(1000);
  //tbody/tr[27]/td[11]/a[1]
    driver.findElement(By.xpath("//tbody/tr[14]/td[6]/a[1]//*[name()='svg']")).click();
    Thread.sleep(1000);
  //button[normalize-space()='submit']
    WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='submit']"));
    js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
	Thread.sleep(1000);
	subbutton.click();
	 Alert alert = driver.switchTo().alert();
		
     Thread.sleep(2000);
     // Get the text of the aler
     // Accept the alert (click OK)
     alert.accept();}
@Then("Admin clicks on course delete button")
public void admin_clicks_on_course_delete_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement bttm = driver.findElement(By.xpath("//div[@class='text-center p-4 footer']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", bttm);
	    Thread.sleep(1000);
	    
	    
	    driver.findElement(By.xpath("//tbody/tr[14]/td[6]/button[1]")).click();

	    Alert alert = driver.switchTo().alert();
		
	       Thread.sleep(2000);
	       // Get the text of the aler
	       // Accept the alert (click OK)
	       alert.accept();
		    Thread.sleep(1000);

	       Alert alert2 = driver.switchTo().alert();
			
	       Thread.sleep(2000);
	       // Get the text of the aler
	       // Accept the alert (click OK)
	       alert2.accept();
	       }
@Then("Admin clicks on Trainer database button")
public void admin_clicks_on_trainer_database_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);

	  JavascriptExecutor js = (JavascriptExecutor) driver;
	      
	      // Scroll down to the bottom of the page
//	      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	      
	      // Alternatively, you can scroll to a specific element if needed
	 WebElement sdButton = driver.findElement(By.xpath("//span[normalize-space()='Trainer Database']"));
	       js.executeScript("arguments[0].scrollIntoView(true);", sdButton);
	 	System.out.println("User is clicking on trainer database button");
	 	 Thread.sleep(1000);
	     sdButton.click();

	 	//h2[normalize-space()='This is Student Database']
	       js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h2[normalize-space()='This is Trainer Database']")));
	 	System.out.println("User is clicking on trainer database button");
	 	 Thread.sleep(1000);
	 	 }


@Then("clicks on add admin button")
public void clicks_on_add_admin_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);

    driver.findElement(By.xpath("//a[@class='btn btn-outline-success']")).click();
	
}
@When("Admin enters valid {string} and {string} and {string} and {string} and {string}")
public void admin_enters_valid_and_and_and_and(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@name='TrainerID']")).sendKeys(string);
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(string2);
	driver.findElement(By.xpath("//input[@name='Contact']")).sendKeys(string3);
	driver.findElement(By.xpath("//input[@name='Designation']")).sendKeys(string4);
	driver.findElement(By.xpath("//input[@name='Experience']")).sendKeys(string5);
	  JavascriptExecutor js = (JavascriptExecutor) driver;

	WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='submit']"));
    js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
	Thread.sleep(1000);
	subbutton.click();
	   Alert alert = driver.switchTo().alert();
		
       Thread.sleep(2000);
       // Get the text of the aler
       // Accept the alert (click OK)
       alert.accept();
       }
@Then("Admin clicks on edit trainer button")
public void admin_clicks_on_edit_trainer_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    WebElement bttm = driver.findElement(By.xpath("//div[@class='text-center p-4 footer']"));
    js.executeScript("arguments[0].scrollIntoView(true);", bttm);
    Thread.sleep(1000);
  //tbody/tr[27]/td[11]/a[1]
    driver.findElement(By.xpath("//tbody/tr[8]/td[7]/a[1]")).click();
    Thread.sleep(1000);
  //button[normalize-space()='submit']
    WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='submit']"));
    js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
	Thread.sleep(1000);
	subbutton.click();
	 Alert alert = driver.switchTo().alert();
		
     Thread.sleep(2000);
     // Get the text of the aler
     // Accept the alert (click OK)
     alert.accept();
     }
@Then("Admin clicks on delete trainer button")
public void admin_clicks_on_delete_trainer_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement bttm = driver.findElement(By.xpath("//div[@class='text-center p-4 footer']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", bttm);
	    Thread.sleep(1000);
	    
	    
	    driver.findElement(By.xpath("//tbody/tr[8]/td[7]/a[1]")).click();

	    Alert alert = driver.switchTo().alert();
		
	       Thread.sleep(2000);
	       // Get the text of the aler
	       // Accept the alert (click OK)
	       alert.accept();
		    Thread.sleep(1000);

	       Alert alert2 = driver.switchTo().alert();
			
	       Thread.sleep(2000);
	       // Get the text of the aler
	       // Accept the alert (click OK)
	       alert2.accept();
	       }
@Then("Admin clicks on contact list button")
public void admin_clicks_on_contact_list_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Admin clicks on delete contact button")
public void admin_clicks_on_delete_contact_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("clicks on Admin logout button")
public void clicks_on_admin_logout_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}













}
