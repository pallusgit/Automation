package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//Converting excel file into stream of bytes and storing it in fis
FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
//In order to read data from excel file we need to create an object of Workbook interf type
//To create an object we make use of create method present in WorkbookFactory class 
//It is a static method which will create and load all the data to workbook object
Workbook wb = WorkbookFactory.create(fis);
//From workbook type object first we get the sheet then we get the row and then get the cell
//Then call getStringCellValue() to retrieve string data from the cell
String text = wb.getSheet("CreateCustomer").getRow(1).getCell(0).getStringCellValue();
System.out.println(text);
wb.close();
}
}
