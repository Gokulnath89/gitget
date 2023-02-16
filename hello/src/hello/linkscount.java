package hello;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));//create mini driver from main driver
		System.out.println(footer.findElements(By.tagName("a")).size());
//when u try to create it should always be singular..so use findelement..
		WebElement columnone = footer.findElement(By.xpath("//table //tbody //tr //td[1] //ul"));
		System.out.println(columnone.findElements(By.tagName("a")).size());
		for(int i = 1; i < columnone.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnone.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(3000);
		}
			//dont use click,instead use sendkeys and pass the variable into sendkeys argument..
			//keyboard event can be passed through sendkeys method
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
			while(it.hasNext())//hasnext tells if it is present then go move it to it...
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		
		
		
		

	}

}
