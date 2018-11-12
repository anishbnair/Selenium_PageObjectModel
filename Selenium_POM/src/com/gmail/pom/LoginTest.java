package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	
	public static WebDriverWait wait = null;
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/gmail/about/#");
		
		// Creating object of LandingPage
		LandingPage LandingPage = new LandingPage(driver);
		
		// Click on Sign In link
		LandingPage.clickOnSignInLink();
		
	
		// Creating an object of LoginPage
		LoginPage LoginPage = new LoginPage(driver);
		
		// Sign In /* Enter correct email and password before run the script */
		LoginPage.signIn("test@gmail.com", "test");
		
		//Quit browser
		driver.quit();
		
	}

}
