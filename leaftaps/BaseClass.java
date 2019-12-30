package org.testleaf.leaftaps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.leaftaps.utils.DataLibrary;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {

	public static ChromeDriver driver;
	public static String excelFileName;
	public static String cleadID;

	@BeforeMethod
	public void login() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void logout() {

		driver.close();
	}
	
	@DataProvider(name="excelData")
	public String[][] getData() throws IOException {
		String[][] data = DataLibrary.readExcel(excelFileName);
		return data;
	}

}
