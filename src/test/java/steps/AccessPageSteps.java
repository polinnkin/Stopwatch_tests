package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import pages.AccessPage;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Steps for Access dialog page
 */
public class AccessPageSteps extends AbstractStep {
    private AccessPage accessPage = new AccessPage(driver);

    public AccessPageSteps(AndroidDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check 'Access popup' is displayed")
    public AccessPageSteps checkPageDisplayed() {
        assertThat("Access popup page is not displayed", accessPage.getCancelButton().isDisplayed());
        return this;
    }

    @Step("Tap 'Continue' Button")
    public AccessPageSteps tapAllowButton() {
        accessPage.getContinueButton().click();
        return this;
    }

    @Step("Tap 'Cancel' Button")
    public AccessPageSteps tapCancelButton() {
        accessPage.getCancelButton().click();
        return this;
    }
}