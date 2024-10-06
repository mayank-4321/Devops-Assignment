package com.webElementHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Write a automation script to automate orangeHRM application
 * Login and logout functionality.
 */ 
 


public class Assignment2 {

	public static void main(String[] args) {
		// Create driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//go to orangeHRM website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//go to  username and enter user Admin
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//go to  password and enter password admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//go to login button and click using class name
		//driver.findElement(By.className("orangehrm-login-button")).sendKeys(Keys.ENTER);
		 
		//go to login button and click using css selector
		driver.findElement(By.cssSelector("button.orangehrm-login-button")).click();
		
		
		//go to profile 
		driver.findElement(By.className("oxd-userdropdown-icon")).click();
		
		
		//go to logout option
		
		driver.findElement(By.linkText("Logout")).click();
		
		//close browser
		driver.close();
		//get the element of 

		
	}

}

