package datadriventestingconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_Multiple_TestData_into_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream fin = new FileInputStream("./Excel1/SeleniumExcel.xlsx");
		Workbook book = WorkbookFactory.create(fin);
		Sheet sh = book.getSheet("Sheet2");
		 
		System.setProperty("webdriver.chrome.driver", "./Softwa/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements((By.xpath("//a")));
		int count = links.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
//			WebElement value = links.get(i);
//			Thread.sleep(2000);
//			String attr = value.getAttribute("href");
//			Thread.sleep(2000);
			Row rw = sh.createRow(i);
			Cell cel = rw.createCell(0);
			//Thread.sleep(2000);
			cel.setCellValue(links.get(i).getAttribute("href"));
			Thread.sleep(1000);
			FileOutputStream fout= new FileOutputStream("./Excel1/SeleniumExcel.xlsx");
			book.write(fout);
		}
		
	}

}
