package testng_demo_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class first_program_testng {
 
	
	
	
	@Test
  public void TestCaseMethod1() {
	System.out.println("we are in method 1");  
	// print swami
	System.out.println("SHREE SWAMI SAMARTH");
	// SET properties
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 // Initialize the driver;
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	  
	  
  }
  
  @Test
  public void TestCaseMethod2()
  {
	  System.out.println("we are in method2");
	  
	  System.out.println("we are in method 1");  
		// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		// SET properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 // Initialize the driver;
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		  
		  
	  
  }
  
}
