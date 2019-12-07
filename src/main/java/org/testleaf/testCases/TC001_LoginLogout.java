/*package org.testleaf.testCases;

import org.testleaf.base.ProjectSpecificMethods;
import org.testleaf.pages.Createlea;
import org.testleaf.pages.LoginPage;
import org.testleaf.pages.MyHomePage;
import org.testleaf.pages.ViewLead;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC002";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogout(String uname, String pwd) {
	
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()	
		.clickLogin1()
		.MyHom()
		.CreLead()
		.View()
		.firName()
		.LasName()
		.Button();
		
		
		
		}
	
	
	

}*/
