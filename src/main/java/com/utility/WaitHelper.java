package com.utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ny.basepage.SupperClass;

public class WaitHelper extends SupperClass {

	public static void waitForElement(WebElement element, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitVisibilityOfAllElements(List<WebElement> element) {
		WebDriverWait waitForFormLabel = new WebDriverWait(driver, 30);
		waitForFormLabel.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	
	
	public static void waitPresenceOfAllElementsLocatedBy(By element) {
		WebDriverWait waitForFormLabel = new WebDriverWait(driver, 30);
		waitForFormLabel.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));

	}
	
	@SuppressWarnings("deprecation")
	public void getWait(WebElement ele) {
		//Declare and initialise a fluent wait
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		//Specify the timout of the wait
		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
		//Sepcify polling time
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		//Specify what exceptions to ignore
		wait.ignoring(StaleElementReferenceException.class);

		//This is how we specify the condition to wait on.
		//This is what we will explore more in this chapter
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}
}


// Admin user -> Edit, delete, update added All the options 
// Manager user -> edit, update added etc
// Corporate user -> edit & update 
// Clerk user -> Only can view the application 





