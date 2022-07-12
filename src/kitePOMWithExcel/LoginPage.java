package kitePOMWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
		//variables
	
			@FindBy (id = "userid") private WebElement userIDBox;
			@FindBy (id = "password")private WebElement passworBox;
			@FindBy (xpath = "//button[@type='submit']") private WebElement loginButton;
			
		//constructor
			
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//methods
		
		public void sendUserID(String userId)
		{
			userIDBox.sendKeys(userId);
		}
		
		public void sendPassword(String pwd)
		{
			passworBox.sendKeys(pwd);
		}
		
		public void clickLoginButton()
		{
			loginButton.click();
		}
			
}
