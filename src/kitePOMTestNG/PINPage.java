package kitePOMTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PINPage 
{
	//variables
	
	@FindBy (id =   "pin") private WebElement PINBox;
	@FindBy (xpath = "//button[@type='submit']") private WebElement continueButton;
	
//constructor
	public PINPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
//method
	public void sendPIN(String pin)
	{
		PINBox.sendKeys(pin);
	}
	
	public void clickContinueButton()
	{
		continueButton.click();
	}

}
