package Drivers;
import Drivers.MyDriver123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class mercurylinks {
	WebDriver akshay;
  @Test
  public void f() {
	  
	  akshay=MyDriver123.getDriver("CRM");
	  akshay.get("http://www.newtours.demoaut.com");
	  List<WebElement> list1=akshay.findElements(By.tagName("a"));
	  int count_links=list1.size();
	  System.out.println(count_links);
	  
	  for(int i=0;i<count_links;i++)
	  {
		  String aa=list1.get(i).getText();
		  System.out.println(aa);
	  }
	  
  }
}
