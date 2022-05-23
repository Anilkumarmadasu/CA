package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	WebDriver driver;

	public void SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='textfiled email requiredinput_authentication email-suggest']")
	WebElement em;

	@FindBy(xpath = "//input[@class='textfield required input_authentication']")
	WebElement pwd;

	@FindBy(xpath = "//input[@class='button primary signup']")
	WebElement sub;

	public WebElement userName() {
		return em;
	}

	public WebElement passWord() {
		return pwd;
	}

	public WebElement submit() {
		return sub;
	}
}
