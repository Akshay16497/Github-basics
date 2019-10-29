package Drivers;

import org.testng.annotations.Test;

public class invocationCount {
	//WebDriver akshay;
  @Test (groups= {"Sanity","Smoke"})
  public void Reg( ) {
	  System.out.println("Sanity Smoke");
	  
	  
  }
  
  @Test (groups= {"Sanity"})
  public void Reg1( ) {
	  System.out.println("Sanity");
	  
	  
  }
  @Test (groups= {"Smoke"})
  public void Reg2( ) {
	  System.out.println("Smoke");
	  
	  
  }
}
