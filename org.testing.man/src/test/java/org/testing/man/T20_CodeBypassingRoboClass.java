package org.testing.man;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.glass.ui.Robot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T20_CodeBypassingRoboClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		
		StringSelection s = new StringSelection("admin"); //Username
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		
		Robot r = new Robot(); 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_TAB);
		StringSelection t = new StringSelection("admin"); //Password
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(t, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_TAB)	;
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		

	}

}
