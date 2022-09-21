package PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.MainPage.projectTestLink;
import static PageObject.PageElements.MainPage.projectsMenuButton;

public class MainPageSteps {
    @Step("Заходим в проект")
    public static void openProject(){
        projectsMenuButton.shouldBe(Condition.visible).click();
        projectTestLink.shouldBe(Condition.visible).click();
    }


}
