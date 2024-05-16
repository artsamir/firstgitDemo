package AssignmentDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class problem2AssDay3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Samir");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Saren");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("artsamir02demo@hotmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("artsamir02demo@hotmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("S1221@aMir");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByVisibleText("2");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1998");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Up")).click();
		
		Thread.sleep(2000);
		driver.close();
		

		
		
	}

}
