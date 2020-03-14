package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * A page representing an Update Dialog page
 */
public class UpdatePage extends AbstractPage {

    public UpdatePage(AndroidDriver driver) { super(driver); }

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement OkButton;

    @AndroidFindBy(id = "android:id/button3")
    private MobileElement CheckForUpdateButton;

    public MobileElement getOkButton() { return OkButton; }

    public MobileElement getCheckForUpdateButton() { return CheckForUpdateButton; }
}