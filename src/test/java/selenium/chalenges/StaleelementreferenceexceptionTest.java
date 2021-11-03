package selenium.chalenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleelementreferenceexceptionTest {

	public static void main(String[] args) {

		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/signin/?page_after_login=%2F&return_url=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// trying to find text box element & enter user name
		WebElement userName = driver.findElement(By.xpath("//*[@id='input-email-address']"));
		userName.sendKeys("alammohammed79@gmail.com");

		// trying to find text box element & enter password
		WebElement passWord = driver.findElement(By.xpath("//*[@id='input-password']"));
		passWord.sendKeys("SAYEDawan2008@");

		// trying to page get refresh
		driver.navigate().refresh();
		try {
			// trying to find text box element & enter user name & you got
			// StaleElementReferenceException problem
			userName.sendKeys("alammohammed79@gmail.com");

		} catch (StaleElementReferenceException e) {
			// Help with try catch block we can resolved the issue
			userName = driver.findElement(By.xpath("//*[@id='input-email-address']"));
			userName.sendKeys("alammohammed79@gmail.com");

		}
	}
}