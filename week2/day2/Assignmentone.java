package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentone {

	static ChromeDriver driver; 

	public static void main(String[] args) {

		Assignmentone Ass1 = new Assignmentone();

		Ass1.LaunchBrowser();
		Ass1.FindLead();
		Ass1.ModifyLead();

	}

	public void LaunchBrowser() {

		driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Enter UserName and Password
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();

	}

	public void FindLead() {
		//Click CRM/SFA link
		driver.findElementByXPath("//*[@id=\"button\"]/a/img").click();

		// Click Create Lead
		driver.findElementByLinkText("Create Lead").click();

		// Click Find Lead
		driver.findElementByLinkText("Find Leads").click();



	}

	public void ModifyLead() {

		// Enter First Name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Umesh");

		// Click Find Lead Button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Click on first resulting Lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();


		// Verify the title of the page
		String LeadTitle = driver.getTitle();
		if(LeadTitle.contains("CRM")) {
			System.out.println("The Title of the Screen is "+ LeadTitle);
		}else
		{
			System.out.println("The Title is not valid"+LeadTitle);
		}

		// Click on Edit Button
		//	driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByLinkText("Edit").click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Update Company Name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("CarnivalUpdated");

		// Click on Update Button
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();

		// Verify the updated details
		String UpdatedCName = driver.findElementById("viewLead_companyName_sp").getText();
		if(UpdatedCName.contains("CarnivalUpdated")) {
			System.out.println("The updated value matches "+ UpdatedCName);
		}else {
			System.out.println("The company name is not updated");	
		}

		// Close the browser
		//driver.close();
	}
	
	

}
