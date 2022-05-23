package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class card {
	WebDriver driver;
	public card(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='featuredLinksBar__link']")
	WebElement gc;
	
	public WebElement gc1()
	{
		return gc;
	}

}
