package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPageCRM;
import utilities.BaseClass;

public class LoginTestCRM extends BaseClass{
	
	@Test
	public void loginApp() {
		//System.out.println(driver.getTitle());
		logger = report.createTest("Login To CRM");
		
		LoginPageCRM loginPageCRM = PageFactory.initElements(driver, LoginPageCRM.class);
		
		logger.info("Starting Application");
		
		loginPageCRM.loginToCRM(excelDataProvider.getStringData("LoginCRM", 0, 0), excelDataProvider.getStringData("LoginCRM", 0, 1));
	
		logger.pass("Login success");
	}
}
