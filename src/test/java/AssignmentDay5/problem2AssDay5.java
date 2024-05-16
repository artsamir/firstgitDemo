package AssignmentDay5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class problem2AssDay5 {
	
	static WebDriver driver;
	public static void captured(int number) throws IOException{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		
		File file2 = new File("C:\\Users\\samir\\Downloads\\7-MAy\\ScreenShoot\\" + number + ".png");
		
		// copying file1 and file2
		
		FileUtils.copyFile(file1, file2);
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("document.getElementById('inputValEnter').click()");
		js.executeScript("document.getElementById('inputValEnter').value = 'Lunch Box';");
		
		captured(4);
		Thread.sleep(1000);
		
//		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@class='cartTextSpan']")));
		
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();

		
		driver.close();
		
		

	}

}
