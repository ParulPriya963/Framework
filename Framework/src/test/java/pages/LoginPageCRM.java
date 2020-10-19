package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageCRM {

	WebDriver driver;
	
	public LoginPageCRM(WebDriver lDriver)
	{
		this.driver = lDriver;
	}
	
	@FindBy(name="username") WebElement uname;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath="//input[@value='Login']") WebElement loginButton;
	
	public void loginToCRM(String username, String password)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginButton.click();
	}
	
}
