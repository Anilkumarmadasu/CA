package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage
{
	WebDriver driver;

	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Wallace Study Desk (Wenge Finish)']")
	WebElement sd;

	@FindBy(xpath = "//*[@id='store-availability']/div/h2/text()")
	WebElement vos;

	@FindBy(xpath = "//*[@class='topnav_item studyunit']")
	WebElement sa;

	@FindBy(linkText = "Office Tables")
	WebElement ot;

	public WebElement study()
	{
		return sa;
	}

	public WebElement table()
	{
		return sd;
	}

	public WebElement officeTable()
	{
		return ot;
	}

	public WebElement visitOurStores()
	{
		return vos;
	}
}