package practice_program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frame_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print swami
	System.out.println("Shree swami samarth");
	// set the path
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	// initilize the web driver
	
	WebDriver driver = new ChromeDriver();
	// call the webpage
	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.switchTo().frame("a077aa5e");
	// not need to click so..
	WebElement frame_element = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	
	frame_element.click();
	driver.switchTo().defaultContent();
	WebElement email_textbox= driver.findElement(By.id("philadelphia-field-email"));
	email_textbox.sendKeys("testing@gmail.com");
	
	
	

	}

}
