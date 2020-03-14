package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * A page representing an Introduction dialog page
 */
public class IntroductionPage extends AbstractPage {

    public IntroductionPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "android:id/button2")
    private MobileElement rateButton;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement supportButton;

    @AndroidFindBy(id = "android:id/button3")
    private MobileElement laterButton;

    public MobileElement getRateButtonButton() {
        return rateButton;
    }

    public MobileElement getSupportButton() {
        return supportButton;
    }

    public MobileElement getLaterButton() {
        return laterButton;
    }
}
