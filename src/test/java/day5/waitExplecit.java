package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitExplecit {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://v1.training-support.net/selenium/iframes");
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//  //button[@id='actionButton' and @class='ui inverted red button']
		
		w.until(ExpectedConditions.attributeContains(By.id("iframe"),"src", "/selenium/frame1"));
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']")));
		
	
		driver.findElement(By.id("actionButton")).click();
		
		
		driver.switchTo().defaultContent();// this will switch back to the main webpage.
		
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.id("actionButton")).click(); // clicking on frame2 button
		
	}

}
