/*
 * package day6;
 * 
 * import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class brokenLinks {
 * 
 * public static void main(String[] args) {
 * 
 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
 * 
 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 * 
 * // ---------------------- this is getlinks code -------------------------
 * List<WebElement> links = driver.findElements(By.tagName("a"));
 * 
 * System.out.println("Total links in Flipkart.com is : " + links.size());
 * 
 * for(WebElement link : links) {
 * 
 * String url = link.getAttribute("href");
 * 
 * if(url != null) { try {
 * 
 * driver = new ChromeDriver(); driver.get(url);
 * 
 * if(driver.getTitle().equalsIgnoreCase("not found")||driver.getTitle().isEmpty
 * ()) {
 * 
 * System.out.println("Broken links: "+ url);
 * 
 * } else { System.out.println("Valid Links :" + url); }
 * 
 * 
 * } else { System.out.println("Broken links :" + url); }
 * 
 * catch (Exception e) { // TODO: handle exception }
 * 
 * driver.close();
 * 
 * }
 * 
 * driver.quit();
 * 
 * 
 * }
 * 
 * }
 */