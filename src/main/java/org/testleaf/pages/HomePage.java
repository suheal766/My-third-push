package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public MyHomePage clickLogin1() {
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		return new MyHomePage();
		
	}
	
}
