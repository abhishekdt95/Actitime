package com.Actitime.Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
	//GetData from Excel
	public String GetExcelData(String File, String sn, int rn, int cn) {
		try {
			FileInputStream fis=new FileInputStream(File);
			Workbook WB=WorkbookFactory.create(fis);
			String Data =WB.getSheet(sn).getRow(rn).getCell(cn).getStringCellValue();
			return Data;
		} catch (Exception e) {
		return "";
		}
	}
	 
	//get Row count
	public int GetRowCount(String File, String Name) {
		try {
			FileInputStream fis=new FileInputStream(File);
			Workbook WB=WorkbookFactory.create(fis);
			int LastRow = WB.getSheet(Name).getLastRowNum();
			return LastRow;
		} catch (Exception e) {
			return -1;
		}
	}
		
	//get cell Count
	public int GetCellCount(String File, String Name, int rn) {
		try {
			FileInputStream fis=new FileInputStream(File);
			Workbook WB=WorkbookFactory.create(fis);
			int CellCount = WB.getSheet(Name).getRow(rn).getLastCellNum();
			return CellCount;
		} catch (Exception e) {
			return -1 ;
		}
	}
		
}
