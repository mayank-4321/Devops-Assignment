package com.webElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Google_search_Capture {

	public static void main(String[] args) {
		
		
		// create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		//search for cucumber
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("cucumber");
		
		//list all the search items
		List<WebElement> searchForCucumber=driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='eIPGRd']"));
		System.out.println("Total no.of Search for cucumber are :"+searchForCucumber.size());
		System.out.println("\"List of search for cucumber are....\"");
		for(WebElement i:searchForCucumber) {
		
			
			System.out.println(i.getText());
			
		}

		driver.close();
		
	}

}
