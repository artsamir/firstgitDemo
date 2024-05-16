package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class perticularLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		//since all the links are developed using a tag.
		
		// we will use by.tagname to get all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		System.out.println("total links in ebay.com is"+links.size());
		
		for (WebElement link : links) {
			
			if(link.getAttribute("href").contains("signup")) {
				
				System.out.println("Register link is this"+link.getAttribute("href"));
				
				link.click();
				
				break;
			}
			
			//String hrefval = link.getAttribute("href");
			
			//System.out.println(hrefval);// this will print all the links present inside webpage
			
		}
		

	}

}
