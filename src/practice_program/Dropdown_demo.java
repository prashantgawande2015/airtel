package practice_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_demo {

	public static void main(String[] args) {
		// print the swami
		System.out.println("Shree swami samarth");
		// set the property
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		//	System.setProperty("webdriver.chrome.driver", "");
		// initilize the driver
		WebDriver driver = new ChromeDriver();
		// call the web page
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countrydropdown = driver.findElement(By.xpath("//select [@name='country']"));

		Select objselect = new Select(countrydropdown);

		//objselect.selectByValue("INDIA");
		objselect.selectByIndex(3);
// now need to print the all elements		
		List<WebElement>alldropdownoptions = objselect.getOptions();
		for(WebElement option :alldropdownoptions )
		{
			System.out.println(option.getText());
			
		}
	}

}
