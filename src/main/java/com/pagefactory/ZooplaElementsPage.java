package com.pagefactory;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ny.basepage.SupperClass;
import com.utility.WaitHelper;

public class ZooplaElementsPage extends SupperClass {
	// What is deference between this & supper keyword
	// this key word is refer the current class values
	// Supper key word refer the parents class values

	public ZooplaElementsPage() {
		PageFactory.initElements(driver, this);
	}

	// By click = By.xpath("");

	@FindBy(xpath = "(//*[text()='Sign in'])[2]")
	@CacheLookup
	private WebElement clickSingButton;

	@FindBy(id = "input-email-address")
	@CacheLookup
	private WebElement enterUserName;

	@FindBy(id = "input-password")
	@CacheLookup
	private WebElement enterPassword;

	@FindBy(xpath = "(//*[text()='Sign in'])[5]")
	@CacheLookup
	private WebElement clickLogginButton;

	public WebElement getClickSingButton() {
		return clickSingButton;
	}

	public WebElement getEnterUserName() {
		return enterUserName;
	}

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getClickLogginButton() {
		return clickLogginButton;
	}

	public void getLogin() {
		getClickSingButton().click();
		enterUserName.sendKeys(prop.getProperty("userName"));
		enterPassword.sendKeys(prop.getProperty("textPassword"));
		clickLogginButton.click();
	}

	// ********************************************************************
	
	@FindBy(xpath = "(//*[text()='For sale'])[1]")
	@CacheLookup
	private WebElement clickOnForSale;

	public WebElement getClickOnForSale() {
		return clickOnForSale;
	}

	@FindBy(name = "q")
	@CacheLookup
	private WebElement enterLocation;

	public WebElement getEnterLocation() {
		return enterLocation;
	}

	@FindBy(xpath = "//*[@class='css-1o565rw-Text eczcs4p0']")
	@CacheLookup
	private WebElement propertyPrice;

	public WebElement getPropertyPrice() {
		return propertyPrice;
	}

	@FindBy(xpath = "//*[@data-testid='price']")
	@CacheLookup
	private WebElement clickingProperty;

	public WebElement getclickingProperty() {
		return clickingProperty;
	}

	// How you handle the group of object
	// By Collection framework

	// How you store the group of data
	// By Collection framework

	// How delete the specific data from list of data
	// By Collection framework

	// How you manipulate the data
	// By Collection framework

	// How you print, find out specific data from group of object
	// By looping concept

	// There is many looping like below
	// for loop, while loop, advance loop & do while loop

	// Excel, Web Page, Cucumber, data base

	// 0, 2, 3, 4, 5, 5
	// 6, 7, 8, 8, 7, 2
	// 9, 4, 5, 2, 5, 5
	// Looping concept

	public List<WebElement> getPropertiesPrice() {
		List<WebElement> price = driver.findElements(By.xpath("//*[@class='css-1o565rw-Text eczcs4p0']"));
		WaitHelper.waitVisibilityOfAllElements(price);
		System.out.println("Total number of properties  : " + price.size());
		for (WebElement value : price) {
			// How many way you can get text from web site
			// 1st way get text method
			// 2nd way get attribute method
			String priceValue = value.getText();
			System.out.println("Price of properties  : " + priceValue);
		}
		return price;
	}

	public void getPropertiesPrice2() {
		List<WebElement> price = driver.findElements(By.xpath("//*[@class='css-1o565rw-Text eczcs4p0']"));
		WaitHelper.waitVisibilityOfAllElements(price);
		System.out.println("Total number of properties  : " + price.size());
		for (WebElement value : price) {
			String priceValue = value.getText();
			System.out.println("Price of properties  : " + priceValue);
		}
	}

	// How you find out specific element from web site
	// how you can handle multiple element from DOM page
	public List<WebElement> selectProperties() {
		List<WebElement> element = driver.findElements(By.xpath("//*[@size='6']"));
		WaitHelper.waitVisibilityOfAllElements(element);
		for (int i = 0; i < element.size(); i++) {
			if (i > 4) {
				String value = element.get(i).getText();
				System.out.println("Selected property number is :: " + i);
				System.out.println("Selected property price is :: " + value);
				element.get(i).click();
				break;
			}
		}
		return element;
	}

	public void selectProperties2() {
		List<WebElement> element = driver.findElements(By.xpath("//*[@size='6']"));
		WaitHelper.waitVisibilityOfAllElements(element);
		for (int i = 0; i < element.size(); i++) {
			if (i > 4) {
				String value = element.get(i).getText();
				System.out.println("Selected property number is :: " + i);
				System.out.println("Selected property price is :: " + value);
				element.get(i).click();
				break;
			}
		}

	}
}

//*[@data-testid='price']
