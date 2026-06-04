package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest 
{
	@Test
	public void testInvalidLogin()
	{
		//data drive the test method
		String username = Excel.readDataFromExcelFile("./data/ActiTimeManualTestCases.xlsx", "invalidInput", 1, 0);
		String password=Excel.readDataFromExcelFile("./data/ActiTimeManualTestCases.xlsx", "invalidInput", 1, 1);
		
//		step 1: enter invalid username
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(username);
//		step 2: enter invalid password
		loginPage.setPassword(password);
//		step 3:click on login button
		loginPage.clickOnLoginButton();
//		step 4: verify error msg is displayed.
		boolean result = loginPage.verifyErrorMessageIsDisplayed(wait);
		
		//assertion
		Assert.assertEquals(result, true);
	}
}
