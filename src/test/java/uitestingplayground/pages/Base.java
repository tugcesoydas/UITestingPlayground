package uitestingplayground.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import uitestingplayground.Utilities.ConfigurationReader;
import uitestingplayground.Utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.util.Objects;

public class Base extends BasePage{

    //////////////
    @FindBy(xpath = "//a[normalize-space()='Class Attribute']")
    private WebElement classAttribute;

    @FindBy(xpath = "//a[normalize-space()='Hidden Layers']")
    private WebElement hiddenLayers;

    @FindBy(xpath = "//a[normalize-space()='Load Delay']")
    private WebElement loadDelay;

    @FindBy(xpath = "//a[normalize-space()='Text Input']")
    private WebElement textInput;

    @FindBy(xpath = "//a[normalize-space()='Scrollbars']")
    private WebElement scrollbars;

    @FindBy(xpath = "//a[normalize-space()='Sample App']")
    private WebElement sampleApp;

    @FindBy(xpath = "//a[normalize-space()='Mouse Over']")
    private WebElement mouseOver;

    @FindBy(xpath = "//a[normalize-space()='Progress Bar']")
    private WebElement progressBar;


    /////////////

    @FindBy(xpath = "//div[@aria-valuenow='75']")
    private WebElement stopLimit;

    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
    private WebElement primaryButton;

    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-success ')]")
    private WebElement successButton;

    @FindBy(xpath = "//*[@id='newButtonName']")
    private WebElement inputField;

    @FindBy(xpath = "//*[@id='hidingButton']")
    private WebElement hidingButton;

    @FindBy(xpath = "//*[@id='startButton']")
    private WebElement startButton;

    @FindBy(xpath = "//*[@id='stopButton']")
    private WebElement stopButton;

    @FindBy(name = "UserName")
    private WebElement userName;

    @FindBy(name = "Password")
    private WebElement password;


    String text = "Renamed";


    public void sleep(int seconds) {
        try {
            Thread.sleep((long) seconds * 1000);
        } catch (Exception e) {
            //
        }
    }

    public void clickClassAttribute() {
        new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(classAttribute)).click();
    }

    public void clickHiddenLayers() {
        new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(hiddenLayers)).click();
    }

    public void clickLoadDelay() {
        new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(loadDelay)).click();
    }

    public void clickTextInput() {
        new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(textInput)).click();
    }

    public void clickMouseOver() {
        new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(mouseOver)).click();
    }

    public void clickScrollbars() {
        new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(scrollbars)).click();
    }

    public void clickSampleApp() {
        new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(sampleApp)).click();
    }

    public void clickProgressBar() {
        new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(progressBar)).click();
    }
    public void clickPrimaryButton() {
        sleep(5);
        primaryButton.click();
    }

    public void clickPressOK() {
        sleep(5);
        Alert alert = new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 10).until(ExpectedConditions.alertIsPresent());
        Assertions.assertEquals("Primary button pressed", alert.getText());
        alert.accept();
    }

    public void clickSuccessButton() {
        sleep(5);
        successButton.click();
    }

    public void clickTwice() {

        try {
            successButton.click();
        } catch (Exception e) {
            Assertions.assertTrue(e.getMessage().contains("element click intercepted"));
        }
    }


    public void clickButton() {

        new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 1)
                .until(ExpectedConditions.visibilityOf(primaryButton)).click();

        Assertions.assertEquals(true, primaryButton.isDisplayed());

    }


    public void textIntoTheInput() {

        inputField.sendKeys(text);
        primaryButton.click();
        sleep(3);
    }

    public void verifyRenamedButton() {

        Assertions.assertEquals(
                text,
                uitestingplayground.Utilities.Driver.getDriver().findElement(By.id("updatingButton")).getText());
    }


    public void clickTwiceLink() {

        sleep(2);
        for(int i=0; i < 2; i++)
            uitestingplayground.Utilities.Driver.getDriver().findElement(By.linkText("Click me")).click();
        }



    public void verifyExpectedCount() {

        sleep(2);
        Assertions.assertEquals(
                "2",
                uitestingplayground.Utilities.Driver.getDriver().findElement(By.id("clickCount")).getText());
    }


    public void scroll() {
        
        JavascriptExecutor js = (JavascriptExecutor) uitestingplayground.Utilities.Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView()", hidingButton);
        sleep(5);
        hidingButton.click();
    }

    public void visibleButton() {
        
        Assertions.assertEquals(true, hidingButton.isDisplayed());

    }

    public void login(String Username, String Password) {

        userName.sendKeys(Username);
        password.sendKeys(Password);
        primaryButton.click();
        Assertions.assertEquals(
                String.format("Welcome, %s!", Username),
                uitestingplayground.Utilities.Driver.getDriver().findElement(By.id("loginstatus")).getText()
        );

    }

    public void startButton() {
        startButton.click();
    }

    public void stopButton() {

        new WebDriverWait(uitestingplayground.Utilities.Driver.getDriver(), 60)
                .until(ExpectedConditions.visibilityOf(stopLimit));
        stopButton.click();

    }

    public void getResult() {

        System.out.println(uitestingplayground.Utilities.Driver.getDriver().findElement(By.id("result")).getText());
    }
}



