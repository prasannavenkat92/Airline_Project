package org.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalLibrary {
	public static WebDriver driver;

	public static void launchURL(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanna\\eclipse-workspace\\Prasanna_Working\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

	}

	public static void insertValue(WebElement element, String name) {
		element.sendKeys(name);

	}

	public static void button(WebElement element) {

		element.click();

	}

	public static void selectByText(WebElement element, String name) {
		new Select(element).selectByVisibleText(name);

	}

	public static void selectValueByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);

	}

	public static void quitBrowser() {
		driver.quit();

	}
	
	public static WebElement objFind(String element, String locator) {
		String loc=element;
		By b=null;
		if(loc.equals("id"))
		{
			b=By.id(locator);
		}
		else if(loc.equals("name"))
		{
			b=By.name(locator);
		}
		else if(loc.equals("xpath"))
		{
			b=By.xpath(locator);
		}
		return driver.findElement(b);

	}
}
