package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import steps.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractStopwatchTest {

    private static final String DEFAULT_DEVICE = "Pixel2_API_29";

    private static final String PROPERTY_NAME = "api_version";

    private static final String APK_NAME = "stopwatch.apk";

    private static final String URL = "http://127.0.0.1:4723/wd/hub";

    private static final String APK_PATH = "src/test/resources/";

    private static final String APP_PACKAGE = "toplab18.app.simpleststopwatch2";

    private static final String APP_ACTIVITY = "MainActivity";

    StopwatchPageSteps stopwatchPageSteps;
    PermissionPageSteps permissionPageSteps;
    IntroductionPageSteps introductionPageSteps;
    AccessPageSteps accessPageSteps;
    UpdatePageSteps updatePageSteps;

    /**
     * Dictionary is a {@link Map} collection that contains {@link String}
     * Android API level as a key and {@link String} device name as a value.
     */
    private static final Map<String, String> DEVICES = new HashMap<String, String>() {{
        put("29", "Pixel2_API_29");
        put("27", "Pixel 2 API 27");
        put("26", "Pixel_API_26");
        put("24", "Nexus5_API_24");
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
        capabilities.setCapability("appPackage", APP_PACKAGE);
        capabilities.setCapability("appActivity", APP_ACTIVITY);
        ;
        driver = new AndroidDriver(url, capabilities);
    }

    private String getDeviceName(String api) {
        return (api == null) ? DEFAULT_DEVICE : DEVICES.get(api);
    }

    @BeforeTest
    public void setUp() {
        stopwatchPageSteps = new StopwatchPageSteps(driver);
        permissionPageSteps = new PermissionPageSteps(driver);
        introductionPageSteps = new IntroductionPageSteps(driver);
        accessPageSteps = new AccessPageSteps(driver);
        updatePageSteps = new UpdatePageSteps(driver);
    }

    @AfterSuite
    public void tearDownAppium() {
        driver.quit();
    }
}