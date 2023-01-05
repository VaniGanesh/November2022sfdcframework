package tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver getBrowserType(String browserName, boolean headless) {
		String browser = browserName.toLowerCase();
		WebDriver driver = null;

		switch (browser) {
		
			case "chrome":
				WebDriverManager.chromedriver().setup();
				if (headless) {
					ChromeOptions co = new ChromeOptions();
					co.addArguments("--headless");
					driver = new ChromeDriver(co);
				} else {
					driver = new ChromeDriver();
				}
				break;
	
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				if (headless) {
					FirefoxOptions fo = new FirefoxOptions();
					fo.addArguments("--headless");
					driver = new FirefoxDriver(fo);
				} else {
					driver = new FirefoxDriver();
				}
				break;
	
			default:
				System.out.println("Provie correct input, supported browsers are chrome and firefox");
	
		}// end of switch

		return driver;

	} // end of method

} // end of class
