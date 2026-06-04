package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EttPage 
{
	//homePage welcome message
	@FindBy(xpath = "//h3[text()='Enter Time-Track for']")
	private WebElement welcomeMsg;
	
	public EttPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//verify welcomeMsg is displayed 
	public boolean verifyHomePageWelcomeMsgDisplayed(WebDriverWait wait)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(welcomeMsg));
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
}
