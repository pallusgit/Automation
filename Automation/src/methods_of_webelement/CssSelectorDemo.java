package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.cssSelector("a[id='d1']")).click();
//		driver.navigate().back();
//		driver.findElement(By.cssSelector("a[name='n2']")).click();
//		driver.navigate().back();
//		driver.findElement(By.cssSelector("a[class='c1']")).click();
//		driver.navigate().back();
//		driver.findElement(By.cssSelector("a[href='https://www.jiocinema.com/']")).click();
		driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']")).sendKeys("abc");
	}

}
