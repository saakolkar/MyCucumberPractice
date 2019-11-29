package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;

	public WebDriver initializeDriver(String browser) {

		if (browser == "chrome") {

			System.setProperty("webdriver.chrome.driver",
					"D:\\Users\\sakolkar\\Desktop\\Drivers\\78\\chromedriver_win32 (3)\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test");

		}

		return driver;

	}

}
