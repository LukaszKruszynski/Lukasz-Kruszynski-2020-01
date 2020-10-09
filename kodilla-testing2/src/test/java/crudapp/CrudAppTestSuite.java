package crudapp;

import config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://lukaszkruszynski.github.io";
    private static final String TRELLO_URL = "https://trello.com/login";
    private WebDriver driver;
    private Random generator;
    private static final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
    private static final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
    private static final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";

    @Before
    public void init() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUp() {
        driver.close();
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
//        String taskName = createCrudAppTestTask();
//        sendTestTaskToTrello(taskName);
//        deleteTestTaskFromCrudApp(taskName);
//        Assert.assertTrue(checkTaskExistInTrello(taskName));
    }

    private String createCrudAppTestTask() throws InterruptedException {
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);
        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(2000);
       driver.switchTo().alert().accept();
    }


    private boolean checkTaskExistInTrello(String taskName) throws InterruptedException {
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        boolean result = false;
        driverTrello.get(TRELLO_URL);

        WebElement acceptCookiesButton = driverTrello.findElement(By.xpath("/html/body/div[3]/div/button"));
        acceptCookiesButton.click();

        WebElement userField = driverTrello.findElement(By.id("user"));
        userField.sendKeys("mail@gmail.com");

        WebElement passwordField = driverTrello.findElement(By.id("password"));
        passwordField.sendKeys("passwrd");

        WebElement loginButton = driverTrello.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(4000);

        WebElement passwordSecondField = driverTrello.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordSecondField.sendKeys("passwrd");

        WebElement loginSecondButton = driverTrello.findElement(By.xpath("//*[@id=\"login-submit\"]/span/span"));
        loginSecondButton.click();
        Thread.sleep(15000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Aplication\"]")).size() > 0)
                .forEach(WebElement::click);
        Thread.sleep(4000);


        result = driverTrello.findElements(By.xpath("//span")).stream()
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));
        driverTrello.close();
        return result;
    }

    private void deleteTestTaskFromCrudApp(String taskName) {
        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(any ->
                        any.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(searched -> {
                    WebElement deleteButton = searched.findElement(By.xpath(".//button[4]"));
                    deleteButton.click();
                });
    }
}