package datadriventestingconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchORRead_MultipleData_fromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi = new FileInputStream("./Excel1/SeleniumExcel.xlsx");
		Workbook book = WorkbookFactory.create(fi);
		Sheet sh = book.getSheet("Sheet2");
		System.out.println(sh.getLastRowNum());
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			Row rw = sh.getRow(i);
			Cell cel = rw.getCell(0);
			String value = cel.getStringCellValue();
			System.out.println(value);
		}

	}

}
