package week2.day4;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOneTable {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );

		Thread.sleep(2500);
		//Enter From as Chennai ,then press tab
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Chennai");
		WebElement fromStation = driver.findElementByXPath("//div[@title='Mgr Chennai Central Suburban']");
		Actions frombuilder = new Actions(driver);
		frombuilder.moveToElement(fromStation).click().perform();

		// Enter to as Bangalore
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Bangalore");
		WebElement toStation = driver.findElementByXPath("//div[@title='Bangalore East']");
		Actions tobuilder = new Actions(driver);
		tobuilder.moveToElement(toStation).click().perform();

		//Click on Get Trains 
		driver.findElementById("buttonFromTo").click();

		// Uncheck sort on Date
		if (driver.findElementById("chkSelectDateOnly").isSelected())
		{
			driver.findElementById("chkSelectDateOnly").click();
		}

		//Get all Trains name and Print them
		WebElement trainList = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rows = trainList.findElements(By.tagName("tr"));
		Set<String> trainListSet = new TreeSet<String>();
		Set<String> trainNoListSet = new TreeSet<String>();
		
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) {
			WebElement eachrow = rows.get(i);
			String trainName = eachrow.findElements(By.tagName("td")).get(1).getText();
			String trainNumber = eachrow.findElements(By.tagName("td")).get(0).getText();
			System.out.println(trainName);
			trainListSet.add(trainName);
			trainNoListSet.add(trainNumber);

		}
		System.out.println("******************************************************************");
		System.out.println("The Unique Train Names are : ");
		System.out.println("******************************************************************");
		
		// remove duplicate train name
		for (String uniquetrainname : trainListSet) {
			System.out.println(uniquetrainname);
		}
		System.out.println("******************************************************************");
		System.out.println("The Unique Train Numbers are : ");
		System.out.println("******************************************************************");
		// Get all the train number of Unique Train Name
		for (String uniquetrainno : trainNoListSet) {
			System.out.println(uniquetrainno);
		}

	}

}
