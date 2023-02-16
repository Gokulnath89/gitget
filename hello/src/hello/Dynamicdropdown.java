package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//also we can select from span..
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();//xpath for chennai
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();
		//use index concept
		

	}

}
