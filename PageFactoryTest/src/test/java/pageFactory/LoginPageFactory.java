package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageFactory {
	
	
	
	WebDriver driver;
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	public void enterCredentials(String username,String password,String usertype) throws InterruptedException {
		   Thread.sleep(2000);
		 	driver.findElement(By.xpath("//input[@id=':r1:']")).sendKeys(username);
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id=':r3:']")).sendKeys(password);
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id=':r5:']")).click();
		    String clicking = "//li[normalize-space()='"+usertype+"']";
		    driver.findElement(By.xpath(clicking)).click();
	}
}
