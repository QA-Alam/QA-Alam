package selenium.chalenges;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class FileUpload_Robo {

	@Test
	public void UploadSendkeys() throws InterruptedException {
		String baseUrl = "http://demo.guru99.com/test/upload/";
		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // for page load
		driver.get(baseUrl);

		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("/Users/mohammedalam/WebserviceAPI+Test+cases.xlsx");
		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();
		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		String baseUrl = "http://demo.guru99.com/test/upload/";
		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // for page load
		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0")); // using linkText, to click on browse
																				// element
		uploadElement.click(); // Click on browse option on the web-page
		Thread.sleep(2000); // suspending execution for specified time period
		fileUpload("/Users/mohammedalam/WebserviceAPI+Test+cases.xlsx");

	}

	@SuppressWarnings("restriction")
	public static void fileUpload(String path) throws AWTException {
		StringSelection strSelection = new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strSelection, null);

		Robot robot = new Robot();

		robot.delay(300);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
