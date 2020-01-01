package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

	public static ChromeDriver driver;
	public static String cleadID;

	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Given("Load the application url")
	public void load_the_application_url() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

	@Given("Enter the username")
	public void enter_the_username() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementById("username").sendKeys("Demosalesmanager");

	}

	@Given("Enter the password")
	public void enter_the_password() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementById("password").sendKeys("crmsfa");

	}

	@When("click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Home page should be diplayed")
	public void home_page_should_be_diplayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page is Displayed");

	}

	@Given("Click on SRMSFA image")
	public void click_on_SRMSFA_image() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();

	}

	@Given("Click on Leads tab")
	public void click_on_Leads_tab() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("Leads").click();
	}

	@Given("Click on Create Leads tab")
	public void click_on_Create_Leads_tab() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the Company Name")
	public void enter_the_Company_Name() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");

	}

	@Given("Enter the First Name")
	public void enter_the_First_Name() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementById("createLeadForm_firstName").sendKeys("Umesh");

	}

	@Given("Enter the Last Name")
	public void enter_the_Last_Name() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementById("createLeadForm_lastName").sendKeys("Appukuttan");
	}

	@When("Click on Create Lead button")
	public void click_on_Create_Lead_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(2000);
		String lID = driver.findElementById("viewLead_companyName_sp").getText();
		cleadID = lID.replaceAll("[^\\d.]", "");
		System.out.println("Lead ID Created : " + cleadID);
	}

	@Then("View Leads Page is displayed")
	public void view_Leads_Page_is_displayed() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='id']").sendKeys(cleadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}

}
