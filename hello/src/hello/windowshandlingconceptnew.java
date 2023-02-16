package hello;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandlingconceptnew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
//new tab or new window is treated as new window in selenium..2 windows parent and child
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();//used to iterate in multiple tabs
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		//which window we have to switch we have to provide that id in argument
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String Mailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(Mailid);
	}

}
