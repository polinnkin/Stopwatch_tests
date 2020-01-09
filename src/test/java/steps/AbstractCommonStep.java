package steps;

import io.appium.java_client.android.AndroidDriver;

/**
 * A base for all classes with steps.
 */
public abstract class AbstractCommonStep {

    public final AndroidDriver driver;

    public AbstractCommonStep(AndroidDriver driver) {
        this.driver = driver;
    }
}
