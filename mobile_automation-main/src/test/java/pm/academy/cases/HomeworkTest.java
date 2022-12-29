package pm.academy.cases;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pm.academy.base.BaseTest;
import pm.academy.pages.HomeworkMainPage;

public class HomeworkTest extends BaseTest {
    @Test
    public void homeworkTest() {
        Assertions.assertThat(new HomeworkMainPage().isLoginPageDisplayed()).as("not displayed").isTrue();
        (new HomeworkMainPage()).clickExitInput();
        (new HomeworkMainPage()).clickSportInput();
        Assertions.assertThat(new HomeworkMainPage().isSportPageDisplayed()).as("not displayed").isTrue();
        (new HomeworkMainPage()).selectBasketballSection();
        (new HomeworkMainPage()).setBet();
        Assertions.assertThat(new HomeworkMainPage().isLoginPageDisplayed()).as("not displayed").isTrue();
    }
}