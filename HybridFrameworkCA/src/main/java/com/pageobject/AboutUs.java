package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory; 

public class AboutUs
{
	WebDriver driver;

	public AboutUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='no-bullet']/li[3]")
	WebElement ver;

	public WebElement aboutVerify() {
		return ver;
	}

	@FindBy(linkText = "TV Units")
	WebElement tu;

	public WebElement tvunits() {
		return tu;
	}
}
