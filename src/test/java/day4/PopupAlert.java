package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
		
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); // this will Click on the ok button in the alert.
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();  // this is for dismiss the button

		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("promptBox")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.sendKeys("SAMIR");
		al.accept(); //this will click ok 
		
		
		
	}

}
