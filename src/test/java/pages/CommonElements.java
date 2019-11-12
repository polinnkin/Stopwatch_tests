package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Elements which are present on several app screens.
 */
public class CommonElements extends AbstractPage {

    @AndroidFindBy(id = "toplab18.app.simpleststopwatch2:id/tv_digits")
    private MobileElement stopwatchBox;

    public CommonElements(AndroidDriver driver) {
        super(driver);
    }

    public MobileElement getStopwatchBox() {
        return stopwatchBox;
    }

    public String getTime(){ return stopwatchBox.getText(); }
}
