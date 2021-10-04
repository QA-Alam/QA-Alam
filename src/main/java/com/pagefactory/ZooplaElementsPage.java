package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ny.basepage.SupperClass;

public class ZooplaElementsPage extends SupperClass{
	// What is deference between this & supper keyword
	// this key word is refer the current class values
	// Supper key word refer the parents class values

	public ZooplaElementsPage() {
		PageFactory.initElements(driver, this);
	}

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

}
