package org.testing.man;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateBackwardAndForward {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.co.uk");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.get("https://www.gmail.com");
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(3000);
		d.navigate().forward();
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
		d.close();
		
	}

}
