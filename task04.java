package com.day_05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task04 {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(co);
	    driver.get("https://demo.smart-hospital.in/site/login");
	    driver.manage().window().maximize();
	}

}
