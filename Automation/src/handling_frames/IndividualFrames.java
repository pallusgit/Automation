package handling_frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndividualFrames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("ChromeDriver")).click();
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@name='classFrame']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.id("search")).sendKeys("Chromedriver");
	}
}
