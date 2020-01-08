package steps;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.StopwatchPage;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Steps for the main stopwatch page
 */
public class StopwatchPageSteps extends AbstractStep {
    private StopwatchPage stopwatchPage = new StopwatchPage(driver);

    public StopwatchPageSteps(AndroidDriver driver) {
        super(driver);
    }

    private PermissionPageSteps permissionPageSteps = new PermissionPageSteps(driver);
    private IntroductionPageSteps introductionPageSteps = new IntroductionPageSteps(driver);

    @Override
    @Step("The main stopwatch page is opened")
    public StopwatchPageSteps checkPageDisplayed() {
        stopwatchPage.getStopwatchBox();
        assertThat("App's main page is not displayed", stopwatchPage.getStopwatchBox().isDisplayed());
        return this;
    }

    @Step("Tap stopwatch box")
    public StopwatchPageSteps tapMainButton() {
        stopwatchPage.getStopwatchBox().click();
        return this;
    }

    @Step("Hold on stopwatch box")
    public StopwatchPageSteps longPressMainButton() {
        MobileElement longpress = (MobileElement) new WebDriverWait(driver, 10).
                until(ExpectedConditions.elementToBeClickable(stopwatchPage.getStopwatchBox()));
        LongPressOptions longPressOptions = new LongPressOptions();
        longPressOptions.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(longpress));
        new TouchAction(driver).longPress(longPressOptions).perform();
        return this;
    }

    @Step("Get time from a stopwatch box")
    public String getTime() {
        return stopwatchPage.getStopwatchBox().getText();
    }

    @Step("Run and stop stopwatch")
    public String runStopwatch() {
        this.checkPageDisplayed().tapMainButton();
        this.tapMainButton();
        return this.getTime();
    }

    @Step("Open settings")
    public StopwatchPageSteps tapSettingsButton() {
        stopwatchPage.getSettingsButton().click();
        return this;
    }

    @Step("Change a stopwatch shape to square")
    public StopwatchPageSteps tapSquareButton() {
        stopwatchPage.getSquareButton().click();
        return this;
    }

    @Step("Change a stopwatch shape to round")
    public StopwatchPageSteps tapRoundButton() {
        stopwatchPage.getRoundButton().click();
        return this;
    }

    @Step("Change a stopwatch shape to  rounded square")
    public StopwatchPageSteps tapRoundedSquareButton() {
        stopwatchPage.getRoundedSquareButton().click();
        return this;
    }

    @Step("Change a stopwatch shape to full screen")
    public StopwatchPageSteps tapFullScreenButton() {
        stopwatchPage.getFullScreenButton().click();
        return this;
    }

    @Step("Change background color")
    public StopwatchPageSteps tapBackgroundButton() {
        stopwatchPage.getBackgroundButton().click();
        return this;
    }

    @Step("Change color of the stopwatch screen")
    public StopwatchPageSteps tapColorsPalette() {
        stopwatchPage.getStopwatchColor1().click();
        return this;
    }

    @Step("Change color of digits")
    public StopwatchPageSteps tapDigitsColorPalette() {
        stopwatchPage.getDigitsColorPaletteElement().click();
        return this;
    }
}
