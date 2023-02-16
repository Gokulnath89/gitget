package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoking the browser
		//Chrome - ChromeDriver -> Methods close get
		//Firefox - FirefoxDriver -> Methods close get
		//WebDriver methods + Class methods
		//chromedriver is the class
		//create object(by default - driver is the object) of the class to access methods.
		//webdriver is an interface
		//chromedriver.exe -->chromebrowser
		//webdriver.chrome.driver-->value of path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//special class in selenium 
		//dropdown with select tag
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
