package week1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Enter UserName and Password
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();

		//Click CRM/SFA link
		driver.findElementByXPath("//*[@id=\"button\"]/a/img").click();

		// Click Create Lead
		driver.findElementByLinkText("Create Lead").click();

		// Enter Company Name, First Name and Last Name
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("TestLeafFN1");
		driver.findElementById("createLeadForm_lastName").sendKeys("TestLeafLN1");

		// Click Create Lead Button
		driver.findElementByName("submitButton").click();

		//Verify the FirstName
		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		if (firstName.contains("TestLeafFN1"))
		{
			System.out.println("The Newly created name is :" + firstName);

		}
		else {
			System.out.println("Create Lead did not created new record "+ firstName);
		}



	}

}
