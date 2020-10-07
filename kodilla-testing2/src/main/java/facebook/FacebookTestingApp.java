package facebook;

import config.WebDriverConfig;
import jdk.nashorn.internal.ir.WhileNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String CREATE_NEW_ACCOUNT_ID_BUTTON = "u_0_2";
    private static final String ACCEPT_COOKIES_BUTTON = "u_0_h";
    private static final String NAME_ID = "u_2_b";
    private static final String LASTNAME_ID = "u_2_d";
    private static final String PHONE_NUMBER_OR_MAIL_ID = "u_2_g";
    private static final String PASSWORD_ID = "password_step_input";
    private static final String XPATH_DAY_SELECT = "//div[contains[@class, \"_58mq _5dbb\")]/div/span/span/select[0]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("http://facebook.com");

        WebElement acceptCookiesButton = driver.findElement(By.id(ACCEPT_COOKIES_BUTTON));
        acceptCookiesButton.click();

        WebElement createButton = driver.findElement(By.id(CREATE_NEW_ACCOUNT_ID_BUTTON));
        createButton.click();

        WebElement element = driver.findElement(By.xpath(XPATH_DAY_SELECT));
        Select select = new Select(element);
        select.selectByIndex(29);

    }
}
