package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver", "G:\\1Sele\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(1000);
			
			LoginPage login= new LoginPage(driver);
			login.SendUserName();
			login.SendPassword();
			login.ClickLoginButton();
			Thread.sleep(1000);
			
			PinPage pp= new PinPage(driver);
			pp.SendPin();
			pp.ClickContinueButton();
			Thread.sleep(1000);
			
			HomePage hp= new HomePage(driver);
			hp.validateUserName();
			hp.ClickUserNameButton();
			Thread.sleep(500);
			hp.ClickLogoutButton();
			

	}

}
