package com.webElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write automation script to open google
//then navigate to amazon capture title of both application,then 
//navigate back to google from amazon
//capture current url of google
//then navigate forward and get the current url of amazon and validate
// validate Title of amazon should conatins online shopping.
//and close the browser.
public class Assignment1 {

	public static void main(String[] args) {
		//create the driver session
		WebDriver driver=new ChromeDriver();
		//Open Google Application
		driver.get("https://www.google.com");
		//get title of google application
		
		String actTitle=driver.getTitle();
		System.out.println("Title of google application is: "+ actTitle);
		
		//go to amazon application
		
		driver.navigate().to("https://www.amazon.in");
		
		//get title of amazon application
		
		String actTitle1=driver.getTitle();
		System.out.println("Title of amazon application is: "+actTitle1);
		
		//go back
		
		driver.navigate().back();
		
		//get current url
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current URL of application is: "+ currentUrl);
		
		//go forward
		driver.navigate().forward();
		//get current url
		
		String crrnturl=driver.getCurrentUrl();
		System.out.println("Current title of application is:"+crrnturl);
		
		
		//WebElement title=driver.findElement(By.id("nav-logo-sprites"));
		String str=driver.getTitle();
		if(str.contains("Online Shopping")) {
			System.out.println("Test pass title contains......Online Shopping!!");
		}
		else {
			System.out.println("Test fails .... title doesn't conatins .....online shopping");
		}
		//System.out.println("is Title of amazon conatin online shopping?...:"+title.isDisplayed());
		driver.close();
	}

}
