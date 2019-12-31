package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.BaseClass;

public class DeleteLeadPage extends BaseClass {
	
	public ViewLeadPage clickDeleteButton() {
		
		driver.findElementByLinkText("Delete").click();
		return new ViewLeadPage();
	}

}
