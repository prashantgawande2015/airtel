package practice_program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class firstjava_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print the swami
				System.out.println("shree swami Samarth");
				// set the path
				
			//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
					
				// display page
				WebDriver driver = new ChromeDriver();
				driver.get("https://demoqa.com/text-box");
				
				// passing name into textbox by ID attribute
				WebElement usernametextbox =driver.findElement(By.id("userName"));
		        usernametextbox.sendKeys("shree swami samarth");
		     
		     	// passing the email text by finding its attributes
		        WebElement emailtextbox= driver.findElement(By.id("userEmail"));
		        emailtextbox.sendKeys("shree@gmail.com");
		        
		        
		       WebElement currentaddtextbox=   driver.findElement(By.id("currentAddress"));
		      currentaddtextbox.sendKeys("PUNE");
		     
		     
		       WebElement parmanataddress = driver.findElement(By.id("permanentAddress"));
		    		   
		       parmanataddress.sendKeys("PUNE");
		       
		    		   
	}
	
	

}
