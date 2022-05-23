package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SofaPage
{
	WebDriver driver;

	public SofaPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//h1[@class='withsubtext']")
	WebElement sbv;

	public WebElement sofabVerify()
	{
		return sbv;
	}

	@FindBy(linkText ="Fees and Payment")
	WebElement fap;

	public WebElement feesandpayment()
	{
		return fap;
	}
}
