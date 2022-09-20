package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorModule_AppointList_Page 
{
	WebDriver driver;
	
	//---------------------------Locators------------------------------------//
	
	@FindBy(xpath = "//button[contains(text(),'Add Appointment')]")
	WebElement addAppointmentBtn;
	@FindBy(xpath = "//body/div[@id='modal_ajax']/div[1]/div[1]/div[2]/div[1]/div[1]"
			+ "/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/a[1]/span[2]/b[1]")
	WebElement selectPatientBtn;
	@FindBy(xpath = "//body/div[@id='select2-drop']/div[1]/input[1]")
	WebElement searchPatientField;
	
	//----------------------------Constructor-----------------------------------// 
	
	public DoctorModule_AppointList_Page(WebDriver d)
	{
		this.driver=d;
		PageFactory.initElements(d, this);
	}
	
	//----------------------------Getters-----------------------------------// 
	public WebElement getAddAppointmentBtn() {
		return addAppointmentBtn;
	}

	public WebElement getSelectPatientBtn() {
		return selectPatientBtn;
	}

	public WebElement getSearchPatientField() {
		return searchPatientField;
	}
	
	//------------------------------Operators---------------------------------//
	public void clickSelectPatientBtn()
	{
		
		selectPatientBtn.click();
	}
	
	public void clickAddAppointmentBtn()
	{
		addAppointmentBtn.click();
	}
	
	public void setSearchPatientField(String patientName)
	{
		
		searchPatientField.sendKeys(patientName);
	}
	
	public boolean isPatientAdded(String patientName)
	{
		boolean result;
		try {
		driver.findElement(By.xpath("//ul/li[1]/div/span[contains(text(),'"+patientName+"')]"));
		result = true;
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
		 result = false;
		}
		return result;
	}
	
}
