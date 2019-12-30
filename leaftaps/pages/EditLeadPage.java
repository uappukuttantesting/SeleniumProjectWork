package org.testleaf.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.leaftaps.BaseClass;

public class EditLeadPage extends BaseClass {

	public EditLeadPage updateCompName() {

		WebElement udata = driver.findElementById("updateLeadForm_companyName");
		udata.clear();
		udata.sendKeys("Wipro");
		return this;
	}

	public EditLeadPage clickUpdateButton() {

		driver.findElementByName("submitButton").click();
		return this;
	}

}
