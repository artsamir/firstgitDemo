package AssignmentDay8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class day8Assignment {
	
	ExtentTest test;
	ExtentReports report;
	
	@org.testng.annotations.BeforeClass
	public void reportconfig() {
		
		//Step 1 = create object of extentReports class and specify the file path in the constructor
		report = new ExtentReports("C:\\Users\\samir\\Downloads\\7-MAy\\parallelTestReport.html");
		
//		step 2 = I have to start the test this will tell the report that this is where is starting my test.
		
		test = report.startTest(("RahulShettyTests")); //name of the test - name will appear in your test
		
	}
	
			
	@Test
	public void chromelogintest() {
		
		WebDriver driver = new ChromeDriver();
		test.log(LogStatus.PASS, "Chrome Browser Opened Successfully"); // This will log the message in your report

		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		test.log(LogStatus.PASS, "Chrome Browser Maximize"); // This will log the message in your report
				
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		test.log(LogStatus.PASS, "Username Enter Successfully"); // This will log the message in your report

		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		test.log(LogStatus.PASS, "Password Enter Successfully"); // This will log the message in your report

		driver.findElement(By.xpath("//button/i[text()=' Login']")).click();
		
	
		String currenttitle = driver.getCurrentUrl();
		String expectedtitle = "https://the-internet.herokuapp.com/secure";
		Assert.assertEquals(currenttitle, expectedtitle);
		test.log(LogStatus.PASS, "Logged in Successfully"); // This will log the message in your report
		
		driver.close();
		
		}
	
	
	
	@Test
	public void edgelogintest() {
		
		WebDriver driver1 = new EdgeDriver();
		test.log(LogStatus.PASS, "Chrome Browser Opened Successfully"); // This will log the message in your report
		
		driver1.get("https://the-internet.herokuapp.com/login");
		driver1.manage().window().maximize();
		test.log(LogStatus.PASS, "Chrome Browser Maximize"); // This will log the message in your report
		
		driver1.findElement(By.id("username")).sendKeys("tomsmith");
		test.log(LogStatus.PASS, "Username Enter Successfully"); // This will log the message in your report
		
		driver1.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		test.log(LogStatus.PASS, "Password Enter Successfully"); // This will log the message in your report
		
		driver1.findElement(By.xpath("//button/i[text()=' Login']")).click();
		
		
		String currenttitle = driver1.getCurrentUrl();
		String expectedtitle = "https://the-internet.herokuapp.com/secure";
		Assert.assertEquals(currenttitle, expectedtitle);
		test.log(LogStatus.PASS, "Logged in Successfully"); // This will log the message in your report
		
		driver1.close();
		
	}
	
	
	
	@Test
	public void firefoxlogintest() {
		
		WebDriver driver2 = new FirefoxDriver();
		test.log(LogStatus.PASS, "Chrome Browser Opened Successfully"); // This will log the message in your report
		
		driver2.get("https://the-internet.herokuapp.com/login");
		driver2.manage().window().maximize();
		test.log(LogStatus.PASS, "Chrome Browser Maximize"); // This will log the message in your report
		
		driver2.findElement(By.id("username")).sendKeys("tomsmith");
		test.log(LogStatus.PASS, "Username Enter Successfully"); // This will log the message in your report
		
		driver2.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		test.log(LogStatus.PASS, "Password Enter Successfully"); // This will log the message in your report
		
		driver2.findElement(By.xpath("//button/i[text()=' Login']")).click();
		
		
		String currenttitle = driver2.getCurrentUrl();
		String expectedtitle = "https://the-internet.herokuapp.com/secure";
		Assert.assertEquals(currenttitle, expectedtitle);
		test.log(LogStatus.PASS, "Logged in Successfully"); // This will log the message in your report
		
		driver2.close();
		
	}
	
	@org.testng.annotations.AfterClass
	public void reportflush() {
		
		report.endTest(test);// stop the reporting
		
		report.flush();// this will erase previous data and create a whole new report
		
	}
		
	

}
