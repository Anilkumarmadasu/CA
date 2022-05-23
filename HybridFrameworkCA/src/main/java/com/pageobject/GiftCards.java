
package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards
{
	WebDriver driver;

	public GiftCards(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//section[@class='_14QEd']/h2")
	WebElement ver;

	public WebElement gcVerify()
	{
		return ver;
	}

	@FindBy(linkText = "About Us")
	WebElement abt;

	public WebElement aboutUs()
	{
		return abt;
	}
}
