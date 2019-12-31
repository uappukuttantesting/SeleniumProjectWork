package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.BaseClass;

public class FindLeadsPage extends BaseClass {
	
	public EditLeadPage enterLeadIdEdit() throws InterruptedException {
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(cleadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		return new EditLeadPage();
		
	}
	
		
	public DeleteLeadPage enterLeadIdDelete() throws InterruptedException {
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(cleadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Delete").click();
		return new DeleteLeadPage();
		
		
	}
	
	public FindLeadsPage enterLeadIdDelSearch() throws InterruptedException {
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(cleadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Lead ID Successfully Deleted");
		} else {
			System.out.println("Lead ID is not Deleted");
		}
		return this;
		
	}

}
