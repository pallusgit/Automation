package handling_frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		driver.get("file:///C:/Users/QSP/Desktop/Disabled.html");
		driver.findElement(By.id("t1")).sendKeys("Suresh");
		//To enter the value into disabled textbox
		jse.executeScript("document.getElementById('t2').value='Mahesh'");
		//To clear the value present in disabled textbox
		jse.executeScript("document.getElementById('t2').value=''");
		//To click on disabled element
		jse.executeScript("document.getElementById('t2').click()");
	}
}
