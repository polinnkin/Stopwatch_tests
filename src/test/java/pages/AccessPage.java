package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * A page representing an Access Dialog page
 */
public class AccessPage extends AbstractPage {

    public AccessPage(AndroidDriver driver) { super(driver); }

    @AndroidFindBy(id = "com.android.permissioncontroller:id/continue_button")
    private MobileElement continueButton;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/cancel_button")
    private MobileElement cancelButton;

    public MobileElement getContinueButton() { return continueButton; }

    public MobileElement getCancelButton() { return cancelButton; }
}