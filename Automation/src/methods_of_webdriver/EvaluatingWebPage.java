package methods_of_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class EvaluatingWebPage {static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.fb.com/");
	String expectedTitle = "Facebook – log in or sign up";
	String expectedurl="https://www.facebook.com/";
	String actualTitle=driver.getTitle();
	//To fetch the current URL of a webpage
	String actualUrl=driver.getCurrentUrl();
	//We can evaluate a webpage with the help of Url and title since both are unique
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("pass: both expected and actual title are same");
	}else
		System.out.println("fail: both expected and actual are not same");
	if(expectedurl.equals(actualUrl))
		System.out.println("pass: both expected and actual URL are same");
	else
		System.out.println("fail: both expected and actual URL are not same");
	driver.quit();
}
}
