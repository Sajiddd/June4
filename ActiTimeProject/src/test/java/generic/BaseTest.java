package generic;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements Iconst
{
	//specifying them as global variable to access everywhere.
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
	public void openApp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ITO));
		wait=new WebDriverWait(driver, Duration.ofSeconds(ETO));
		driver.get(appUrl);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
}
