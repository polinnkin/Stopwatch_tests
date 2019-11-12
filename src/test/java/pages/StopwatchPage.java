package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * A page representing the main stopwatch page
 */
public class StopwatchPage extends AbstractPage {
    @AndroidFindBy(id = "toplab18.app.simpleststopwatch2:id/tv_digits")
    private MobileElement stopwatchBox;

    public StopwatchPage(AndroidDriver driver) {
        super(driver);
    }

    public MobileElement getStopwatchBox() {
        return stopwatchBox;
    }

}
