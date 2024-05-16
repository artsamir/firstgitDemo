package AssignmentDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class problem3AssDay3 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		Actions act = new Actions(driver);
		
		WebElement h1 = driver.findElement(By.linkText("Electronics"));
		WebElement h2 = driver.findElement(By.linkText("Fashion"));
		WebElement h3 = driver.findElement(By.linkText("Electronics"));
		
		
		act.moveToElement(h1).build().perform();
		Thread.sleep(1000);
		act.moveToElement(h2).build().perform();
		Thread.sleep(1000);
		act.moveToElement(h3).build().perform();
		Thread.sleep(500);
		driver.findElement(By.linkText("Refurbished")).click();

	}

}
