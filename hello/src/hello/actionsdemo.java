package hello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com/");
		//action class is used to handle mouse interaction without selecting it..
		Actions a = new Actions(driver);
		WebElement move =driver.findElement(By.cssSelector("._3704LK"));
		//a.moveToElement(driver.findElement(By.cssSelector("._1_3w1N"))).build().perform();
		//a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello");
		//a.moveToElement(driver.findElement(By.cssSelector("._1_3w1N"))).contextClick().build().perform();
		
		
	}

}
