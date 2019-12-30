package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.BaseClass;

public class MyHomePage extends BaseClass {

	public MyLeadsPage clickLeadsButton() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}

}
