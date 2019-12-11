package week2.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Search 'Television 43 inch' in the search box
		driver.findElementById("twotabsearchtextbox").sendKeys("Television 43 inch",Keys.ENTER);



		// Get all TV name in a List
		List<String> SmsList = new ArrayList<String>();
		List<WebElement> tvList = driver.findElementsByXPath("//span[@class='a-size-medium a-color-base a-text-normal']");

		//Print all the TV names alphabetically
		Set<String> tvListSet = new TreeSet<String>();	
		int cnt=0;
		for (WebElement TVList : tvList) {
			if(TVList.getText().contains("Samsung"))
			{
				SmsList.add(TVList.getText()); // will add only Samsung TV
				tvListSet.add(TVList.getText());	
			}else {
				tvListSet.add(TVList.getText());

			}

		}	

		for (String allTV : tvListSet) {
			System.out.println(allTV);
		}

		//Print the size of products that contains 'Samsung' in its name and also its size
		System.out.println("How many products' names contains 'Samsung' in it? : "+SmsList.size());
		
		for (String SamsungTV : SmsList) {
			System.out.println(SamsungTV);
		}
	}

}
