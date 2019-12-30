package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage enterUsername(String username) {
		driver.findElementById("username").sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}

}
