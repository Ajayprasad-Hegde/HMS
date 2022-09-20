package test_cases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DoctorDashboard_Page;
import pages.DoctorModule_AppointList_Page;
import pages.DoctorModule_Patient_Page;
import pages.Login_Page;
import utility.ReadConfig;

public class IT_01 extends Base
{
	@DataProvider
	public Iterator<String[]> dataProvider() throws IOException
	{
		ArrayList<String[]> arrlst =   utility.XLUtils.getCellData("C:\\Ajay\\Java_Folder\\"
				+ "Java_Eclips\\HMS_MAVEN\\Test_Sheets\\test_data\\DoctorModule_IT.xlsx", 0);
		return arrlst.iterator();
	}
	
	@Test(dataProvider = "dataProvider")
	public void addPatientTest(String name, String email, String password,
			String address, String phone, String sex, String birthDate, 
			String age, String bloodGroup, String image) throws IOException, AWTException, InterruptedException
	
	{
		Login_Page login = new Login_Page(driver);
		ReadConfig rc = new ReadConfig();
		DoctorModule_Patient_Page patPage = new DoctorModule_Patient_Page(driver);
		DoctorModule_AppointList_Page appListPage = new DoctorModule_AppointList_Page(driver);
		DoctorDashboard_Page docDash = new DoctorDashboard_Page(driver);

		
		driver.get(rc.getUrl());
		login.setEmail(rc.getDocEmail());
		login.setPassword(rc.getDocPassword());
		login.clickLogin();
		
		docDash.clickPatientBtn();
		patPage.clickAddPatientBtn();
			
		patPage.setName(name); patPage.setEmail(email);
		patPage.setPassword(password); patPage.setAddress(address);
		patPage.setPhone(phone);
		utility.Util.selectDropDown(patPage.getSelectSexDropdown(), sex);
		patPage.setAge(age); patPage.setBirthDate(birthDate);
		utility.Util.selectDropDown(patPage.getBloodGroupDropdown(), bloodGroup);
		patPage.clickSubmitBtn();
		
		
		docDash.clickAppointmentBtn();
		Thread.sleep(3000);
		docDash.clickAppointmentLstBtn();
		
		appListPage.clickAddAppointmentBtn();
		Thread.sleep(6000);
		appListPage.getSelectPatientBtn().click();
		
		Thread.sleep(3000);
		appListPage.setSearchPatientField(name);
		
		Assert.assertTrue(appListPage.isPatientAdded(name));
		
	}
}
