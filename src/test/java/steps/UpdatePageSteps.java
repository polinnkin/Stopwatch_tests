package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import pages.UpdatePage;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Steps for Update dialog page
 */
public class UpdatePageSteps extends AbstractStep {
    private UpdatePage updatePage = new UpdatePage(driver);

    public UpdatePageSteps(AndroidDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check 'Update popup' is displayed")
    public UpdatePageSteps checkPageDisplayed() {
        assertThat("Update popup page is not displayed", updatePage.getOkButton().isDisplayed());
        return this;
    }

    @Step("Tap 'Ok' Button")
    public UpdatePageSteps tapOkButton() {
        updatePage.getOkButton().click();
        return this;
    }

    @Step("Tap 'Check for updates' Button")
    public UpdatePageSteps tapCheckForUpdateButton() {
        updatePage.getCheckForUpdateButton().click();
        return this;
    }
}