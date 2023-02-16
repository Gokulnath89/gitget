package hello;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenurl {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//broken url
		//step 1-is to get all urls tied up to the link using selenium
		//java methods will call url and get u the status code
		//if(statuscode>400) then url is not working -->url is broken
		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		//openconnection is  a method which is already predefined URL class
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		

	}

}
