package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	//In order to fetch the last row which is having data
	int count = workbook.getSheet("InvalidLogin").getLastRowNum();
	for(int i=1;i<=count;i++) {
String username = workbook.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
String password = workbook.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
	System.out.println(username+" --> "+password);
	}

}
}
