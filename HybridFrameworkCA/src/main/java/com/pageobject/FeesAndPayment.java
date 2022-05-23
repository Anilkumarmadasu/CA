package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeesAndPayment {
	WebDriver driver;

	public FeesAndPayment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@id='page_content']/p[5]/strong")
	WebElement fp;

	public WebElement FAPVerify() {
		return fp;
	}

	@FindBy(linkText = "Gift Cards")
	WebElement gc;

	public WebElement giftCards() {
	 return gc;
}

}


