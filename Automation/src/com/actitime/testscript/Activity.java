package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser",true);
	}@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
	}@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}@Test(priority=1, invocationCount = 2)
	public void createCustomer() throws InterruptedException{
		Reporter.log("createCustomer",true);
	}@Test
	public void deleteCustomer() throws InterruptedException{
		Reporter.log("deleteCustomer",true);
	}@Test
	public void modifyCustomer() throws InterruptedException{
		Reporter.log("modifyCustomer",true);
	}

}
