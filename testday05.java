package com.day_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class testday05 {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(co);
	    driver.get("https://j2store.net/free/");
	    System.out.println(driver.getTitle());
	    String title = driver.getTitle();
	    if(title=="Shop")
		System.out.println("true");
	    else
	    	System.out.println("false");
	    
	    
	}

}
