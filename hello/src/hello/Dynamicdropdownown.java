package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdownown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Thread.sleep(2000l);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000l);
		//driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
		//driver.findElement(By.xpath("//div[@id=''glsctl00_mainContent_ddl_destinationStation1_CTNR]  //a[@value='IXE']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JLR']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight ")).click();
		//There should no spaces between classnames.just remove the white space and provide dot..
		//for classname start with dot
		//driver.close();
		/*parent-child = first identify parent and then hover the cursor to the desired destination.
		While creating xpath from parent to child leave one space and write the xpath for child*/
		

	}

}
