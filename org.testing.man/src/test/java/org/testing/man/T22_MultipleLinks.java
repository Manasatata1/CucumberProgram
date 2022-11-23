
package org.testing.man;

import java.net.HttpURLConnection;
import java.net.URL;
//import java.net.HttpURLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T22_MultipleLinks {

	public static void main(String[] args) {
		
	
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com");
		
		List<WebElement> l = d.findElements(By.tagName("a"));
		int size = l.size();
		System.out.println(size);
		
		for(int i=0; i<size;i++) {
			
			WebElement e = l.get(i);	
			String url = e.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection ttpcon = (HttpURLConnection).link.openConnection();
			ttpcon.connect();
			int rescode = ttpcon.getResponseCode();
			
			if(rescode> 400) {
				System.out.println(url + "--- is broken link");
			}
			else {
				System.out.println(url + "--- is valid link");
			}
			
			}

	}

}
