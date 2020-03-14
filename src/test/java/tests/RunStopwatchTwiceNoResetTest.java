package tests;

import org.testng.annotations.Test;

public class RunStopwatchTwiceNoResetTest extends AbstractStopwatchTest {

    @Test(description = "[TC3]Run the stopwatch starting with a point of time when the previous stopwatch was ended")
    public void runStopwatch() throws InterruptedException {
        accessPageSteps.checkPageDisplayed().tapAllowButton();
        updatePageSteps.checkPageDisplayed().tapOkButton();
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
    }
}
