package org.sample;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	
	public static void main(String[] args) {
		
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		pagrUrl();
		pageTitle();
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		fillTextBox(txtEmail, "vivek.kamaraj2@gmail.com");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		fillTextBox(txtPass, "12345");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnClick(btnLogin);
		
		closeBrowser();
		
	}
	
}
	