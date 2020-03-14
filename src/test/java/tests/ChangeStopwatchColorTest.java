package tests;

import org.testng.annotations.Test;

public class ChangeStopwatchColorTest extends AbstractStopwatchTest {

    @Test(description = "[TC9] Change color of the stopwatch screen")
    public void changeToSquare() throws InterruptedException {
        accessPageSteps.checkPageDisplayed().tapAllowButton();
        updatePageSteps.checkPageDisplayed().tapOkButton();
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
        stopwatchPageSteps.tapSettingsButton();
        stopwatchPageSteps.tapColorsPalette();
        Thread.sleep(1000);
    }

}
