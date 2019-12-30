package org.testleaf.leaftaps.testcase;

import org.testleaf.leaftaps.BaseClass;
import org.testleaf.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_EditLead extends BaseClass {

	@BeforeTest
	public void setData() {
		excelFileName = "TC002";

	}

	@Test(dataProvider = "excelData")
	public  void runTC002(String username, String password, String compname, String firstName, String lastName) throws InterruptedException {

		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsButton()
		.clickCreateLeadLink()
		.enterCompName(compname)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLead()
		.clickFindLeads()
		.enterLeadId()
		.updateCompName()
		.clickUpdateButton();

	}

}
