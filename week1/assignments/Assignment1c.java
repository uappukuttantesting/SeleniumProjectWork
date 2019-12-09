package week1.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1c {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//b) Find where am supposed to go without clicking me?
		System.out.println("The URL is : " +driver.findElementByLinkText
				("Find where am supposed to go without clicking me?").getAttribute("href"));

		//e) How many links are available in this page?
		List<WebElement> LinkCount = driver.findElementsByTagName("a");
		System.out.println("The Total Links in the webpage is : "+LinkCount.size());

		//d) Go to Home Page (Interact with same link name)
		driver.findElementByLinkText("Go to Home Page").click();
		driver.findElementByXPath("//img[@alt='Link']").click();

		//c) Verify am I broken?
		driver.findElementByLinkText("Verify am I broken?").click();
		String title = driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("The link is Broken with error code 404");
		}
		else
		{
			System.out.println("The link is not Broken");
		}







		//a) Go to Home Page
		driver.findElementByLinkText("Go to Home Page").click();



	}
}
