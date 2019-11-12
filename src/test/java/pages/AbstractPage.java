package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

/**
 * This is an template for all the pages
 */
public abstract class AbstractPage {

    protected final AndroidDriver driver;

    protected AbstractPage(AndroidDriver driver) {
        this.driver = driver;
        AppiumFieldDecorator afd = new AppiumFieldDecorator(driver, ofSeconds(20));
        PageFactory.initElements(afd, this);
    }
}