package org.testing.man;

import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T01_OpenAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome home");
		WebDriverManager.edgedriver().setup();
		EdgeDriver d = new EdgeDriver();
		d.get("https://www.amazon.co.uk");
		System.out.println("Amazon launched");
				
	}

}
	