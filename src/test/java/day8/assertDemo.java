package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class assertDemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		String actualtitle = driver.getCurrentUrl();
		String expectedtitle = "https://rahulshettyacademy.com/AutomationPractice/";
		
		Assert.assertEquals(actualtitle, expectedtitle);
			
		
	}
	
	@Test
	public void clicktest() {
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		checkbox1.click();
		
		boolean status = checkbox1.isSelected();
		Assert.assertTrue(status);
		driver.navigate().refresh();
	}
	
	@Test (groups = "regression", priority = -3)
	public void webtabletest() throws InterruptedException {		
		
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//table)[1]/tbody/tr[9]/td[2]")).getText();
		
		String expected = "Master Selenium Automation in simple Python Language";
		Assert.assertEquals(text, expected);
		driver.navigate().refresh();		
		
		
	}

}
