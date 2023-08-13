package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelFile {
public static void main(String[] args) throws IOException {
//Converting excel file into stream of bytes and storing it in fis
FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
//In order to read data from excel file we need to create an object of Workbook interf type
//To create an object we make use of create method present in WorkbookFactory class 
//It is a static method which will create and load all the data to workbook object
Workbook wb = WorkbookFactory.create(fis);
//From workbook type object first we get the sheet then we get the row and then get the cell
//Then call setCellValue() to set the data into the sp[ecific cell
wb.getSheet("CreateCustomer").getRow(1).getCell(3).setCellValue("Pass");
//In order to write data into excel file we must create an object of FileOutputStream since 
//String cannot be passed directly we must convert it into stream of bytes
FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
//Once after converting we need to write that stream of bytes to excel file using 
//write() present in Workbook interface
wb.write(fos);
}
}
