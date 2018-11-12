package com.gmail.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	
	// Constructor
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Locator for Sign In link
	By loc_signIn = By.xpath("//a[@class=\"gmail-nav__nav-link gmail-nav__nav-link__sign-in\"]");
	
	// Method to click on Sign In link
	public void clickOnSignInLink() {
		driver.findElement(loc_signIn).click();
	}

}
