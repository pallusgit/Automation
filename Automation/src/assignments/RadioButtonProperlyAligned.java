package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonProperlyAligned {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//label[text()='Female']/../input"));
		WebElement maleRadioBtn = driver.findElement(By.xpath("//label[text()='Male']/../input"));
		WebElement customRadioBtn = driver.findElement(By.xpath("//label[text()='Custom']/../input"));
		int yAxisOfFemaleBtn = femaleRadioBtn.getLocation().getY();
		int yAxisOfMaleBtn = maleRadioBtn.getLocation().getY();
		int yAxisOfCustomBtn = customRadioBtn.getLocation().getY();
		System.out.println(yAxisOfCustomBtn);
		System.out.println(yAxisOfFemaleBtn);
		System.out.println(yAxisOfMaleBtn);
		if(yAxisOfFemaleBtn==yAxisOfMaleBtn&& yAxisOfMaleBtn==yAxisOfCustomBtn) {
			System.out.println("All the radio buttons are aligned properly");
		}
		else {
			System.out.println("All the radio buttons are not aligned properly");
		}
		
	}

}








