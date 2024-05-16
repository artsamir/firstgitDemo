package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableDemoi {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
//		String txt = driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr[3]/td[3]")).getText();
//		
//		System.out.println(txt);
		
		String txt = driver.findElement(By.xpath("(//table)[1]/tbody/tr[9]/td[2]")).getText();
		
		while (txt.equals("Python")) {
			
		}
		System.out.println(txt);
		
	}

}
