package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenAccount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenAccount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenAccount']")).isSelected());
		//count the no of checkboxes
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		Assert.assertTrue(true);
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.id("hrefIncAdt")).click();
		for(int i = 1;i < 5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		//driver.quit();

	}

}
