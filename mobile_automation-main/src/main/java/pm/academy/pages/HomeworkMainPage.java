package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeworkMainPage extends BasePage {
    @AndroidFindBy(xpath = "(//*[@resource-id = 'com.parimatch:id/editText'])")
    public MobileElement loginPage;
    @AndroidFindBy(accessibility = "close_button")
    public MobileElement exitInput;
    @AndroidFindBy(accessibility = "sport-tab")
    private MobileElement sportInput;
    @AndroidFindBy(id = "com.parimatch:id/llContainer")
    private MobileElement sportSection;
    @AndroidFindBy(xpath = "(//*[@content-desc = 'outcome_1'])[1]")
    private MobileElement firstCoef;
    @AndroidFindBy(accessibility = "quickBetPlaceButton")
    private MobileElement placeBetInput;
    @AndroidFindBy(xpath = "(//*[@content-desc = 'B'])")
    private MobileElement basketballInput;
    @AndroidFindBy(accessibility = "timeFilter1h")
    private MobileElement oneHourInput;


    public boolean isLoginPageDisplayed() {
        return waitForExpectedElement(loginPage).isDisplayed();

    }

    public void clickExitInput() {
        waitForExpectedElement(exitInput).click();
    }

    public void clickSportInput() {
        waitForExpectedElement(sportInput).click();
    }

    public boolean isSportPageDisplayed() {
        return waitForExpectedElement(sportSection).isDisplayed();
    }

    public void selectBasketballSection() {
        waitForExpectedElement(basketballInput).click();
        waitForExpectedElement(oneHourInput).click();
    }

    public void setBet() {
        waitForExpectedElement(firstCoef).click();
        waitForExpectedElement(placeBetInput).click();
    }

}