package assertion_demo;

import org.testng.Assert;
import org.testng.annotations.Test;
// Hard Assertion Demo
// if Assertion fail then control goes to next Test Case
public class Hard_Asseration {
  @Test
  public void Testmethod1() {
	System.out.println("SHREE SWAMI SAMARTH"); 
	System.out.println("Test case 1 execution started...");
	Assert.assertEquals(10, 20);
	System.out.println("Test case 1 exection ended..");
	
  }
  
  @Test
  public void Testmethod2() {
	  System.out.println("SHREE SWAMI SAMARTH"); 
		System.out.println("Test case 2 execution started...");
		
		System.out.println("Test case 2 exection ended.."); 
	  
  }
    
  
  
}
