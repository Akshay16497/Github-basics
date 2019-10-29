package My_Demo1.My_Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver akshay;
		System.setProperty("webdriver.ie.driver","C:\\MY Drivers\\IEDriverServer.exe");
		akshay=new InternetExplorerDriver();
		akshay.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		Thread.sleep(5000);
		akshay.close();

	}

}
