package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/exceldata1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Sheet2").createRow(1).createCell(1).setCellValue("automation");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/exceldata1.xlsx");
		wb.write(fos);
		wb.close();
		
	}

}
