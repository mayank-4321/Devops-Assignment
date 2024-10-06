package com.webElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Write automation script to automate https://www.naukri.com/page
get total count of links.
print href value and text of every link into console.
also find href upto 
https://www.naukri.com/engineering-jobs?src=gnbjobs_homepage_srch
*/
public class Assignment3 {

	public static void main(String[] args) {
		
		// Create a driver session
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com");

		//getting total count of links
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links are......"+allLinks.size());
	
		//getting value of href and text of everylink
		
		String exp="https://www.naukri.com/engineering-jobs?src=gnbjobs_homepage_srch";
		
		for(WebElement i:allLinks) {
			System.out.println("Values of href are....."+i.getAttribute("href"));
			
			System.out.println("Text link is:...."+i.getText());
			try {
		if(i.getAttribute("href").contains(exp)) {
			System.out.println("Link found test pass....");
			break;
		}}
			catch(NullPointerException n){
				System.out.println("object href is Null");
			}
		
		}
		
		//closing browser
		driver.close();
	
	}

}
