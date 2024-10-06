package com.webElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write automation script for amazon footer



public class Assignment5 {

	public static void main(String[] args) {
		// Create a driver session
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//get footer 
		List<WebElement>list=driver.findElements(By.xpath("//div[@id='navFooter']//a"));
		System.out.println("Total no of footers are:...."+list.size());
		System.out.println("List of footers are....");
		for(WebElement i:list) {
			System.out.print(i.getAttribute("href"));
			System.out.print(","+i.getText());
			
		}
		driver.close();
	}

}
