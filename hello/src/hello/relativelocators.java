package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
//import this package while using relative locators

public class relativelocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox = driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		WebElement dateofbirth = driver.findElement(By.cssSelector("[for = 'dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateofbirth)).click();
		WebElement Icecreamvariable  = driver.findElement(By.xpath("//div[@class='form-check'] //label"));
		driver.findElement(with(By.tagName("input")).toLeftOf(Icecreamvariable)).click();
		WebElement radio = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("input")).toRightOf(radio)).getText());
		

	}

}
