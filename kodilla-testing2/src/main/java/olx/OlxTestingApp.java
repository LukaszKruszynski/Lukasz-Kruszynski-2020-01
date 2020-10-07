package olx;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlxTestingApp {
    private static final String SEARCH_FIELD = "headerSearch";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.olx.pl/");

        WebElement searchField = driver.findElement(By.id(SEARCH_FIELD));
        searchField.sendKeys("Telefon");
        searchField.submit();
    }
}

