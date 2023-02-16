package hello;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addingitemstolist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//we can create xpath based upon text.xpath = //button[text()='ADD TO CART']
		//button - tagname,text = add to cart..
		//h4.product-name-cssselector
		//product-name = class;
		//convert array to arraylist only needed.bcoz arraylist consumes more memory..
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		int j = 0;
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i = 0;i < products.size();i++)
		{
		//get method is used to pull one particular value out of 30 values..
		//store all the products in one variable name..
	/*format it to get an actual vegetable name.in java there is special method to split
	 the text.by using like this brocoli is one string and 1kg is one string
			 */
			//used to trim white spaces in text
			String[] name = products.get(i).getText().split("-");
			//String name=products.get(i).getText();
			//int t=0;
			//for(int k=0;k<name.length;k++)
			/*{
				if(name.charAt(i)=='-')
				{
					t=i;
				}
			}*/
			String formattedName = name[0].trim();
	// in formateedName we are saving the value of brocolli and got trim......
			List itemsNeededList = Arrays.asList(itemsNeeded);
			//if(name.contains("Cucumber"))
			if(itemsNeededList.contains(formattedName))
					{
					j++;
					//clcik on add to cart..contains check the all products on list
					driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();//.productaction
					if(j==3)
					{
						break;
					}
					//break;
					}
			//in arraylist concept we cannot use break..
	//text should be static.dont use dynamic text
			
		}
		
	}

}
