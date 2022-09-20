package test_cases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utility.Util;

public class Base
{	
	public static WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser) 
	{ 
		Util.launchBrowser(browser);
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
		
	}
	
}
