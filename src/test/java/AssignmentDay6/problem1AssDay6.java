package AssignmentDay6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class problem1AssDay6 {
	
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
		
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		
		captured(3);
		
		WebElement ball = driver.findElement(By.id("draggable"));
		WebElement area = driver.findElement(By.id("dropzone2"));
		WebElement area2 = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		Actions act2 = new Actions(driver);
		
		act.dragAndDrop(ball, area).build().perform();
		
		captured(4);
		Thread.sleep(2000);
		act2.dragAndDrop(ball, area2).build().perform();

	}

}
