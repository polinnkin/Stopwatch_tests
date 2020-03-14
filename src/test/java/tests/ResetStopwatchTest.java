package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ResetStopwatchTest extends AbstractStopwatchTest {

    @Test(description = " [TC2] Reset stopwatch")
    public void resetStopwatch() throws InterruptedException {
        accessPageSteps.checkPageDisplayed().tapAllowButton();
        updatePageSteps.checkPageDisplayed().tapOkButton();
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
        stopwatchPageSteps.longPressMainButton();
        System.out.println(stopwatchPageSteps.getTime());
        assertEquals("00:00.00", stopwatchPageSteps.getTime());
    }
}
