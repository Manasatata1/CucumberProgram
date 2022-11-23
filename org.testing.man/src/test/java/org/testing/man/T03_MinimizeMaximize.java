package org.testing.man;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T03_MinimizeMaximize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver d = new EdgeDriver();
		d.get("https://www.amazon.co.uk");
		
		d.manage().window().minimize();
		Thread.sleep(7000);
		d.manage().window().maximize();
		Thread.sleep(10000);

		
		
	}

}
