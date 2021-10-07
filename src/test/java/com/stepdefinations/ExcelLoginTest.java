package com.stepdefinations;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.ny.basepage.SupperClass;
import com.utility.ExcelUtiliti;

public class ExcelLoginTest extends SupperClass{

	@Test
	public void loginZoplaWithExcelData() throws Throwable {
		initializations();

		ArrayList<String> userName = ExcelUtiliti.readExcelData(0);
		ArrayList<String> password = ExcelUtiliti.readExcelData(1);
		
		for (int i = 0; i < userName.size(); i++) {
			
			driver.findElement(By.xpath("//*[@id='input-email-address']")).sendKeys(userName.get(i));
			driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(password.get(i));
			driver.findElement(By.xpath("//*[@data-testid='signin-button']")).click();
			Thread.sleep(5000);
			//driver.close();
			driver.quit();

		}
	}
}
