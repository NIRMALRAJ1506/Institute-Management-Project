package com.TestApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws InterruptedException {
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extent.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test=extent.createTest("React Project Test","This is a test to validate React Project SignUp Functionality");
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		
		test.log(Status.INFO,"Starting Test Case");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://172.17.7.125:3000/signup");
		
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='signup-form-container']//div[1]//input[1]")).sendKeys("Nirmal");
		Thread.sleep(1000);
		test.pass("Entered text data in Name field");
		driver.findElement(By.xpath("//div[2]//input[1]")).sendKeys("7550064411");
		Thread.sleep(1000);
		test.pass("Entered number data in Contact field");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nirmal@gmail.com");
		Thread.sleep(1000);
		test.pass("Entered email id in email field");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nimral");
		Thread.sleep(1000);
		test.pass("Entered text data in username field");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nirmal@15");
		Thread.sleep(1000);
		test.pass("Entered text data in password field");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		test.pass("User Registered Successfully");
		
		test.pass("Test Completed");
		extent.flush();

	}
}
