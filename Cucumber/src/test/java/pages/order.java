package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class order {
	WebDriver driver;
	public order(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/section/div/ul[2]/li[2]/a")
	WebElement order;
	@FindBy(xpath="//*[@id=\"app-container\"]/div/footer/section/div[1]/section[1]/ul/li[8]/a")
	WebElement pri;

     public WebElement order1()
     {
    	 return order;
     }
     public WebElement pri1()
     {
    	 return pri;
     }

}
