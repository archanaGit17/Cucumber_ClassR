package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	
	public void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\Cucumber_RClass\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	public void text(WebElement e, String value) {
		 e.sendKeys(value);
	}

	public void button(WebElement e) {
		e.click();
	}
}
