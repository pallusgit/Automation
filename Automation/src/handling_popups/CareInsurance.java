package handling_popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	driver.findElement(By.id("dob")).click();
	WebElement month = driver.findElement(By.className("ui-datepicker-month"));
	Select s1 = new Select(month);
	s1.selectByVisibleText("Jul");
	WebElement year = driver.findElement(By.className("ui-datepicker-year"));
	Select s2 = new Select(year);
	s2.selectByVisibleText("1983");
	driver.findElement(By.linkText("7")).click();
}
}
