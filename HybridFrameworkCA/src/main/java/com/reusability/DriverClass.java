package com.reusability;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass
{
	public static WebDriver Application(WebDriver driver, String browserName, String URL)
	{
		if (browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("Firefox"))
		{
			System.out.println("Firefox");
		} else if (browserName.equals("IE"))
		{
			System.out.println("IE");
		} else
		{
			System.out.println("No Browser Available");
		}
		// driver.manage()).pageLoadTimeout(30, Timeunit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
}