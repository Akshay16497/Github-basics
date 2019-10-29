package Drivers;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	WebDriver akshay;
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  akshay=MyDriver123.getDriver("CRM");
	  akshay.get("http://www.newtours.demoaut.com");
	  
	  WebElement Username1=akshay.findElement(By.name("userName"));
		 Username1.sendKeys(n);
		 WebElement Pass1=akshay.findElement(By.name("password"));
		 Pass1.sendKeys(s);
		 WebElement submit1=akshay.findElement(By.name("login"));
		 submit1.click();
		 akshay.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "akshay", "akki" },
      new Object[] { "mercury", "mercury" },
    };
  }
}
