package org.testleaf.pages;

import java.sql.Driver;

import org.testleaf.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public  Createlea MyHom() {
		
		driver.findElementByLinkText("Leads").click();
		
		
		return new Createlea();
		
	}

	

}
