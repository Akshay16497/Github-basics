package Drivers;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter {
  @Test
  @Parameters({"Location","Designer"})
  public void f(String Location,String Designer) {
	  
	  System.out.println("Test case for login");
	  System.out.println(Location);
	  System.out.println(Designer);
  }
}
