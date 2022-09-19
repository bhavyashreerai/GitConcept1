package datadriventestingconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_Into_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		FileInputStream fin= new FileInputStream("./Excel1/SeleniumExcel.xlsx");
		Workbook book = WorkbookFactory.create(fin);
		//XSSFWorkbook book=new XSSFWorkbook(fi);
		Sheet sh = book.getSheet("Sheet1");
		Row rw = sh.createRow(0);
		Cell cel = rw.createCell(0);
		cel.setCellValue("Saibaba");
		FileOutputStream fout= new FileOutputStream("./Excel1/SeleniumExcel.xlsx");
		book.write(fout);
		
		
	}

}
