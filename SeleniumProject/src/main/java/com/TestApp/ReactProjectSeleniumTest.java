package com.TestApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReactProjectSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://172.17.7.125:3000/signup");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='signup-form-container']//div[1]//input[1]")).sendKeys("Nirmal");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]//input[1]")).sendKeys("7550064411");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nirmal@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nimral");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nirmal@15");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}
}
