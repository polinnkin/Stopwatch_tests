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

    @Test(description = "[TC1] Allow Device Permission", priority = 1)
    public void allowPermission(){
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
    }

    @Test(description = "[TC2] Tap through the Introduction page", priority = 2)
    public void goThroughIntroduction(){
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
    }

    @Test(description = "[TC3] Run a stopwatch for 10 sec", priority = 3)
    public void runStopwatch() throws InterruptedException {
        stopwatchPageSteps
                .checkPageDisplayed()
                .tapMainButton();
        Thread.sleep(1000);
        stopwatchPageSteps.tapMainButton();
        System.out.println(stopwatchPageSteps.getTime());
    }

    @AfterMethod
    public void restartApp() {
        driver.resetApp();
    }
}
