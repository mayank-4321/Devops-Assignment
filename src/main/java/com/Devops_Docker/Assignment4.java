package com.webElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Write a script for register page 
https://tutorialsninja.com/demo/index.php?route=account/register

*for radio button confirm if button is not selected then
*select the same
*/


public class Assignment4 {

	public static void main(String[] args) {
		// create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//Write first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hemunio");
		
		//write last name using and operator
		driver.findElement(By.xpath("//input[@placeholder ='Last Name' and  @class='form-control']")).sendKeys("Colio");
		
		//write email using OR operator
		driver.findElement(By.xpath("//input[@placeholder='E-Mail' or @type='email']")).sendKeys("loveujaan9se12@gmail.com");
		
		//write telephone no
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("919293909090");
		
		//write password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hello123");
		
		//confirm passsword
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("Hello123");
		
		//check radio button
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='col-sm-10']//label[@class='radio-inline']"));
		
		for(WebElement i:list) {
			if(!i.isSelected()) {
				i.click();
				break;
				
			}
		}
		//check agree box
		driver.findElement(By.xpath("//input[@name='agree']")).click();
	
		//click on continue
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	
	}

}
