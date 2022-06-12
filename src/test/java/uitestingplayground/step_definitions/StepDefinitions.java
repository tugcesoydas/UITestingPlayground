package uitestingplayground.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitestingplayground.pages.Base;
import uitestingplayground.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    Base base = new Base();

    @Given("Click Class Attribute case")
    public void clickClassAttributeCase() {
        base.clickClassAttribute();
    }

    @When("Click Blue Button")
    public void clickBlueButton() {
        base.clickPrimaryButton();
    }

    @Then("Press OK in alert pop up")
    public void pressOKInAlertPopUp() {
        base.clickPressOK();
    }

    @Given("Click Hidden Layers case")
    public void clickHiddenLayersCase() {
        base.clickHiddenLayers();
    }

    @When("Click Green Button")
    public void clickGreenButton() {
        base.clickSuccessButton();
    }

    @Then("Make sure that green button can not be hit twice")
    public void makeSureThatGreenButtonCanNotBeHitTwice() {
        base.clickTwice();
    }

    @Given("Click Load Delay case")
    public void clickLoadDelayCase() {
        base.clickLoadDelay();
    }

    @When("Click Button")
    public void clickButton() {
       base.clickButton();
    }

    @Given("Click Text Input case")
    public void clickTextInputCase() {
        base.clickTextInput();
    }

    @When("Text into the input field")
    public void textIntoTheInputField() {
        base.textIntoTheInput();
    }

    @Then("Verify that button name is changed according to input")
    public void verifyThatButtonNameIsChangedAccordingToInput() {
        base.verifyRenamedButton();
    }

    @Given("Click Mouse Over case")
    public void clickMouseOverCase() {
        base.clickMouseOver();
    }

    @When("Click the link {int} consecutive times")
    public void clickTheLinkConsecutiveTimes(int arg0) {
        base.clickTwiceLink();

    }

    @Then("Verify that click count is increasing by {int}")
    public void verifyThatClickCountIsIncreasingBy(int arg0) {
        base.verifyExpectedCount();
    }

    @Given("Click Scrollbars case")
    public void clickScrollbarsCase() {
        base.clickScrollbars();
    }

    @Given("Click Sample App case")
    public void clickSampleAppCase() {
        base.clickSampleApp();
    }

    @Given("Click Progress Bar case")
    public void clickProgressBarCase() {
        base.clickProgressBar();
    }

    @When("Find a button in the scroll view")
    public void findAButtonInTheScrollView() {
        base.scroll();
    }

    @Then("Verify that button is visible")
    public void verifyThatButtonIsVisible() {
        base.visibleButton();
    }

    @Then("^Verify successfully login username:([^\"]*) password:([^\"]*)$")
    public void verifySuccessfullyLoginUsernameUsernamePasswordPassword(String user, String pwd) {
        base.login(user, pwd);
    }

    @When("Wait for {int} seconds")
    public void waitForSeconds(int sec) {
        base.sleep(sec);
    }

    @When("Click Start Button")
    public void clickStartButton() {
        base.startButton();
    }

    @Then("Click Stop Button")
    public void clickStopButton() {
        base.stopButton();
    }

    @And("Get result")
    public void getResult() {
        base.getResult();
    }
}
