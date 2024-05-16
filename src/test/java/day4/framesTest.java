package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/iframes");
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']")));
		driver.findElement(By.id("actionButton")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']")));
		driver.findElement(By.id("actionButton")).click();
		
		
		
		driver.quit();

	}

}
