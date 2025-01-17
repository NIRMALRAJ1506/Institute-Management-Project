package pageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class HomePageFactory {

	WebDriver driver;
	private WebDriverWait wait;
	@FindBy(xpath = "//img[@alt='Institute Logo']")
	WebElement logo;
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation3 css-3su884-MuiPaper-root']//div[@class='MuiBox-root css-h5fkc8']")
	WebElement map;
	
	@FindBy(xpath = "//img[@title='Placement Drive']")
	WebElement placement;
	
	
	@FindBy(xpath = "//img[@alt='Computer Science and Engineering (CSE)']")
	WebElement cs;
	
	
	@FindBy(xpath = "//button[normalize-space()='Send Message']")
	WebElement sms;
	
	public void logoIsDisplayed() {
		logo.isDisplayed();
	}
	
	public void MapisDisplayed() {
		map.isDisplayed();
	}
	
	public void placementisDisplayed() {
		placement.isDisplayed();
	}
	
	
	
	
	
	public void csisDisplayed() {
		cs.isDisplayed();
	}
	
	public void smsisDisplayed() throws InterruptedException {
		sms.isDisplayed();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nirmal");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nirmal@gmail.com");
		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Feedback");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Very Nice Institute");
	
//        // Switch to the alert
//        Alert alert = driver.switchTo().alert();
//
//        // Get the text of the alert
//        String alertMessage = alert.getText();
//
//        // Optionally, you can assert the message of the alert
//        Assert.assertEquals(alertMessage, "Thank you our esteemed member, your message has been recorded");
//
//        // Accept the alert (click OK)
//        alert.accept();
//
//        // Close the browser
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        // Scroll down to the bottom of the page
//	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	        
	        // Alternatively, you can scroll to a specific element if needed
	  
	         js.executeScript("arguments[0].scrollIntoView(true);", sms);
	         Thread.sleep(1000);
	         sms.click();
	        // Switch to the alert
	        Alert alert = driver.switchTo().alert();
	
	        Thread.sleep(2000);
	        // Get the text of the alert
	        String alertMessage = alert.getText();
	
	        
	        // Optionally, you can assert the message of the alert
	        Assert.assertEquals(alertMessage, "Thank you our esteemed member, your message has been recorded");
	       
	        // Accept the alert (click OK)
	        alert.accept();
	
	        // Close the browser
	}
	
	
	public HomePageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
