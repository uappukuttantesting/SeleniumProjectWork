package week1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1b {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//b) Find position of button (x,y)
		System.out.println("The Position of X and Y is : " +driver.findElementById("position").getLocation());
		
		//c) Find button color
		System.out.println("The Color is : " +driver.findElementById("color").getCssValue("background-color"));

		//d) Find the height and width
		System.out.println("The Height and Width is : " +driver.findElementById("size").getSize());
		
		//a) Click button to travel home page
		driver.findElementById("home").click();

		


		//Close Driver
		driver.close();
	}

}
