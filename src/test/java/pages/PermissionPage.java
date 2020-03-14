package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * A page representing an Permission Dialog page
 */
public class PermissionPage extends AbstractPage {

    public static final String allowXpath = "//*[@text=\"ALLOW\"]";
    public static final String denyXpath = "//*[@text=\"DENY\"]";

    public PermissionPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = allowXpath)
    private MobileElement allowButton;

    @AndroidFindBy(id = denyXpath)
    private MobileElement denyButton;

    public MobileElement getAllowButton() {
        return allowButton;
    }

    public MobileElement getDenyButton() {
        return denyButton;
    }
}