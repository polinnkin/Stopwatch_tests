package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ChangeColorOfDigitsTest extends AbstractStopwatchTest {

    @Test(description = " [TC 10] Change color of digits")
    public void changeColorOfDigitsTest () throws InterruptedException {
        accessPageSteps.checkPageDisplayed().tapAllowButton();
        updatePageSteps.checkPageDisplayed().tapOkButton();
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
        stopwatchPageSteps.tapSettingsButton();
        stopwatchPageSteps.tapDigitsColorPalette();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/Screenshots/ChangeColorOfDigitsTest.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
