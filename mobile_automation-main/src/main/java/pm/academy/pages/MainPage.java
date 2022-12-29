package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainPage extends BasePage {

    @AndroidFindBy(xpath = "(//*[@resource-id = 'com.parimatch:id/editText'])")
    public MobileElement loginPage;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='close_button']")
    public MobileElement buttonExit;
    //    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(accessibility = "menu-tab")
    private MobileElement menuButton;
    //    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "com.parimatch:id/rvQab")
    private MobileElement promoPanel;
    @AndroidFindBy(id = "com.parimatch:id/ivLogo")
    private MobileElement headTitle;

    public boolean isMenuButtonDisplayed() {
        return waitForExpectedElement(menuButton).isDisplayed();
    }

    public boolean isPromoPanelDisplayed() {
        return waitForExpectedElement(promoPanel).isDisplayed();
    }

    public boolean isHeadTitleDisplayed() {
        return waitForExpectedElement(headTitle).isDisplayed();
    }

    public void clickMenuButtonDisplayed() {
        waitForExpectedElement(menuButton).click();
    }

}
