package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksCollect {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		// ---------------------- this is getlinks code -------------------------
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links in Flipkart.com is : " + links.size());
		
		for(WebElement link : links) {
			
			String hrefVal = link.getAttribute("href");
			System.out.println(hrefVal);
		}
		
			
		
	}

}
