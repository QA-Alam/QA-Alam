package com.utility;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ny.basepage.SupperClass;

public class WaitHelper extends SupperClass{

	
	public static void waitForElement(WebElement element, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
			
		
	}
}

