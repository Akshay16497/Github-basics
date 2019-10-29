package Drivers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportsDemo {
	WebDriver anil;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
  
	  public void StartReport() {
		  htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/testReport2.html");
		  extent = new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  htmlReporter.config().setDocumentTitle("Extent Report Demo");
	      htmlReporter.config().setReportName("Test Report");
	      htmlReporter.config().setTheme(Theme.DARK);
	      htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	  }
	@Test
	public void login() {
		test=extent.createTest("Login TestCase","Application Accessibility");
		 anil=MyDriver123.getDriver("CRM");
	    anil.get("http://demowebshop.tricentis.com/");
	    Assert.assertEquals("Srinivas", anil.getTitle());
	}
	@Test
	public void testCase1() {
	    test = extent.createTest("Test Case 1", "PASSED test case");
	    Assert.assertTrue(true);
	}
	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
	        
	        TakesScreenshot snapshot =   (TakesScreenshot)anil;
        File src = snapshot.getScreenshotAs(OutputType.FILE);
	        String Path = System.getProperty("user.dir") +"/test-output/screens/"+result.getName()+".png";
        FileUtils.copyFile(src, new File(Path));
	        test.addScreenCaptureFromPath(Path, result.getName());
	        test.fail(result.getThrowable());
	    }
	    else if(result.getStatus() == ITestResult.SUCCESS) {
	        test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	    }
	    else {
	        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	        test.skip(result.getThrowable());
	    }
	}
	@AfterTest
	public void tearDown() {
	     //to write or update test information to reporter
	    extent.flush();
	}
  }

