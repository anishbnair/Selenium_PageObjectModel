package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://gmail.com");
		
		// Creating object of LandingPage
		LandingPage LandingPage = new LandingPage(driver);
		
		// Click on Sign In link
		LandingPage.clickOnSignInLink();

		
	}

}
