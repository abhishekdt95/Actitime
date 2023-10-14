package TestNg;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {

	public static void main(String[] args) {
		try {
			FileInputStream FIS=new FileInputStream("./data/input.xlsx");
			Workbook WB = WorkbookFactory.create(FIS);
			Sheet SH = WB.getSheet("valid.logiin");
			Row r = SH.getRow(1);
			Cell c = r.getCell(0);
			String data = c.getStringCellValue();
			System.out.println(data);
		} catch (Exception e) {
		}
		

	}

}
