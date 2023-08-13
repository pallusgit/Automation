package methods_of_webdriver;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	 WebDriver driver=new ChromeDriver();
	 //Pre condition before executing the script
	 driver.manage().window().maximize();
	 driver.get("https://www.dassault-aviation.com/en/");	 
//	Point p= driver.manage().window().getPosition();
//	int xAxis = p.getX();
//	int yAxis = p.getY();
//	System.out.println("x axis value= "+xAxis);
//	System.out.println("y axis value= "+yAxis);
	Dimension d = driver.manage().window().getSize();
	int h = d.getHeight();
	int w = d.getWidth();
	System.out.println("height of the browser window= "+h);
	System.out.println("width of the browser window= "+w);
}
}
