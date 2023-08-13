package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import assignments.LoginPage;

public class ExecutionCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public static void validLogin() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		LoginPage l = new LoginPage(driver);
		l.setLogin("admin1","manager1");//Entering wrong un and pwd for first time
		Thread.sleep(5000);	
		l.setLogin("admin", "manager");//Entering correct un and pwd for second time
		
}
}
