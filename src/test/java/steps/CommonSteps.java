package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Steps for common elements
 */
public class CommonSteps extends AbstractCommonStep {

    private WebDriverWait wait = new WebDriverWait(driver, 5);

    public CommonSteps(AndroidDriver driver) {
        super(driver);
    }

    @Step("Wait until an element is displayed")
    public CommonSteps waitUntilDisplayed(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return this;
    }
}