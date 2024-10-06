package com.webElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) {
		// Create driver session
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement ele=driver.findElement(By.id("day"));
						
		Select sc=new Select(ele);
		sc.selectByVisibleText("11");
		
		
		
		driver.close();
		
		

	}

}
