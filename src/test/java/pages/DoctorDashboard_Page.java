package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorDashboard_Page 
{
WebDriver driver;

//--------------------------locators--------------------------//
@FindBy(xpath = "//span[contains(text(),'Patient')]")
private WebElement patientBtn;

@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[2]/ul[2]/li[1]/a[1]")
private WebElement logoutBtn;

@FindBy(xpath = "//body/div[1]/div[1]/ul[1]/li[2]")
private WebElement appointmentBtn;

@FindBy(xpath = "//a/span[contains(text(),'Appointment List')]")
private WebElement appointmentLstBtn;

@FindBy(xpath = "//a/span[contains(text(),'Requested Appointments')]")
private WebElement requestedAppointmentsBtn;

//--------------------------constructor------------------------//
public DoctorDashboard_Page(WebDriver d)
{
	this.driver = d;
	PageFactory.initElements(d, this);
}

//------------------------Getters------------------------------------//
public WebElement getPatientBtn() 
{
	return patientBtn;
}

public WebElement getLogoutBtn() 
{
	return logoutBtn;
}

public WebElement getAppointmentBtn() {
	return appointmentBtn;
}

public WebElement getAppointmentLstBtn() {
	return appointmentLstBtn;
}

public WebElement getRequestedAppointmentsBtn() {
	return requestedAppointmentsBtn;
}
//--------------------------operations--------------------------//

public void clickPatientBtn()
{
	patientBtn.click();
}

public void clickLogoutBtn()
{
	appointmentBtn.click();
}

public void clickAppointmentBtn()
{
	appointmentBtn.click();
}
public void clickAppointmentLstBtn()
{
	appointmentLstBtn.click();
}
public void clickRequestedAppointmentBtn()
{
	requestedAppointmentsBtn.click();
}
//---------------------------------------------------------------//
}

