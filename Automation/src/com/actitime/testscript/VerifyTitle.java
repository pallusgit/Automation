package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void verifyTitle() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String expectedTitle="Googly";
	String actualTitle = driver.getTitle();
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(actualTitle, expectedTitle);
	Assert.assertEquals(actualTitle, expectedTitle);
	System.out.println("Hello world");
	driver.quit();
	softAssert.assertAll();
}
}
