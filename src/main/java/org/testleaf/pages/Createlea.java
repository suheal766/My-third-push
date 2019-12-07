package org.testleaf.pages;

import javax.swing.text.View;

import org.testleaf.base.ProjectSpecificMethods;

public class Createlea extends ProjectSpecificMethods {
	
	public ViewLead CreLead() {
		
		driver.findElementByLinkText("Create Lead").click();
		
		return new ViewLead();
	}

}
