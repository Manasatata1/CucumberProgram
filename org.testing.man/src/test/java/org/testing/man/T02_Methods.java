package org.testing.man;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T02_Methods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver d= new ChromeDriver();
		d.get("https://cheapflights.co.uk");
		Thread.sleep(5000);
		
	//	d.getTitle();
		//d.getPageSource();
		System.out.println(d.getTitle());
		Thread.sleep(6000);
		System.out.println(d.getPageSource());
	}

}
