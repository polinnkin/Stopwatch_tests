package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.CommonSteps;
import steps.IntroductionPageSteps;
import steps.PermissionPageSteps;
import steps.StopwatchPageSteps;


public class FirstRunTest extends AbstractStopwatchTest {

    private CommonSteps commonSteps;
    private StopwatchPageSteps stopwatchPageSteps;
    private PermissionPageSteps permissionPageSteps;
    private IntroductionPageSteps introductionPageSteps;

    @BeforeTest
    public void setUp() {
        stopwatchPageSteps = new StopwatchPageSteps(driver);
        commonSteps = new CommonSteps(driver);
        permissionPageSteps = new PermissionPageSteps(driver);
        introductionPageSteps = new IntroductionPageSteps(driver);
    }

    @Test(description = "First run of stopwatch")
    public void firstRun() throws InterruptedException {
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
        stopwatchPageSteps
                .checkPageDisplayed()
                .tapMainButton();
        Thread.sleep(2000);
        stopwatchPageSteps.tapMainButton();
        System.out.println(stopwatchPageSteps.getTime());
    }

    @AfterMethod
    public void restartApp() {
        driver.resetApp();
    }
}
