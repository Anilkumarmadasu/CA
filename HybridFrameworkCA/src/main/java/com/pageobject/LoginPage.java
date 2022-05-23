package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@autofocus='autofocus']")
	WebElement em;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pwd1;

	@FindBy(xpath = "//input[@class='button primary']")
	WebElement sub1;

	public WebElement eMailID()
	{
		return em;
	}

	public WebElement password()
	{
		return pwd1;
	}

	public WebElement enter()
	{
		return sub1;
	}
}
