package hello;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000l);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));
		//enhanced forloop
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			if(options.get(i).getText().equalsIgnoreCase("India")) {
				options.get(i).click();
				break;//use break keyword so that for loop ends abruptly
			}
		}
	}

}
/*whenever u see autosuggestive dropdowns without any options,our first goal is to provide input
and the figure out the generic locator which extracts all the items and store it in list and then iterate over the list
over the list and then use gettext to see if it matches with ur real value and blindly click on that 
and break value.*/

