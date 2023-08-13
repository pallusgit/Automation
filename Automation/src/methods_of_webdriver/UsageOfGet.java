package methods_of_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	//Instantiating the driver specific class
	ChromeDriver driver = new ChromeDriver();
	//It is used to trigger the main URL(contains only protocol and domain name) 
	//of an application
	//It will hold the execution until website is completely loaded
	driver.get("https://www.cricbuzz.com/");
	Thread.sleep(2000);//It will hold the execution for prescribed amount of time
	//It is used to close the current browser window
	driver.close();
}
}
