package hello;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class livedemojavastream {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//first click on column
		//capture all webelements into list
		//capture text of all webelements into new(orginal)list
		//apply sort on the orginal list
		//compare orginallist vs sortedlist
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.findElement(By.xpath("//tr //th[1]")).click();
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr //td[1]"));
		List<String> orginallist = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedList = orginallist.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(orginallist.equals(sortedList));

	}

}
