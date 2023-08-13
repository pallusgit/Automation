package handling_dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultiSelectDropdown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
		WebElement radisson = driver.findElement(By.id("r"));
		Select s = new Select(radisson);
		s.selectByIndex(0);
		s.selectByValue("k");
		s.selectByVisibleText("idly");
		s.deselectByIndex(0);
		s.deselectByValue("i");
		s.deselectByVisibleText("khaalipulav");
		s.deselectAll();
	}
}
