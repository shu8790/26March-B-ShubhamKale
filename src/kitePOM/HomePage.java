package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
		
		@FindBy (xpath = "//span[@class='user-id']") private WebElement UserNameButton;
		@FindBy (xpath = "//a[@target='_self']") private WebElement LogoutButton;

	//constructor
		public HomePage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
	//methods
		
		public void validateUserName()
		{
			String actualName = UserNameButton.getText();
			String expectedName = "ELR321";
			if(actualName.equals(expectedName))
			{
				System.out.println("expected username and actual username is matching hence test case is passed");
			}
			else
			{
				System.out.println("expected username and actual username is not matching hence test case is failed");
			}
		}
		
		public void ClickUserNameButton()
		{
			UserNameButton.click();
		}
		
		public void ClickLogoutButton()
		{
			LogoutButton.click();
		}


}
