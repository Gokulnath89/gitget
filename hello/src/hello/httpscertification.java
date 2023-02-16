package hello;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class httpscertification {

	public static void main(String[] args) {
		ChromeOptions options  = new ChromeOptions();
		options.setAcceptInsecureCerts(true); 
		//Proxy proxies = new Proxy();
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		//proxy class in java.
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		

	}

}
