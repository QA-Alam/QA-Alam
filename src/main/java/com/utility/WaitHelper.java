package com.utility;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ny.basepage.SupperClass;

public class WaitHelper extends SupperClass{

	
	public static void waitForElement(WebElement element, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
			
		
	}
	   public static void addingForm(List<WebElement> element){            
       WebDriverWait waitForFormLabel = new WebDriverWait(driver, 30);      
       //By inputArea = By.tagName("input");
       //List <WebElement> myIput = driver.findElements(inputArea);
       waitForFormLabel.until(ExpectedConditions.visibilityOfAllElements(element));
      


   }


}

