package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.IntroductionPageSteps;
import steps.PermissionPageSteps;
import steps.StopwatchPageSteps;

public class RunStopwatchTwiceNoResetTest extends AbstractStopwatchTest {

    private StopwatchPageSteps stopwatchPageSteps;
    private PermissionPageSteps permissionPageSteps;
    private IntroductionPageSteps introductionPageSteps;

    @BeforeTest
    public void setUp() {
        stopwatchPageSteps = new StopwatchPageSteps(driver);
        permissionPageSteps = new PermissionPageSteps(driver);
        introductionPageSteps = new IntroductionPageSteps(driver);
    }

    @Test(description = "[TC3]Run the stopwatch starting with a point of time when the previous stopwatch was ended")
    public void runStopwatch() throws InterruptedException {
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
    }

    @AfterMethod
    public void restartApp() {
        driver.resetApp();
    }
}
