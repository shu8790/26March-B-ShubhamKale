package newPOMPackKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{

//variables
	@FindBy (xpath = "//span[@class='user-id']")private WebElement userID;
	@FindBy (xpath = "//a[@target='_self']")private WebElement logoutButton;

//constructor
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//methods
	
	public void validateUserName(String userId)
	{
		String actualUserName = userID.getText();
		String expectedUserName= userId;
		if(actualUserName.equals(expectedUserName))
		{
			System.out.println("expectedUsername and actualUserName are matching hence test case is passed");
			
		}
		else
		{
			System.out.println("ExpectedUsename and ActualUserName is notmatching hence tast case is failed");
		}
		
	}
	
	public String getActualUserName()
	{
		String actualUserName = userID.getText();
		return actualUserName;
	}
	
	public void clickUserID()
	{
		userID.click();
	}
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	
}
