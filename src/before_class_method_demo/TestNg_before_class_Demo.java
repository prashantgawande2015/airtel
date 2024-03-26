package before_class_method_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_before_class_Demo {
	WebDriver driver;
	//@BeforeClass()
	@BeforeMethod()
	public void start_browser()
	{
		// print the swami
		System.out.println("Shree Swami Samarth");
		// set the properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  // initilze the driver
		driver = new ChromeDriver();
		
	}
	//@AfterClass()
	@AfterMethod()
	public void close_browser()
	{
		driver.close();
		
	}
	
	@Test
  public void google_page_open() {
		
		driver.get("https://www.google.com/");
	  
  }
	
	@Test
	public void facebook_page_open()
	{
		driver.get("https://www.facebook.com/");
	}
	
}
