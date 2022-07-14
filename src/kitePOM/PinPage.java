package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage
{
	//variables/ data members
	
	@FindBy (id = "pin") private WebElement PinBox;
	@FindBy (xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	//constructor
	
	public PinPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void SendPin()
	{
		PinBox.sendKeys("982278");
	}
	
	public void ClickContinueButton()
	{
		ContinueButton.click();
	}
	
}
