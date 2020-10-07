package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public static final String FIREFOX = "FIREFOX_DRIVER";
    public static final String CHROME = "CHROME_DRIVER";

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver", "d:\\Development\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "d:\\Development\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if (driver.equals(FIREFOX)) return new FirefoxDriver();
        else if (driver.equals(CHROME)) return new ChromeDriver();
        return null;
    }
}
