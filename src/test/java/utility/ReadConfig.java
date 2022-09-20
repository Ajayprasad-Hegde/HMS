package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
	Properties p;
//------------------------------Constructor---------------------------------------------//	
public ReadConfig() throws IOException
{
	FileInputStream fip = new FileInputStream(new File("C:\\Ajay\\Java_Folder\\Java_Eclips\\HMS_MAVEN"
				+ "\\src\\test\\java\\config\\config.properties"));
	
	p = new Properties();
	p.load(fip);	
}

//----------------------------------URLs------------------------------------------//

public String getUrl()
{
	String url = p.getProperty("url");
	return url;
}

//-----------------------User name and Passwords---------------------------------//

public String getDocEmail()
{
	String docEmail = p.getProperty("docEmail");
	return docEmail;
}
public String getDocPassword()
{
	String docPassword = p.getProperty("docPassword");
	return docPassword;
}
public String getPatEmail()
{
	String patEmail = p.getProperty("patEmail");
	return patEmail;
}
public String getPatPassword()
{
	String patPassword = p.getProperty("patPassword");
	return patPassword;
}

public String getRecEmail()
{
	String recEmail = p.getProperty("recEmail");
	return recEmail;
}
public String getRecPassword()
{
	String recPassword = p.getProperty("recPassword");
	return recPassword;
}
public String getPhaEmail()
{
	String phaEmail = p.getProperty("phaEmail");
	return phaEmail;
}
public String getPhaPassword()
{
	String phaPassword = p.getProperty("phaPassword");
	return phaPassword;
}
public String getAccEmail()
{
	String accEmail = p.getProperty("accEmail");
	return accEmail;
}
public String getAccPassword()
{
	String accPassword = p.getProperty("accPassword");
	return accPassword;
}
public String getLabEmail()
{
	String labEmail = p.getProperty("labEmail");
	return labEmail;
}
public String getLabPassword()
{
	String labPassword = p.getProperty("labPassword");
	return labPassword;
}
public String getNurEmail()
{
	String nurEmail = p.getProperty("nurEmail");
	return nurEmail;
}
public String getNurPassword()
{
	String nurPassword = p.getProperty("nurPassword");
	return nurPassword;
}
//-----------------------------Page Titles------------------------------------//



public String getLoginPageTitle()
{
	String loginPageTitle = p.getProperty("loginPageTitle");
	return loginPageTitle;
}
public String getDoctorDashboardPageTitle()
{
	String doctorDashboardPageTitle = p.getProperty("doctorDashboardPageTitle");
	return doctorDashboardPageTitle;
}
public String getPatientDashboardPageTitle()
{
	String patientDashboardPageTitle = p.getProperty("patientDashboardPageTitle");
	return patientDashboardPageTitle;
}

}