package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utility.BrowserFactory;

public class Logintest {
	
	WebDriver driver;
	
	@Test
	public void loginapp(){
		
		driver =BrowserFactory.setAppication(driver, "Chrome","https://www.freecrm.com/index.html");
		
		System.out.println("Print title "+driver.getTitle());
	}
	

}
