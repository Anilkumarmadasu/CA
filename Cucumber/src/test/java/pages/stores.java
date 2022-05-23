package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class stores {
	WebDriver driver;
	public stores(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/section/div/ul[2]/li[1]/a")
	WebElement store;
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/ol/li[2]/a")
	WebElement topdeal;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/div/a/img")
	WebElement deal;
	@FindBy(xpath="//*[@id=\"page_content\"]/div/ul[1]/div/div/ul/li[2]/a/img")
	WebElement product;
	
	public WebElement store1()
	{
		return store;
	}
	public WebElement topdeal1()
	{
		return topdeal;
	}
	public WebElement deal1()
	{
		return deal;
	}
	public WebElement product1()
	{
		return product;
	}
	//*[@id=\"content\"]/div[3]/div/ul/li[1]/div/div[2]/a/div[2]/img
	
}
