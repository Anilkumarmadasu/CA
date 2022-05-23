package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search {
	WebDriver driver;
	public search(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="search")
	WebElement sea;
	@FindBy(xpath="//*[@id=\"search_button\"]/span")
	WebElement click;
	@FindBy(xpath="//*[@id=\"search-results\"]/div[3]/ul/li[1]/div")
	WebElement sofa;
	@FindBy(xpath="//*[@id=\"search-results\"]/div[3]/ul/li[3]/div/div[6]/a[2]")
	WebElement view;
	@FindBy(xpath="//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[7]/div[1]")
	WebElement material;
	@FindBy(xpath="//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[7]/div[2]/div/div/div[1]/ul/li[1]/label")
	WebElement mat;
	public WebElement search1()
	{
		return sea;
	}
	public WebElement click1()
	{
		return click;
	}
	public WebElement sofa1()
	{
		return sofa;
	}
	public WebElement view1()
	{
		return view;
	}
	public WebElement material1()
	{
		return material;
	}
	public WebElement mat1()
	{
		return mat;
	}
	


}
