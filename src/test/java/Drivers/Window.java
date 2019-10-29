package Drivers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Window {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver akshay;
		//  System.setProperty("webdriver.chrome.driver", "C:\\MY Drivers\\chromedriver.exe");
		  akshay=MyDriver123.getDriver("CRM");
		  akshay.get("https://retail.onlinesbi.com/retail/login.htm");
		  String p_wid=akshay.getWindowHandle();
		  System.out.println(p_wid);
		  Thread.sleep(2000);
		  akshay.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
		  String c_wid=akshay.getWindowHandle();
		  System.out.println(c_wid);
		  Set<String> T_wid=akshay.getWindowHandles();
		  for(String S:T_wid)
		  {
			  akshay.switchTo().window(S);
			  System.out.println(akshay.getWindowHandle());
		  }
		  akshay.close();
		  
		  	
  }
}
