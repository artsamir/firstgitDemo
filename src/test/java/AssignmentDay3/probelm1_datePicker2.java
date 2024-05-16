package AssignmentDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class probelm1_datePicker2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.findElement(By.xpath("//input[@id='datepicker2' and @class='form-control is-datepick']")).click();
		Thread.sleep(2000);	
		
		
		WebElement dropdownYear = driver.findElement(By.xpath("//select[@title='Change the year']"));
		
		Select s = new Select(dropdownYear);
		s.selectByVisibleText("2027");
		
		WebElement dropdMonth = driver.findElement(By.xpath("//select[@title='Change the month']"));
		
		Select s1 = new Select(dropdMonth);
		s1.selectByVisibleText("December");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='12']")).click();
	

	}

}
