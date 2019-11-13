package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractStopwatchTest {

    private static final String DEFAULT_DEVICE = "Galaxy S9";

    private static final String PROPERTY_NAME = "api_version";

    private static final String APK_NAME = "stopwatch.apk";

    private static final String URL = "http://127.0.0.1:4723/wd/hub";

    private static final String APK_PATH = "src/test/resources/";

    /**
     * Dictionary is a {@link Map} collection that contains {@link String}
     * Android API level as a key and {@link String} device name as a value.
     */
    private static final Map<String, String> DEVICES = new HashMap<String, String>() {{
        put("28", "Galaxy S9");
    }};

    protected static AndroidDriver<AndroidElement> driver;

    @BeforeSuite
    public void setUpAppium() throws MalformedURLException {
        URL url = new URL(URL);
        File appDir = new File(APK_PATH);
        File app = new File(appDir, APK_NAME);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
                getDeviceName(System.getProperty(PROPERTY_NAME)));
        capabilities.setCapability(MobileCapabilityType.APP, app
                .getAbsolutePath());
        driver = new AndroidDriver(url, capabilities);
    }

    private String getDeviceName(String api) {
        return (api == null) ? DEFAULT_DEVICE : DEVICES.get(api);
    }

    @AfterSuite
    public void tearDownAppium() {
        driver.quit();
    }

    @AfterClass
    public void restartApp() {
        driver.resetApp();
    }
}