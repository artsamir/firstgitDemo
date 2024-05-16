package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentDemo {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@org.testng.annotations.BeforeClass
	public void reportconfig() {
		
		//Step 1 = create object of extentReports class and specify the file path in the constructor
		report = new ExtentReports("C:\\Users\\samir\\Downloads\\7-MAy\\report1.html");
		
//		step 2 = I have to start the test this will tell the report that this is where is starting my test.
		
		test = report.startTest(("RahulShettyTests")); //name of the test - name will appear in your test
		
	}
	
	// in @BeforeTest writing all pre condition
	
	@BeforeMethod(alwaysRun =  true)
	public void setup() {
		
		driver = new ChromeDriver();
		test.log(LogStatus.PASS, "Chrome Browser Opened Successfully"); // This will log the message in your report
		System.out.println("Browser Opened Successfully"); // This will log the message in console
		
		driver.manage().window().maximize();
		test.log(LogStatus.PASS, "Maximize the Browser"); // This will log the message in your report

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		if(driver.getCurrentUrl().equals("https://rahulshettyacademy.com/AutomationPractice/")) {
			test.log(LogStatus.PASS, "URL loaded Successfully"); // This will log the message in your report
		}else 
			test.log(LogStatus.FAIL, "URL loaded unsuccessfully"); // log the statement for failure
		
		
	}
	
	@Test (groups = "smoke", priority = -1) // the lesser the value of priority, it will be executed first
	public void sendkeystest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys("This is Awasome");
		test.log(LogStatus.PASS, "Text Enter Successfully"); //  This will log the message in your report
	}
		
	
	@Test (groups = "regression", priority = -3)
	public void webtabletest() throws InterruptedException {		
		
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//table)[1]/tbody/tr[9]/td[2]")).getText();
		System.out.println(text);
		
		if(text.contains("Python")) {
			 test.log(LogStatus.PASS, "got the text successfully");// this will log the message in your report
	
		}else
			 test.log(LogStatus.FAIL, "get text failed");// this will log the message in your report
		
	}
	
	@Test (groups = "smoke", priority = -2)
	public void checkboxtest() {
		
		driver.findElement(By.name("checkBoxOption1")).click();
		test.log(LogStatus.PASS, "clicked successfully");// this will log the message in your report
	}
	
	@Test (groups = "regression",priority = 4) // dependsOnMethods = "webtabletest")
	public void linktest() {
		
		WebElement link1 = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(link1));
		
		link1.click();  //using link test
		test.log(LogStatus.PASS, "link is working and clicked on it");// this will log the message in your report
		
	}
	
	
	// in @AfterTest writing all post condition
	 
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.close();
	}
	
	@org.testng.annotations.AfterClass
	public void reportflush() {
		
		report.endTest(test);// stop the reporting
		
		report.flush();// this will erase previous data and create a whole new report
		
	}

}
