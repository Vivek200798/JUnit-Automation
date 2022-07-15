package org.sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static WebDriver driver;

	@Test

	public void Testcase3() {

		String title = driver.getTitle();
		System.out.println(title);

	}

	@Test

	public void Testcase1() {

		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

	@Test

	public void Testcase2() {

		driver.findElement(By.id("email")).sendKeys("vivek27");
		driver.findElement(By.id("pass")).sendKeys("myfacebookacc");
		driver.findElement(By.name("login")).click();

	}

	@Before

	public void before() {

		Date d = new Date();
		System.out.println(d);

	}

	@After

	public void after() {

		Date d = new Date();
		System.out.println(d);
	}

	@BeforeClass

	public static void beforeclass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@AfterClass

	public static void afterclass() {

		driver.close();

	}

}
