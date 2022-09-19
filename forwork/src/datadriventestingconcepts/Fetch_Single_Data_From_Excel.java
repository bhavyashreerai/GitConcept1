package datadriventestingconcepts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetch_Single_Data_From_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi= new FileInputStream("./Excel1/SeleniumExcel.xlsx");
		Workbook book = WorkbookFactory.create(fi);
		//XSSFWorkbook book=new XSSFWorkbook(fi);
		Sheet sh = book.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		Cell cel = rw.getCell(0);
		String value = cel.getStringCellValue();
		System.out.println(value);
		

	}

}
