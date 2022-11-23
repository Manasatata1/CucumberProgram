package org.testing.man;

import org.testng.annotations.Test;

public class TN1_Welcome {
	
	@Test(description="open browser", timeOut=3000)
	public void method()
	{
		System.out.println("Welcome to testng project");
		
	}

}

