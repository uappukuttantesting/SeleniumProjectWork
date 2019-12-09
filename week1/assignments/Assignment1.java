package week1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {



	public static void main(String[] args) {
		// Watch the verification video:  https://www.youtube.com/watch?v=5sTzJgpt5PM
		// 1) Complete all 5 activities in Edit Fields - http://leafground.com/pages/Edit.html



		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//a) Enter your email address
		driver.findElementById("email").sendKeys("aumesh@gmail.com");

		//b) Append a text and press keyboard tab
		driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/input").sendKeys("NEWTEXT");
		driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/input").sendKeys(Keys.TAB);
				

		//c) Get default text entered
		WebElement lnTxt = driver.findElementByXPath("//*[@id='contentblock']/section/div[3]/div/div/input");
		String dfltTxt = lnTxt.getAttribute("value");
		System.out.println("The Default Text Entered is : "+dfltTxt);

		//d) Clear the text
		lnTxt = driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/div/div/input");
		lnTxt.clear();

		//e) Confirm that edit field is disabled
		lnTxt = driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/div/div/input");
		Boolean status = lnTxt.isEnabled();
		if(status)
		{
			System.out.println("The Edit Field Status is ENABLED");
		}
		else {
			System.out.println("The Edit Field Status is DISABLED ");
		}

		//Close Driver
		driver.close();
	}

}
