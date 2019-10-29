package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDriver123 {

	public static WebDriver getDriver(String string) {
		
		if(string.equals("CRM"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\MY Drivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(string.equals("IEEE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\MY Drivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		
		else if(string.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\MY Drivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else
			return null;

	}

}
