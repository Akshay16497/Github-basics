package Drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class MercuryTours {
  @Test
  public static void Mercurytours() throws InterruptedException {
	  WebDriver akshay;
	//  System.setProperty("webdriver.chrome.driver", "C:\\MY Drivers\\chromedriver.exe");
	  akshay=MyDriver123.getDriver("CRM");
	  akshay.get("http://www.newtours.demoaut.com");
	 WebElement Register=akshay.findElement(By.xpath("//a[text()='REGISTER']"));
	 Register.click();
	// String a=akshay.getTitle();
	 WebElement Firstname=akshay.findElement(By.name("firstName"));
	 Firstname.sendKeys("akshay");
	 WebElement Lastname=akshay.findElement(By.name("lastName"));
	 Lastname.sendKeys("yamsanwar");
	 WebElement Phone=akshay.findElement(By.name("phone"));
	 Phone.sendKeys("9284950503");
	 WebElement Email=akshay.findElement(By.id("userName"));
	 Email.sendKeys("akkiyam@gmail.com");
	 
	 WebElement Add=akshay.findElement(By.name("address1"));
	 Add.sendKeys("abcd");
	 WebElement City=akshay.findElement(By.name("city"));
	 City.sendKeys("Pune");
	 WebElement State=akshay.findElement(By.name("state"));
	 State.sendKeys("MH");
	 WebElement PC=akshay.findElement(By.name("postalCode"));
	 PC.sendKeys("411030");
	 WebElement Country=akshay.findElement(By.xpath("//select[@name='country']"));
	 Select country=new Select (Country);
	// country.selectByVisibleText("TOGO");
	 country.selectByIndex(3);
	// country.selectByValue("");
	 
	 WebElement Username=akshay.findElement(By.name("email"));
	 Username.sendKeys("akshay");
	 WebElement Pass=akshay.findElement(By.name("password"));
	 Pass.sendKeys("akki");
	 WebElement CP=akshay.findElement(By.name("confirmPassword"));
	 CP.sendKeys("akki");
	 
	 WebElement submit=akshay.findElement(By.name("register"));
	 submit.click();
	 //String b=akshay.getTitle();
	 //Assert.assertEquals(a, b);
	// System.out.println("success");
	 WebElement Home=akshay.findElement(By.xpath("//a[text()='Home']"));
	 Home.click();
	 
	 WebElement Username1=akshay.findElement(By.name("userName"));
	 Username1.sendKeys("akshay");
	 WebElement Pass1=akshay.findElement(By.name("password"));
	 Pass1.sendKeys("akki");
	 WebElement submit1=akshay.findElement(By.name("login"));
	 submit1.click();
	 
	 
	 Thread.sleep(5000);
	 akshay.close();
	  
	  
  }
}
