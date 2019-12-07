package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods{
	
	public ViewLead View() {
		
		driver.findElementByXPath("//*[@id=\"createLeadForm_companyName\"]").sendKeys("Acc");
		return this;
		
	}
	public ViewLead firName() {
		driver.findElementByXPath("//*[@id=\"createLeadForm_firstName\"]").sendKeys("suheal");
		return this;
		}
	public ViewLead LasName() {
		
		driver.findElementByXPath("//*[@id=\"createLeadForm_lastName\"]").sendKeys("iqbal");
		return this;
	}
	
	
	public void Button() {
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
	}

}

