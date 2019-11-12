package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import pages.PermissionPage;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Steps for Permission dialog page
 */
public class PermissionPageSteps extends AbstractStep {
    private PermissionPage permissionPage = new PermissionPage(driver);

    public PermissionPageSteps(AndroidDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check 'Permission popup' is displayed")
    public PermissionPageSteps checkPageDisplayed() {
        assertThat("Permission popup page is not displayed", permissionPage.getAllowButton().isDisplayed());
        return this;
    }

    @Step("Tap 'Allow' Button")
    public PermissionPageSteps tapAllowButton() {
        permissionPage.getAllowButton().click();
        return this;
    }

    @Step("Tap 'Deny' Button")
    public PermissionPageSteps tapDenyButton() {
        permissionPage.getDenyButton().click();
        return this;
    }
}