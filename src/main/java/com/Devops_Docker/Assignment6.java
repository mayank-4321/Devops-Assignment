package com.webElementHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Automate Orangehrm login and logout using cssSelector

public class Assignment6 {

	public static void main(String[] args) {
		
		byXpath();
		byCssSelector();
		
		
		
	}

	public static void byCssSelector() {
	// create a driver session
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//enter user name
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		
		//enter password
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		
		//click on login button
		driver.findElement(By.cssSelector("button.oxd-button")).sendKeys(Keys.ENTER);
		
		//click on downArrow 
		driver.findElement(By.cssSelector("i.oxd-userdropdown-icon")).click();
		
		//click on logout
		driver.findElement(By.cssSelector("a[href='/web/index.php/auth/logout']")).click();
		
		//close the session
		driver.close();
		
		 

	}
	
	
	public static void byXpath() {
		
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		//enter userName
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		
		//enter passWord
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		//click on login button
		driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']")).click();
		
		//click on downArrow
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab\']/i")).click();
		
		//click on logout
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
		
		//close the session
		driver.close();
		
		
	
	}
	
	
	
	

}
