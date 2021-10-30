package selenium.chalenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxOperations {

	//@Test
	public static void Element_isSelected() throws InterruptedException {
		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// To find web element using Xpath and performing click event on check box
		WebElement option3 = driver.findElement(By.xpath("//input[@value='option3']"));
		boolean isSelected = option3.isSelected();

		if (!isSelected) {
			option3.click();

			System.out.println(option3.getText());

			Thread.sleep(5000);
		}
	}

	public static void Element_isEnabled() {

		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// To find web element using Xpath and performing click event on check box
		WebElement option3 = driver.findElement(By.xpath("//input[@value='option3']"));
		boolean isSelected = option3.isEnabled();

		if (!isSelected) {
			option3.click();
		}
	}

	// @Test
	public static void SelectAllElement() {

		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// To find web element using Xpath and performing click event on check box
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		// Close chrome driver
		// driver.close();
	}

	public static void SelectIsDisplayed() throws InterruptedException {

		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// To find web element using Xpath and performing click event on check box
		WebElement option3 = driver.findElement(By.xpath("//input[@value='option3']"));
		boolean isSelected = option3.isDisplayed();

		if (!isSelected) {
			option3.click();

			Thread.sleep(3000);
		}
	}
}
