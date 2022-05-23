package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyClass
{
	WebDriver driver;
	public StudyClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[@class='withsubtext']")
	WebElement ver;

	public WebElement tableVerify()
	{
		return ver;
	}

	@FindBy(xpath = "//li[@class='topnav_item saleunit']")
	WebElement su;

	public WebElement sales()
	{
		return su;
	}

	@FindBy(xpath = "//li[@class='subnav_item 15040']")
	WebElement sb;

	public WebElement sofaBeds()
	{
		return sb;
	}
}

//driver.findElements(By.xpath("");

