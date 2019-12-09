package week1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Enter Username and Password to Login
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		
		//Click Vendors
		driver.findElementByXPath("//*[@id=\"dashmenu\"]/div[5]/button").click();
		
		//Click Vendor Search
		driver.findElementByLinkText("Search for Vendor").click();
		
		//Enter Vendor Name (Blue Lagoon)
		driver.findElementById("vendorName").sendKeys("Telephone Systems");
		
		//Click Search
		driver.findElementById("buttonSearch").click();
		
		//Get the Country Name based on the Vendor
		String Country = driver.findElementByXPath("/html/body/div/div[2]/div/table/tbody/tr[2]/td[5]").getText();
		System.out.println("The Name of the Country is : "+Country);
		
		//Click Logout
		driver.findElementByLinkText("Log Out").click();
		
		//Close Browser
		driver.close();
		
	}

}
