package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * A page representing the main stopwatch page
 */
public class StopwatchPage extends AbstractPage {

    public static final String shapeViewGroupXpath = "//android.widget.LinearLayout[1]/" +
            "android.widget.LinearLayout[3]/android.widget.LinearLayout";

    public static final String colorPaletteXpath = "//android.widget.LinearLayout[1]/" +
            "android.widget.LinearLayout[1]/android.widget.LinearLayout";

    public static final String digitsColorPaletteXpath = "//android.widget.LinearLayout[1]/" +
            "android.widget.LinearLayout[2]/android.widget.LinearLayout[8";

    public static final String color1Xpath = colorPaletteXpath + "[80]";

    public static final String color2Xpath = colorPaletteXpath + "[160]";

    public static final String color3Xpath = colorPaletteXpath + "[310]";

    public static final String squareXpath = shapeViewGroupXpath + "[1]/android.widget.ImageView";

    public static final String roundXpath = shapeViewGroupXpath + "[2]/android.widget.ImageView";

    public static final String roundedSquareXpath = shapeViewGroupXpath + "[3]/android.widget.ImageView";

    public static final String fullScreenXpath = shapeViewGroupXpath + "[4]/android.widget.ImageView";

    @AndroidFindBy(id = "toplab18.app.simpleststopwatch2:id/tv_digits")
    private MobileElement stopwatchBox;

    @AndroidFindBy(id = "toplab18.app.simpleststopwatch2:id/tv_grab")
    private MobileElement settingsButton;

    @AndroidFindBy(xpath = squareXpath)
    private MobileElement squareButton;

    @AndroidFindBy(xpath = roundedSquareXpath)
    private MobileElement roundedSquareButton;

    @AndroidFindBy(xpath = roundXpath)
    private MobileElement roundButton;

    @AndroidFindBy(xpath = fullScreenXpath)
    private MobileElement fullScreenButton;

    @AndroidFindBy(id = "toplab18.app.simpleststopwatch2:id/FLDayMode")
    private MobileElement backgroundButton;

    @AndroidFindBy(xpath = color1Xpath)
    private MobileElement colorPaletteElement1;

    @AndroidFindBy(xpath = color2Xpath)
    private MobileElement colorPaletteElement2;

    @AndroidFindBy(xpath = color3Xpath)
    private MobileElement colorPaletteElement3;

    @AndroidFindBy(xpath = digitsColorPaletteXpath)
    private MobileElement digitsColorPaletteElement;

    public StopwatchPage(AndroidDriver driver) {
        super(driver);
    }

    public MobileElement getStopwatchBox() {
        return stopwatchBox;
    }

    public MobileElement getSettingsButton() {
        return settingsButton;
    }

    public MobileElement getSquareButton() {
        return squareButton;
    }

    public MobileElement getRoundedSquareButton() {
        return roundedSquareButton;
    }

    public MobileElement getRoundButton() {
        return roundButton;
    }

    public MobileElement getFullScreenButton() {
        return fullScreenButton;
    }

    public MobileElement getBackgroundButton() {
        return backgroundButton;
    }

    public MobileElement getStopwatchColor1() {
        return colorPaletteElement1;
    }

    public MobileElement getStopwatchColor2() {
        return colorPaletteElement2;
    }

    public MobileElement getStopwatchColor3() {
        return colorPaletteElement3;
    }

    public MobileElement getDigitsColorPaletteElement() {
        return digitsColorPaletteElement;
    }

}
