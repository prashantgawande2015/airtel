package assertion_demo;

import org.testng.annotations.Test;

public class Priority_TC_demo {
 
	
  @Test (priority=2)
  public void Insert_car_key() {
	  System.out.println("INSERT CAR KEY SECOND SETP");
	  
  }
  
  @Test(priority=3)
  public void start_the_car() {
	  System.out.println("START THE CAR 3rd SETP"); 
  }
  
  @Test (priority=1)
  public void Open_Card_door() {
	  System.out.println("OPEN CARD DOOR FIRST STEP");
  }
  
}
