package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class parallelTesting {
	
	
	@org.testng.annotations.Test
	public void chrometest() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://zerodha.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Pricing")).click();
		driver.close();
	}
	
	@org.testng.annotations.Test
	public void edgetest() throws InterruptedException {
		
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://zerodha.com/");
		Thread.sleep(1000);
		driver1.findElement(By.linkText("Pricing")).click();
		driver1.close();
	}
	
	@org.testng.annotations.Test
	public void firefoxtest() throws InterruptedException {
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://zerodha.com/");
		Thread.sleep(1000);
		driver1.findElement(By.linkText("Pricing")).click();
		driver1.close();
	}
	

}
