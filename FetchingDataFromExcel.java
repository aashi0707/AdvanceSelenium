package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//1) Create FileInputStream object
		FileInputStream fis = new FileInputStream("./src/test/resources/exceldata.xlsx");
		
		//2) create workbook object
		Workbook wb = WorkbookFactory.create(fis);

		//3) Fetching the values
		System.out.println(wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
		System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue());
		System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(3).getBooleanCellValue());
		System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue());
		
	}

}
