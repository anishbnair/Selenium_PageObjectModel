package com.gmail.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	// Constructor
	public LoginPage(WebDriver driver) {		
		this.driver = driver;		
	}
	
	// Locator for email
	By loc_emailAddress = By.xpath("//input[@id=\"identifierId\"]");
	// Locator for Next button
	By loc_nextButton = By.xpath("//span[text()=\"Next\"]");
	// Locator for password
	By loc_password = By.xpath("(//input[@class=\"whsOnd zHQkBf\"])[1]");
	
	// Type email address
	public void typeEmailAddress(String emailAddress) {
		driver.findElement(loc_emailAddress).sendKeys(emailAddress);		
	}
	
	// Click on Next button
	public void clickOnNextButton() {
		driver.findElement(loc_nextButton).click();
	}
	
	// Type password
	public void typePassword(String password) {
		driver.findElement(loc_password).sendKeys(password);		
	}

}
