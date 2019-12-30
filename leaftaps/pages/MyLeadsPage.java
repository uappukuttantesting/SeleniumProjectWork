package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.BaseClass;

public class MyLeadsPage extends BaseClass {

	public CreateLeadPage clickCreateLeadLink() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}

	public FindLeadsPage clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
	}

	public void clickMergeLeads() {
		System.out.println("Merge Leads");
	}

}
