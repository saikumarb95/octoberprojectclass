package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public static WebDriver driver;
	public static WebElement findElement;
	
	public static void browserLaunch(String browserName) {
		
		switch(browserName) {
		
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			break;
			
		case "edge":
			
			WebDriverManager.edgedriver().setup();		
			
			driver = new EdgeDriver();
			
			break;	
		}
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public static void launchUrl (String Url) {
		driver.get(Url);
	}
		
		public static WebElement locater(String locaterName ,String value) {
			
			switch(locaterName) {
			
			case "id":
				
				 findElement = driver.findElement(By.id(value));
			     
				 break;
				 
			case "name":
				
				 findElement = driver.findElement(By.name(value));
				 
				 break;
				 
			case "xpath":
				
				 findElement = driver.findElement(By.xpath(value));
				 
				 break;
			
			}
			
			return findElement;
			
		}
		
		public static void typeText(WebElement ref , String value) {
			
			ref.sendKeys(value);
		}
		
		public static void btnclick(WebElement ref) {
			
			ref.click();
			
		}
	
	}

