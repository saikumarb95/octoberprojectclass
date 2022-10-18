package com.sample;

import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class BrowserLaunch  extends BaseClass{
	
	public static void main(String[] args) {
		
		browserLaunch("chrome");
		
		launchUrl ("https://www.facebook.com/");
		
		WebElement email = locater("id","email");
		
		typeText(email,"saikumaegmail.com");
		
		WebElement pass = locater("name","pass");
		
		typeText(pass,"1234567");
		
		WebElement login = locater("name","login");
		
		btnclick(login);
		
	}

}
