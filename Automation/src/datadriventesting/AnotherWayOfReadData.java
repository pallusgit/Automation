package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AnotherWayOfReadData {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb =WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("CreateCustomer");
	Row r = s.getRow(1);
	Cell c = r.getCell(3);
	String text = c.getStringCellValue();
	System.out.println(text);
	wb.close();
}
}
