package AssignmentDay4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class problem1AssDay4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
		// --------------------------------------------- This is first alert ---------------------------------------------
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); // this will Click on the ok button in the alert.
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600)");
		
		// --------------------------------------------- This is second alert ---------------------------------------------
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();  // this is for dismiss the button

		
		// --------------------------------------------- This is third alert ---------------------------------------------
		Thread.sleep(2000);
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.sendKeys("SAMIR");
		al.accept(); //this will click ok 

	}

}
