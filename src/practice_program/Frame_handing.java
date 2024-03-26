package practice_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handing {

	public static void main(String[] args) {
	
		// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// initilize the webdriver
		WebDriver driver = new ChromeDriver();
		// call the page
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		
	WebElement frameelement =	driver.findElement(By.xpath("//img[@src='Jmeter720.png']")); 
		
	frameelement.click();
		

		
		
	}

}
