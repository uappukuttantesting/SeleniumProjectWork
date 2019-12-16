package week2.day4;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		String[] ary = {"apple", "orange"};
		
		Arrays.parallelSort(ary);
		
		
		//System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click on Draggable
		driver.findElementByXPath("//img[@alt='Draggable']").click();
		
		//Play with Draggable
		driver.findElementById("draggable");
		
		WebElement dragEle = driver.findElementById("draggable");
		
		Actions builder = new Actions(driver);
		builder.pause(2000)
		.dragAndDropBy(dragEle, 20, 75)
		.perform();
		

	}

}
