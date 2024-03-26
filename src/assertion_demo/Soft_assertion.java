package assertion_demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// soft assertion
// if any TC faild still it goes to next line/ TC
public class Soft_assertion {
 
	SoftAssert objsoftassert = new SoftAssert();
	@Test
  public void Testmetho1() {
	System.out.println("Shree swami samarth");	
	objsoftassert.assertEquals ("ft success", "ft success");
	objsoftassert.assertEquals("Balance deducted", "Balance deducted");
	objsoftassert.assertEquals(10000, 20000);
	objsoftassert.assertAll();
	System.out.println("Test case 1 exection ended.");
		
  }
	
	
	
	@Test
  public void Testmetho2() {
	
		System.out.println("Shree swami samarth");
		System.out.println("we are in 2nd Test case");
		
		
		
		
  }
	
	
}
