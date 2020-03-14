package tests;

import org.testng.annotations.Test;

public class RunStopwatchTest extends AbstractStopwatchTest {

    @Test(description = " [TC1] Run a stopwatch")
    public void runStopwatch() throws InterruptedException {
        accessPageSteps.checkPageDisplayed().tapAllowButton();
        updatePageSteps.checkPageDisplayed().tapOkButton();
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
    }
}
