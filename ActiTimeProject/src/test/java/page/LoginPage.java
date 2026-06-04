package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//in pom class we store, declare initialize and utilize web elements.
	
	//uerNameTextBox web element
	@FindBy(id = "username")
	private WebElement uerNameTextBox;
	
	//passwordTextBox web element
	@FindBy(name = "pwd")
	private WebElement passwordTextBox;
	
	//login button web element
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;
	
	//initializing non static variables using constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilizing the web elements 
	
	//set username
	public void setUserName(String username)
	{
		uerNameTextBox.sendKeys(username);
	}
	
	//set password
	public void setPassword(String password)
	{
		passwordTextBox.sendKeys(password);
	}
	
	//click on login button.
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	
	
	
	
	
	
	
}
