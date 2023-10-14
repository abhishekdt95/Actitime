package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//create and read file
		FileInputStream fis=new FileInputStream("data/input.xlsx");
		
		//create Workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//get sheet
		Sheet sh = wb.getSheet("valid.logiin");
		
		//get row
		Row row = sh.getRow(1);
		
		//get cell
		short cell = row.getLastCellNum();
		System.out.println(cell);
		
//		//get data
//		String data = cell.getStringCellValue();
//		System.out.println(data);
	}

}
