package Vtiger_GenericUtility;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {

	public String readDataFromExcelFile(String SheetName,int rownum,int cellnum) throws Throwable {
		FileInputStream fise=new FileInputStream("");
		return WorkbookFactory.create(fise).getSheet(SheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
}
