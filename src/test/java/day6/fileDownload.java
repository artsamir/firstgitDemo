package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileDownload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/FileDownload.html#google_vignette");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 400)");
		
		driver.findElement(By.linkText("Download")).click();
		

	}

}
