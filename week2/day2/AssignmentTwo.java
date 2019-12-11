package week2.day2;

public class AssignmentTwo extends Assignmentone {

	public static void main(String[] args) {

		Assignmentone Ass1 = new Assignmentone();
		Ass1.LaunchBrowser();
		Ass1.FindLead();
		AssignmentTwo Ass2 = new AssignmentTwo();
		Ass2.DeleteLead();

	}

	public void DeleteLead() {

		//Click Phone Number Tab
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();

		//Enter Phone Number
		driver.findElementByName("phoneNumber").sendKeys("9840979359");

		// Click Find Lead Button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Capture the first resulting Lead ID
		String LeadID = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();

		// Click on First resulting Lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

		//Click on Delete Button
		driver.findElementByLinkText("Delete").click();

		// Click Find Lead
		driver.findElementByLinkText("Find Leads").click();

		// Enter ID
		driver.findElementByXPath("(//input[@name='id'])[1]").sendKeys(LeadID);

		// Click Find Lead Button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		// Verify the message 'No record to display'
		String msg = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(msg.contains("No records to display")) {
			System.out.println("The Lead ID is successfully deleted");
		}else {
			System.out.println("Unable to delete Lead ID");
		}
	}


}
