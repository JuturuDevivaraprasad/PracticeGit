package com.sdet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class flipkartLogin {

	@Test
	public void login() {
		

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement loginBtn = driver.findElement(By.xpath("//a[contains(text(),'Login')]")); 
//		loginBtn.click(); 
		
				
		WebElement mobileNo = driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")); 
		mobileNo.sendKeys("7013893526"); 
				
	
		WebElement password = driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]"));
		password.sendKeys("Prasad@414");//password
		password.sendKeys(Keys.ENTER);//instead of use for continue button use to access keyboard key ENTER

	}

}
