package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelUsingDataFormatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//1) Create FileInputStream object
		FileInputStream fis = new FileInputStream("./src/test/resources/exceldata.xlsx");
		
		//2) create workbook object
		Workbook wb = WorkbookFactory.create(fis);

		//3) Fetching the values
	//	System.out.println(wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
	//	System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue());
	//	System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(3).getBooleanCellValue());
	//	System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue());
		
		// or 
		Cell cell1 = wb.getSheet("Sheet1").getRow(0).getCell(0);
		Cell cell2 = wb.getSheet("Sheet1").getRow(2).getCell(1);
		Cell cell3 = wb.getSheet("Sheet1").getRow(3).getCell(3);
		Cell cell4 = wb.getSheet("Sheet1").getRow(1).getCell(4);
		Cell cell5 = wb.getSheet("Sheet1").getRow(6).getCell(2);
		Cell cell6 = wb.getSheet("Sheet1").getRow(7).getCell(7);

		DataFormatter data = new DataFormatter();
		System.out.println(data.formatCellValue(cell1));
		System.out.println(data.formatCellValue(cell2));
		System.out.println(data.formatCellValue(cell3));
		System.out.println(data.formatCellValue(cell4));
		System.out.println(data.formatCellValue(cell5));
		System.out.println(data.formatCellValue(cell6));


	}

}
