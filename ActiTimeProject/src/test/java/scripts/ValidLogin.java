package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;
import page.EttPage;
import page.LoginPage;

public class ValidLogin extends BaseTest
{
	@Test
	public void testValidLogin()
	{
		//data drive the test method
		String userName = Excel.readDataFromExcelFile("./data/ActiTimeManualTestCases.xlsx","input", 1, 0);
		String password = Excel.readDataFromExcelFile("./data/ActiTimeManualTestCases.xlsx","input", 1, 1);
		
//		step 1: enter valid username
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(userName);
		
//		step 2: enter valid password
		loginPage.setPassword(password);
		
//		step 3: click on login button
		loginPage.clickOnLoginButton();
		
//		step 4: verify homePage is displayed.
		EttPage ettPage=new EttPage(driver);
		boolean result = ettPage.verifyHomePageWelcomeMsgDisplayed(wait);
		
		//assertion to compare two values and generate testNG report which says pass or fail.
		Assert.assertEquals(result, true,"home page is not displayed");
	}
}
