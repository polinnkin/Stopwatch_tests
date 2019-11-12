package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import pages.IntroductionPage;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Steps for Introduction dialog page
 */
public class IntroductionPageSteps extends AbstractStep {

    private IntroductionPage introductionPage = new IntroductionPage(driver);

    public IntroductionPageSteps(AndroidDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check 'Introduction dialog' is displayed")
    public IntroductionPageSteps checkPageDisplayed() {
        assertThat("Introduction dialog page is not displayed", introductionPage.getLaterButton().isDisplayed());
        return this;
    }

    @Step("Tap Later button")
    public IntroductionPageSteps tapLaterButton() {
        introductionPage.getLaterButton().click();
        return this;
    }
}
