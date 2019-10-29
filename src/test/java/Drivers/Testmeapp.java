package Drivers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testmeapp {
  @Test
  public void f() throws InterruptedException {
	  WebDriver akshay;
		
			  akshay=MyDriver123.getDriver("CRM");
			  akshay.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			  akshay.findElement(By.xpath("//span[text()='AboutUs']")).click();
			  akshay.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span")).click();
			  akshay.findElement(By.xpath("//span[text()='Bangalore']")).click();
			  Set<String> T_wid=akshay.getWindowHandles();
			  for(String S:T_wid)
			  {
				  akshay.switchTo().window(S);
				  System.out.println(akshay.getWindowHandle());
			  }
			  akshay.switchTo().frame(akshay.findElement(By.name("main_page")));
			  System.out.println("Banglore Address:");
			  System.out.println( akshay.findElement(By.xpath("//p[text()='Testme Inc.']")).getText());
			  System.out.println( akshay.findElement(By.xpath("//p[text()='12, EPIP Zone, Bangalore']")).getText());
			  System.out.println( akshay.findElement(By.xpath("//p[text()='Bangalore, India']")).getText());
			  System.out.println( akshay.findElement(By.xpath("//p[text()='Mobile: +91 9898954321']")).getText());
			  System.out.println( akshay.findElement(By.xpath("//p[text()='Fax: 84554323']")).getText());
			  System.out.println( akshay.findElement(By.xpath("//p[text()='Email: info@testmeapp.com']")).getText());
			  
			  Thread.sleep(5000);
			 akshay.quit();
	  
	  
  }
}
