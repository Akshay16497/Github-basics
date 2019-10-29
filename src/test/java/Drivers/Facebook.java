package Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Drivers.MyDriver123;
public class Facebook {
	 WebDriver akshay;
	@Test
 
  public void f() throws InterruptedException {
	  akshay=MyDriver123.getDriver("CRM");
	  akshay.get("https://www.facebook.com");
	  WebElement firstname=akshay.findElement(By.name("firstname"));
	  firstname.sendKeys("akki");
	  WebElement lastname=akshay.findElement(By.name("lastname"));
	  lastname.sendKeys("yam");
	  WebElement email=akshay.findElement(By.name("reg_email__"));
	  email.sendKeys("94984555");
	  //WebElement email1=akshay.findElement(By.name("reg_email_confirmation__"));
	 // email1.sendKeys("aka@gmail.com");
	  WebElement pass=akshay.findElement(By.name("reg_passwd__"));
	  pass.sendKeys("akka");
	  
	  WebElement day=akshay.findElement(By.name("birthday_day"));
	  day.sendKeys("18");
	  WebElement month=akshay.findElement(By.name("birthday_month"));
	  month.sendKeys("Oct");
	  WebElement year=akshay.findElement(By.name("birthday_year"));
	  year.sendKeys("1997");
	  akshay.findElement(By.xpath("//input[@value='2']")).click();
	  Thread.sleep(5000);
	  
	  
	  
	  
  }
	
	@Test(enabled=false)
	public void wbdw()
	{
		  akshay=MyDriver123.getDriver("CRM");
		  akshay.get("http://newtours.demoaut.com/");
		  WebDriverWait wt1=new WebDriverWait(akshay,10);
		  wt1.until(ExpectedConditions.presenceOfElementLocated(By.linkText("REGISTER")));
		  
		  
	}
	

}






