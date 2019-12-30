package org.testleaf.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.leaftaps.BaseClass;

public class CreateLeadPage extends BaseClass {

	public CreateLeadPage enterCompName(String compname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(compname);
		return this;
	}

	public CreateLeadPage enterFirstName(String firstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		return this;
	}

	public CreateLeadPage enterLastName(String lastName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		return this;
	}

	public ViewLeadPage clickCreateLead() throws InterruptedException {
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(2000);
		String lID = driver.findElementById("viewLead_companyName_sp").getText();
		cleadID = lID.replaceAll("[^\\d.]", "");
		System.out.println("Lead ID Created : "+ cleadID);
		return new ViewLeadPage();
	}
	
	
}
