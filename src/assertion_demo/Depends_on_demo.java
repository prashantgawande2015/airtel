package assertion_demo;

import org.testng.annotations.Test;

public class Depends_on_demo {
	
	@Test
	public void methodOne() {
		
		System.out.println("Helloo.. Im in method adding numbers");
		}

		@Test
		public void MethodTwo() {
		System.out.println("Helloo.. Im in method divided by zero");
		int e = 1 / 0;
		}

		@Test(dependsOnMethods= {"MethodTwo"})
		public void methodThree() {
		System.out.println("Helloo.. Im in method skip");
		}

}
