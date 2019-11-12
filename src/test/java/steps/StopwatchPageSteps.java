package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import pages.StopwatchPage;

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
    public StopwatchPageSteps tapMainButton() {
        stopwatchPage.getStopwatchBox().click();
        return this;
    }

    @Step("Get time from a stopwatch box")
    public String getTime(){ return stopwatchPage.getStopwatchBox().getText(); }
}
