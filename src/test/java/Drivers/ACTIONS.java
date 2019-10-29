package Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ACTIONS {
  @Test(enabled=false)
  public void f() throws InterruptedException {
	  WebDriver akshay;
		
	  akshay=MyDriver123.getDriver("CRM");
	  akshay.get("http://demowebshop.tricentis.com/");
	  WebElement Goestosearch=akshay.findElement(By.name("q"));
	  Actions act1=new Actions(akshay);
	  act1.keyDown(Goestosearch,Keys.ALT).sendKeys("computer").keyUp(Keys.ALT).build().perform();  
	  Thread.sleep(3000);
	  act1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	  
  }
  
  
  @Test(enabled=false)
  public void Hover() throws InterruptedException {
	  WebDriver akshay;
		
	  akshay=MyDriver123.getDriver("CRM");
	  akshay.get("https://www.naukri.com/");
	  WebElement T1=akshay.findElement(By.xpath("//div[text()='Jobs']"));
	  WebElement T2=akshay.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/div/ul[2]/li[3]/a"));
	  
	  Actions act1=new Actions(akshay);
	  act1.moveToElement(T1).build().perform();
	  T2.click();
	  
}
  
  @Test
  public void Hover1() throws InterruptedException {
	  WebDriver akshay;
		
	  akshay=MyDriver123.getDriver("CRM");
	  akshay.get("https://www.spicejet.com");
	  WebElement T1=akshay.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_0']"));
	//label[@for='ctl00_mainContent_rbtnl_Trip_0']
	  System.out.println("the radio button is "+T1.isEnabled());
	//label[text()=' Family and Friends']
	  WebElement T2=akshay.findElement(By.xpath("//label[text()=' Family and Friends']"));
	  System.out.println("the checkbox button is "+T2.isSelected());
	  WebElement T3=akshay.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]"));
	 // T3.click();
	  //Thread.sleep(2000);
	  //WebElement T4=akshay.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[1]/a"));
	  //T4.click();
	  System.out.println("the display button is "+T3.isDisplayed());
	  
	  
}
}
