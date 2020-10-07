package crudapp;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {
    private static final String XPATH_TASK_NAME = "//html/body/main/section/form/fieldset/input";
    private static final String XPATH_TASK_CONTENT = "//html/body/main/section/form/fieldset/textarea";
    private static final String XPATH_WAIT_FOR = "//select[1]";
    private static final String XPATH_SELECT = "//div[contains[@class, \"tasks-container\")]/form/div/fieldset/select[1]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("http://lukaszkruszynski.github.io");

        WebElement fieldTaskName = driver.findElement(By.xpath(XPATH_TASK_NAME));
        fieldTaskName.sendKeys("New Robotic Task");

        WebElement fieldTaskContent = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        fieldTaskContent.sendKeys("The Robotic Content");

        while(!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);
    }
}
