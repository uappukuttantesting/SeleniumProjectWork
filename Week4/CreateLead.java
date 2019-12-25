package week4.day1testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateLead {

	public static ChromeDriver driver = new ChromeDriver();

	@Test(dataProvider = "credentials")
	public static void LoginLeadApp(String Username, String Password) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(Username);
		driver.findElementById("password").sendKeys(Password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Test(dataProvider = "createLead")
	public static void runCreateLead(String comp, String fname, String sname) {

		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(comp);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(sname);
		driver.findElementByName("submitButton").click();
		//driver.close();
	}

	@DataProvider
	public String[][] credentials() throws IOException {

		return ReadFromExcel.excelData(0);

	}

	@DataProvider
	public String[][] createLead() throws IOException {

		return ReadFromExcel.excelData(1);

	}

}