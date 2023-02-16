package hello;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokingmultipletabs126 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Switching window
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String>it = handles.iterator();	//iterator used to iterate over multiple tabs on a webpage
		String parentwindowid = it.next();  //it.next it will be on the first window//next it.next on next win
		String childwindowid = it.next();
		driver.switchTo().window(childwindowid);
		driver.get("https://rahulshettyacademy.com/#/index");
		String course = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentwindowid);
		WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys(course);
		//driver.findElement(By.cssSelector("btn btn-success")).click();
		//Screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		//to see ss there is class called fileutils...
		FileUtils.copyFile(file, new File("logo.png"));
		//get height and width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		
	}

}
