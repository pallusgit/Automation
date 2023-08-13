package com.actitime.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ExecutionClass {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileUtility fileUtils = new FileUtility();
	String url = fileUtils.readDataFromProperty("url");
	String un = fileUtils.readDataFromProperty("username");
	String pwd = fileUtils.readDataFromProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	String text = fileUtils.readDataFromExcel("CreateCustomer",1,2);
	System.out.println(text);	
	fileUtils.setExcelData("CreateCustomer", 1, 4, "BigBangCompany");
}
}
