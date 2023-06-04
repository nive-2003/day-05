package com.day_05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task03 {


	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(co);
	    driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
	   
	    List <WebElement> product = driver.findElements(By.xpath("//h2[@itemprop=\"name\"]"));
	    for(int i=0;i<product.size();i++) {	    	System.out.println(product.get(i).getText());
	    }
	}
}
