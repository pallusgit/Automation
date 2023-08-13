package handling_frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/QSP/Desktop/T1.html");
	driver.findElement(By.id("t1")).sendKeys("A");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("B");
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("C");
	WebElement frame = driver.findElement(By.xpath("//iframe[@id='f1']"));
	driver.switchTo().frame(frame);
	driver.findElement(By.id("t2")).sendKeys("D");
	driver.switchTo().frame("f2");
	driver.findElement(By.id("b1")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("E");
}
}
