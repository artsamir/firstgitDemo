package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		// to upload a file we have to sendkeys of the path of the file(without clicking upload button)
		
		driver.findElement(By.className("upload_txt")).sendKeys("C:\\Users\\samir\\Downloads\\7-MAy\\ScreenShoot\\1.png");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		Thread.sleep(2000);
		String txt1 = driver.findElement(By.xpath("//*[@id='res']/center")).getText();
		
		System.out.println(txt1);
		
		
		Thread.sleep(2000);
		if(txt1.contains("successfully")) {
			System.out.println("Test case is pass");
		}else {
			System.out.println("Test case is failed");
		}
//		System.out.println(txt);
		
		
		
		

	}

}
