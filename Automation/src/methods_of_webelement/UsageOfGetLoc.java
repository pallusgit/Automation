package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLoc {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement unTbx = driver.findElement(By.id("email"));
	//This is used to get the location of a web element in a webpage
	//The returntype of get location() is Point class 
	//Using point class reference we need to fetch both x axis
	//and y axis of an element
		Point point = unTbx.getLocation();
	int x = point.getX();
	int y = point.getY();
	System.out.println(x +" Value      Y: "+ y);
	}
}
