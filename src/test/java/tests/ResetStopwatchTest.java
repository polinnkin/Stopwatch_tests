package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.CommonSteps;
import steps.IntroductionPageSteps;
import steps.PermissionPageSteps;
import steps.StopwatchPageSteps;

import static org.testng.Assert.assertEquals;

public class ResetStopwatchTest extends AbstractStopwatchTest {

    private StopwatchPageSteps stopwatchPageSteps;
    private PermissionPageSteps permissionPageSteps;
    private IntroductionPageSteps introductionPageSteps;

    @BeforeTest
    public void setUp() {
        stopwatchPageSteps = new StopwatchPageSteps(driver);
        permissionPageSteps = new PermissionPageSteps(driver);
        introductionPageSteps = new IntroductionPageSteps(driver);
    }

    @Test(description = "Reset stopwatch")
    public void resetStopwatch() throws InterruptedException {
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
        stopwatchPageSteps.longPressMainButton();
        System.out.println(stopwatchPageSteps.getTime());
        assertEquals("00:00.00", stopwatchPageSteps.getTime());
    }

    @AfterMethod
    public void restartApp() {
        driver.resetApp();
    }
}
