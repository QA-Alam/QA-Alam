package selenium.chalenges;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        WebDriver d = new ChromeDriver();
        
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // for page load
		d.get("https://opensource-demo.orangehrmlive.com/"); // Testing webpage
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // for Implicit wait

		WebElement uname = d.findElement(By.id("txtUsername")); // Username.........ID
		uname.sendKeys("Admin");

		WebElement pwd = d.findElement(By.name("txtPassword")); // Password.........NAME
		pwd.sendKeys("admin123");

		WebElement loginb = d.findElement(By.xpath("//input[@id='btnLogin']"));
		loginb.click(); // Loginbutton......XPATH

		WebElement pim = d.findElement(By.id("menu_pim_viewPimModule"));
		pim.click(); // Admin tab-PIM

		WebElement config = d.findElement(By.id("menu_pim_Configuration"));
		config.click(); // Configuration tab

		WebElement data_imp = d.findElement(By.partialLinkText("Data "));
		data_imp.click(); // Data Import tab.....PARTIALLINKT

		// UPLOADING FILE USING AutoIT....

		//WebElement browser = d.findElement(By.xpath("//*[@id='pimCsvImport_csvFile']")); // Browse button
		//browser.click();
		WebElement element = d.findElement(By.id("pimCsvImport_csvFile"));
		((JavascriptExecutor) d).executeScript("arguments[0].click()", element);
		System.out.println("1");

		Runtime.getRuntime().exec("C:\\Users\\Chait\\Desktop\\autoit\\fileupload.exe");
		System.out.println("2");
		Thread.sleep(3000);

		WebElement upload = d.findElement(By.id("btnSave")); // Upload button
		upload.click();
		System.out.println("3");

		System.out.println("File Uploaded Successfully"); // Confirmation message

	}

}