package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	public login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
	 WebElement hover;
	@FindBy(linkText="Log In")
	WebElement login2;
	@FindBy(xpath="//input[@id='spree_user_email']")
	WebElement mailid;
	@FindBy(xpath="//input[@id='spree_user_password']")
	WebElement password;
	@FindBy(xpath="//*[@id=\"ul_site_login\"]")
	WebElement logbutton;
	public WebElement hover1()
	{
		return hover;
	}
	public WebElement login1()
	{
		return login2;
	}
	public WebElement mailid1()
	{
		return mailid;
	}
	public WebElement password1()
	{
		return password;
	}
	public WebElement logbutton1()
	{
		return logbutton;
	}


}
