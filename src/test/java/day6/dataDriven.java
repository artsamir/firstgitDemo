package day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//Step 1 - we have to mention the path of excel file using a fileInputStream
		
		FileInputStream fis = new FileInputStream("C:\\Users\\samir\\Downloads\\7-MAy\\src\\test\\resources\\testdata\\fbdata.xlsx");
		
		// Step 2 - using workbookFactory use create() and specify the fis referance
		Workbook book = WorkbookFactory.create(fis);
		
		String email = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@name='login']")).click();

	}

}
