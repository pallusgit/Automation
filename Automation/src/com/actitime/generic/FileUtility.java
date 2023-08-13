package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic class which consists of generic methods for reading 
 * data from property file and excel file and also a generic method to write data into excel
 * @author Suresh
 */
public class FileUtility {
	/**
	 * It is a generic method to read data from property file
	 * @param key
	 * @return value
	 * @throws IOException
	 */
public String readDataFromProperty(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./data/commondata.properties");
    Properties pobj = new Properties();
    pobj.load(fis);
    String url = pobj.getProperty(key);
    return url;
}
/**
 * It is a generic method to read data from excel file
 * @param sheetName
 * @param row
 * @param cell
 * @return cellData
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String readDataFromExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String text = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return text;
}
/**
 * It is a generic method to set data into excel file
 * @param sheetName
 * @param row
 * @param cell
 * @param value
 * @throws IOException
 */
public void setExcelData(String sheetName,int row, int cell, String value) throws IOException {
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
}
}
