package hello;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes are " + iframeElements.size());
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		/*driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("iframe")).size());*/
		//driver.findElement(By.id("draggable")).click();
		//drag and drop can be achieved through actions class..
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
	// to perform other action outside frame,we need to switch again
		driver.switchTo().defaultContent();
		

	}

}
