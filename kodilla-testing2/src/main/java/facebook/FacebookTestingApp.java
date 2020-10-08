package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String XPATH_CREATE_NEW_ACCOUNT_ID_BUTTON = "//*[@id=\"u_0_2\"]";
    private static final String XPATH_ACCEPT_COOKIES_BUTTON = "//*[@id=\"u_0_k\"]";
    private static final String XPATH_NAME = "//*[@id=\"u_2_b\"]";
    private static final String XPATH_LASTNAME = "//*[@id=\"u_2_d\"]";
    private static final String XPATH_PHONE_NUMBER_OR_MAIL = "//*[@id=\"u_2_g\"]";
    private static final String XPATH_SECOND_MAIL = "//*[@id=\"u_2_j\"]";
    private static final String XPATH_PASSWORD = "//*[@id=\"password_step_input\"]";
    private static final String XPATH_DAY_SELECT = "//*[@id=\"day\"]";
    private static final String XPATH_MONTH_SELECT = "//*[@id=\"month\"]";
    private static final String XPATH_YEAR_SELECT = "//*[@id=\"year\"]";
    private static final String XPATH_SEX_MAN_RADIO = "//span[contains(@class, \"_5k_3\")]/span[2]/input[1]";
    private static final String XPATH_REGISTER = "//*[@id=\"u_2_s\"]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("http://facebook.com");

        Thread.sleep(500);
        WebElement acceptCookiesButton = driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES_BUTTON));
        acceptCookiesButton.click();

        Thread.sleep(500);
        WebElement createButton = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT_ID_BUTTON));
        createButton.click();

        Thread.sleep(500);
        WebElement nameField = driver.findElement(By.xpath(XPATH_NAME));
        nameField.sendKeys("Lukasz");

        WebElement lastNameField = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastNameField.sendKeys("Kruszynski");

        WebElement mailOrNumberField = driver.findElement(By.xpath(XPATH_PHONE_NUMBER_OR_MAIL));
        mailOrNumberField.sendKeys("LukaszKruszynskiKodilla@gmail.com");

        Thread.sleep(500);
        WebElement secondMailField = driver.findElement(By.xpath(XPATH_SECOND_MAIL));
        secondMailField.sendKeys("LukaszKruszynskiKodilla@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath(XPATH_PASSWORD));
        passwordField.sendKeys("Kodilla_password123#");


        WebElement dayField = driver.findElement(By.xpath(XPATH_DAY_SELECT));
        Select daySelect = new Select(dayField);
        daySelect.selectByValue("30");

        WebElement monthField = driver.findElement(By.xpath(XPATH_MONTH_SELECT));
        Select monthSelect = new Select(monthField);
        monthSelect.selectByValue("9");

        WebElement yearField = driver.findElement(By.xpath(XPATH_YEAR_SELECT));
        Select yearSelect = new Select(yearField);
        yearSelect.selectByValue("1996");

        WebElement sexManField = driver.findElement(By.xpath(XPATH_SEX_MAN_RADIO));
        sexManField.click();

        Thread.sleep(500);
        WebElement registerButton = driver.findElement(By.xpath(XPATH_REGISTER));
        registerButton.click();
    }
}
