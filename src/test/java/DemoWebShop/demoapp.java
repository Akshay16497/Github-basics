package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class demoapp {
  @Test
  public void f() throws InterruptedException {
	  WebDriver akshay;
	  System.setProperty("webdriver.chrome.driver","C:\\MY Drivers\\chromedriver.exe");
	  akshay=new ChromeDriver();
	  akshay.get("http://demowebshop.tricentis.com/");
	  String Title=akshay.getTitle();
	  WebElement Login=akshay.findElement(By.className("ico-login"));
	  Login.click();
	  WebElement Email=akshay.findElement(By.className("email"));
	  Email.sendKeys("anild@gmail.com");
	  WebElement Password=akshay.findElement(By.className("password"));
	  Password.sendKeys("anilanil");
	  WebElement Submit=akshay.findElement(By.xpath("//input[@value='Log in']"));
	  Submit.click();
	  Thread.sleep(5000);
	  String Title1=akshay.getTitle();
	  Assert.assertEquals(Title, Title1);
	  System.out.println("Success");
	  akshay.close();
	  
	  
  }
}
