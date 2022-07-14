package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//declare variable
		
		@FindBy (xpath = "//input[@type='text']") private WebElement UserNameBox;
		@FindBy (id = "password") private WebElement PasswordBox;
		@FindBy (xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	//initialised within constructor
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
	//utilised in methods
		
		public void SendUserName()
		{
			UserNameBox.sendKeys("ELR321");
		}
		
		public void SendPassword()
		{
			PasswordBox.sendKeys("Dhana1111");
		}
		
		public void ClickLoginButton()
		{
			LoginButton.click();
		}

}
