package com.day_05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task02 {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(co);
	    driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
	    System.out.println(driver.getTitle());
//	    String title = driver.getTitle();
//	    if(title=="Shop")
//		System.out.println("true");
//	    else
//	    	System.out.println("false");
//	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    if(url.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
	    	System.out.println("url correct");
	    else
	    	System.out.println("url incorrect");
	}

}
