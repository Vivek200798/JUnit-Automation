package org.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions a;
	
	public static void chromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

	}
	
	public static void closeBrowser() {
		
		driver.close();

	}
	
	public static void maxWindow() {
		
		driver.manage().window().maximize();

	}
	
	public static void pageTitle() {
		
		String titleName = driver.getTitle();
		System.out.println("Title Name :"+ titleName);

	}
	
	public static void pagrUrl() {
		
		String url = driver.getCurrentUrl();
		System.out.println("Current page url :"+ url);

	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);

	}
	
	public static void btnClick(WebElement element) {
		
		element.click();
		
	}
	
	public static void fillTextBox(WebElement ele, String value ) {

		ele.sendKeys(value);
	}
	
	public static void clickDouble(WebElement element) {
		
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();

		
	}
	
	public static void dragDrop(WebElement start, WebElement end) {
		
		Actions a = new Actions(driver);
		a.dragAndDrop(start,end).perform();
		
		

	}
	
}  






  












