package practice_program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Excel_file_upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	// print swami
		System.out.println("SHREE SWAMI SAMarth");
	//set the system path
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
	//read the webpage	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
    // find xpath of upload button & with sendkey method pass the path
	WebElement choosebutton= driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
    choosebutton.sendKeys("C:\\Users\\HP\\Desktop\\Sample_text_file.xlsx");
   
    // click on Terms and Condition checkbox
   WebElement chcekbox= driver.findElement(By.xpath("//input[@id='terms']"));
   chcekbox.click();
    Thread.sleep(3000);
    
// now click on submit button
    WebElement submitbutton =driver.findElement(By.xpath("//button[@id='submitbutton']"));
    submitbutton.click();
    

	}

}
