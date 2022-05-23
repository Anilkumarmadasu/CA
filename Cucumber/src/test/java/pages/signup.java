package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup {
	WebDriver driver;
	public signup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
	 WebElement log;
	 @FindBy(linkText="Sign Up")
	 WebElement sign;
	 @FindBy(id="spree_user_email")
	 WebElement email;
	 @FindBy(xpath="//input[@type='password']")
	 WebElement pwd;
	 @FindBy(xpath="//*[@id=\"signup_form\"]/input[4]")
	 WebElement signup;
	 public WebElement log1()
	 {
		 return log;
	 }
	 public WebElement sign1()
	 {
		 return sign;
	 }
	 public WebElement email1()
	 {
		 return email;
	 }
	 public WebElement pwd1()
	 {
		 return pwd;
	 }
	 public WebElement signup1()
	 {
		 return signup;
	 }

	
		

}
