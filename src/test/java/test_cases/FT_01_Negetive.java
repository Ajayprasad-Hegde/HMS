package test_cases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Login_Page;
import utility.ReadConfig;


public class FT_01_Negetive extends Base
{
	
	 @DataProvider
	 public Iterator dataProvider() throws IOException
	 {
		 ArrayList<String[]> arrlst = utility.XLUtils.getCellData("C:\\Ajay\\Java_Folder\\Java_Eclips"
		 		+ "\\HMS_MAVEN\\Test_Sheets\\test_data\\Login_Test_data.xlsx", 1);
		 Iterator iterator = arrlst.iterator();
		 return iterator;
	 }
	
	  @Test(dataProvider ="dataProvider")
	  public void loginTestNegetive(String email, String label) throws IOException, AWTException
	  {
		 Login_Page login = new Login_Page(driver);
		 ReadConfig rc = new ReadConfig();
		 Robot robot = new Robot();
		 
		 driver.get(rc.getUrl());
		 login.setEmail(email);
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 Assert.assertEquals(login.getTextFromLabel(), label);
		 login.clearEmailFiled();
	  }	
}










