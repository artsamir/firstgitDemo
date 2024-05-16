package AssignmentDay6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class problem2AssDay6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\samir\\Downloads\\7-MAy\\ScreenShoot\\1.png");	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 400);");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Upload']")).click();
//		
//		Thread.sleep(2000);
//		String txt1 = driver.findElement(By.xpath("//*[@id='res']/center")).getText();
//		
//		System.out.println(txt1);
//		
//		
//		Thread.sleep(2000);
//		if(txt1.contains("successfully")) {
//			System.out.println("Test case is pass");
//		}else {
//			System.out.println("Test case is failed");
//		}

	}

}
