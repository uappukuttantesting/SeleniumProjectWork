package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.BaseClass;

public class HomePage extends BaseClass {

	public MyHomePage clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
		
	}

	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}

}
