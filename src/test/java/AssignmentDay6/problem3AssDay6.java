package AssignmentDay6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class problem3AssDay6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\samir\\Downloads\\7-MAy\\src\\test\\resources\\testdata\\instagramLogin.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
		String email =  book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String pass =  book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//label/input[@name='username']")).sendKeys(email);
		driver.findElement(By.xpath("//label/input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		

	}

}
