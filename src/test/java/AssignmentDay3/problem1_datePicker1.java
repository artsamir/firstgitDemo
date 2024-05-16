package AssignmentDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class problem1_datePicker1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		// --------------------------------------------- This is date picker1 code -----------------------------------------------------------------------------------
		
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
		Thread.sleep(2000);
		String actualMonthD1 = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();		
		String actualYearD1 =  driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
		
		while (!(actualMonthD1.equals("December")&&actualYearD1.equals("2024"))) {
			
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();			
			actualMonthD1 = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
			actualYearD1 = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
			
		}
		driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='12']")).click();
		
			

	}

}
