package com.webElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwondown_AmazonApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement ddele=driver.findElement(By.id("searchDropdownBox"));
		Select sc=new Select(ddele);
		System.out.println("Is dropdown supports Multiple selections?:"+ sc.isMultiple());
		//Selection by index
		sc.selectByIndex(3);
				//select by value
		sc.selectByValue("search-alias=baby");
		
		//select by visible text
		sc.selectByVisibleText("Clothing & Accessories");
		//to get all options available-getOptions();
		List<WebElement> alloptions=sc.getOptions();
		System.out.println("Total options are :"+ alloptions.size());
		
		for(WebElement i:alloptions) {
			System.out.println(i.getText());
			
		if(i.getText().equals("Toys & Games")){
			i.click();
			break;
		}
		
		}
		
		
		
		driver.close();
		
		
		
		
		
	}

}
