package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.IntroductionPageSteps;
import steps.PermissionPageSteps;
import steps.StopwatchPageSteps;

import java.io.File;
import java.io.IOException;

public class ChangeShapeToSquareTest extends AbstractStopwatchTest {

    @Test(description = " [TC4] Change shape of the stopwatch screen to square")
    public void changeShapeToSquareTest() throws InterruptedException {
        accessPageSteps.checkPageDisplayed().tapAllowButton();
        updatePageSteps.checkPageDisplayed().tapOkButton();
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
        stopwatchPageSteps.tapSettingsButton();
        stopwatchPageSteps.tapSquareButton();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/Screenshots/ChangeShapeToSquareTest.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
