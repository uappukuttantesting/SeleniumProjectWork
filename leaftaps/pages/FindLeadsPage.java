package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.BaseClass;

public class FindLeadsPage extends BaseClass {
	
	public EditLeadPage enterLeadId() throws InterruptedException {
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(cleadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		return new EditLeadPage();
	}

}
