package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T16TryCatchMouseOP {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		Thread.sleep(3000);
		try {
			WebElement e = d.findElement(By.xpath("//button[text()='Accept and Close']"));
			String text = e.getText(); ///
			System.out.println(text);
			Actions a = new Actions(d);
			a.moveToElement(e).click().build().perform();
			System.out.println("clicked on Accept and close");
			}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Exception Handled");
			
			
		}
		
	}


