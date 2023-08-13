package com.actitime.testscript;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void createCustomer() throws InterruptedException{
		Assert.fail();
		Reporter.log("createCustomer",true);
	}
	@Test
	public void deleteCustomer() throws InterruptedException{
		Assert.fail();
		Reporter.log("deleteCustomer",true);
	}
	@Test
	public void modifyCustomer() throws InterruptedException{
		Reporter.log("modifyCustomer",true);
	}



}
