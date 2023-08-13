package methods_of_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfQuit {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-facebook-button")).click();
	//It will close all the windows/tabs trigerred by driver reference 
	//and kills the app usage in the background also
	driver.quit();
}
}
