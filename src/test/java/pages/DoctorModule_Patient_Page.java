package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorModule_Patient_Page 
{
	WebDriver driver;
	
	//-----------------------locators----------------------------------//
	@FindBy(xpath="//button[contains(text(),'Add Patient')]")
	private WebElement addPatientBtn;
	@FindBy(xpath="//input[@name =\"name\"]")
	private WebElement nameField;
	@FindBy(xpath="//input[@name =\"email\"]")
	private WebElement emailField;
	@FindBy(xpath="//input[@name =\"password\"]")
	private WebElement passwordField;
	@FindBy (xpath = "//textarea[@name='address']")
	private WebElement addressField;
	@FindBy(xpath="//input[@name =\"phone\"]")
	private WebElement phoneField;
	@FindBy(xpath="//input[@name ='age']")
	private WebElement ageField;
	@FindBy(xpath="//body/div[@id='modal_ajax']/div[1]/div[1]/div[2]/div[1]"
			+ "/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/div[1]/div[1]")
	private WebElement selectImageBtn;
	@FindBy(xpath="//input[@type = 'submit']")
	private WebElement submitBtn;
	@FindBy(xpath="//select[@name = 'sex']")
	private WebElement selectSexDropdown;
	@FindBy(xpath="//input[@name = 'birth_date']")
	private WebElement birthDateField;
	@FindBy(xpath="//select[@name = 'blood_group']")
	private WebElement bloodGroupDropdown;
	@FindBy(xpath="//a[contains(text(),'Remove')]")
	private WebElement removeBtn;
	
	
	
	//-----------------------Constructor----------------------------------//
	public DoctorModule_Patient_Page(WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(d,this);
	}
	
	//-----------------------Getters----------------------------------//
	
	
	public WebElement getAddPatientBtn() {
		return addPatientBtn;
	}

	public WebElement getRemoveBtn() {
		return removeBtn;
	}

	public WebElement getNameField() {
		return nameField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getAddressField() {
		return addressField;
	}

	public WebElement getPhoneField() {
		return phoneField;
	}

	public WebElement getAgeField() {
		return ageField;
	}
	
	public WebElement getBirthDateField() {
		return birthDateField;
	} 
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getSelectImageBtn() {
		return selectImageBtn;
	}
	
	public WebElement getSelectSexDropdown() {
		return selectSexDropdown;
	}

	public WebElement getBloodGroupDropdown() {
		return bloodGroupDropdown;
	}
	//---------------------------------operator----------------------------------//
	public void clickAddPatientBtn()
	{
	  addPatientBtn.click();
	}
	public void setName(String name)
	{
		nameField.sendKeys(name);
	}
	public void setEmail(String email)
	{
		emailField.sendKeys(email);
	}
	public void setPassword(String password)
	{
		passwordField.sendKeys(password);
	}
	public void setAddress(String address)
	{
		addressField.sendKeys(address);
	}
	public void setPhone(String phone)
	{
		phoneField.sendKeys(phone);
	}
	public void setAge(String age)
	{
		ageField.sendKeys(age);
	}
	public void setBirthDate(String birthDate)
	{
		birthDateField.sendKeys(birthDate);
	}
	public void clickSubmitBtn()
	{
		submitBtn.click();
	}
	public void selectImage(String path)
	{
		ageField.sendKeys(path);
	}
	
//-------------------------------------------------------------------------------------//
	
}
