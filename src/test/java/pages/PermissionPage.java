package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * A page representing an Permission Dialog page
 */
public class PermissionPage extends AbstractPage {
    public static final String allowXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/" +
            "android.widget.LinearLayout/android.widget.Button[1]";
    public static final String denyXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/" +
            "android.widget.LinearLayout/android.widget.Button[2]";

    public PermissionPage(AndroidDriver driver) { super(driver); }

    @AndroidFindBy(xpath = allowXpath)
    private MobileElement allowButton;

    @AndroidFindBy(xpath = denyXpath)
    private MobileElement denyButton;

    public MobileElement getAllowButton() { return allowButton; }

    public MobileElement getDenyButton() { return denyButton; }
}