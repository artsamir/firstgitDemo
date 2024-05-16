package AssignmentDay5;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class problem1AssDay5 {
	
	static WebDriver driver;
	public static void captured(int number) throws IOException{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\Users\\samir\\Downloads\\7-MAy\\ScreenShoot\\" + number + ".png");
		
		// copying file1 and file2
		
		FileUtils.copyFile(file1, file2);
		
	}

	public static void main(String[] args) throws IOException {
		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
				
		driver.findElement(By.id("gh-ac")).sendKeys("Shoes");
		driver.findElement(By.id("gh-btn")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 5000);");
						
		captured(1);
		js.executeScript("window.scrollBy(0, -5000);");
		driver.findElement(By.id("gh-ac")).clear();
		
		captured(2);
		driver.close();
		

	}

}
