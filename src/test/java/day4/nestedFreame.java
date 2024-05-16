package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFreame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://v1.training-support.net/selenium/nested-iframes");
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']"));
		
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe1 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
		
		
		driver.switchTo().frame(innerframe1);
		driver.findElement(By.xpath("(//button[contains(text(),'Click Me!')])[1]")).click();
		
		
		driver.switchTo().defaultContent();		
//		WebElement innerframe2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));		
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
		driver.switchTo().frame(innerframe2);
		driver.findElement(By.cssSelector("#actionButton")).click();
		
		
		
		
		
		
		

	}

}
