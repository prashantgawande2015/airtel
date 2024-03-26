package practice_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// print swami
		System.out.println("Shree swami samarth");
		// set the path
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
		// initilze the driver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://demoqa.com/alerts");
		// click on button (click me)
		WebElement btn= driver.findElement(By.xpath("//button[@id='alertButton']"));
		btn.click();
		Thread.sleep(3000);
		
		// switch to pop-up window
		System.out.println(driver.switchTo().alert().getText()); 
		//System.out.println(s);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

		
	}

}
