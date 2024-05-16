package AssignmentDay4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class problem3AssDay4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		String parenthandle = driver.getWindowHandle(); 
	    Set<String> allhandles = driver.getWindowHandles();


	    for (String singlehandle : allhandles) {

	    	driver.switchTo().window(singlehandle);

	    	if(driver.getTitle().equals("Home | Elemental Selenium")) {
	    		break; 
	    	}
	    	

	    }
		driver.findElement(By.id("email")).sendKeys("artsamir02Demo@hotmail.com");
		WebElement opt = driver.findElement(By.id("options"));
		Select select = new Select(opt);
		select.selectByVisibleText("Python");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(500);
		driver.switchTo().window(parenthandle);
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();			
		

	}

}
