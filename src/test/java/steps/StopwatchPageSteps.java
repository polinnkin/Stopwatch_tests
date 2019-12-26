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

    @Override
    @Step("The main stopwatch page is opened")
    public StopwatchPageSteps checkPageDisplayed() {
        stopwatchPage.getStopwatchBox();
        assertThat("App's main page is not displayed", stopwatchPage.getStopwatchBox().isDisplayed());
        return this;
    }

    @Step("Tap stopwatch box")
    public StopwatchPageSteps tapMainButton()  {
        stopwatchPage.getStopwatchBox().click();
        return this;
    }

    @Step("Hold on stopwatch box")
    public StopwatchPageSteps longPressMainButton()  {
        MobileElement longpress = (MobileElement) new WebDriverWait(driver, 10).
                until(ExpectedConditions.elementToBeClickable(stopwatchPage.getStopwatchBox()));
        LongPressOptions longPressOptions = new LongPressOptions();
        longPressOptions.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(longpress));
        new TouchAction(driver).longPress(longPressOptions).perform();
        return this;
    }

    @Step("Get time from a stopwatch box")
    public String getTime(){ return stopwatchPage.getStopwatchBox().getText(); }
}
