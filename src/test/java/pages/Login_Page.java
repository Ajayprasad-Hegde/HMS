package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	WebDriver driver;
//-----------------------locating----------------------------------//
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath ="//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/form[1]/div[3]/button[1]")
	WebElement loginBtn;
	@FindBy(xpath = "//label[@for = 'email']")
	WebElement emailLabel;

//-----------------------constructor--------------------------------//
  public Login_Page(WebDriver d) 
  	 { 
	  this.driver = d;
	  PageFactory.initElements(d, this); 
     }
 
//	----------------------operations---------------------------------//
	public void setEmail(String mail)
		{
			email.sendKeys(mail);
		}
	public void setPassword(String pw)
		{
			password.sendKeys(pw);
		}
	public void clickLogin()
		{
		loginBtn.click();
		}
	public String getTextFromLabel()
	{
		return emailLabel.getAttribute("textContent");
	}
	public void clearEmailFiled()
	{
		email.clear();
	}
	public void clearPasswordField()
	{
		password.clear();
	}
	
//----------------------------Getters--------------------------------------//
	
	public WebElement getLabel()
	{
		return emailLabel;
	}
}















