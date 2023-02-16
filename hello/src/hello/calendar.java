package hello;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		//grab common attribute //put into list //iterate
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		//driver.findElementByXPath(".//*[@id='travel_date']").click();
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		int count = driver.findElements(By.cssSelector(".day")).size();
		for (int i = 0;i<count;i++)
		{
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
	}

}
