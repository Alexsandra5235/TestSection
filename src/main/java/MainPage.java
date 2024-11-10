import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MainPage {

    public final SelenideElement
            linkMenuBranch = $x("//a[@href='#stk-16']"),
            textPreviewBranch = $x("//*[@id='stk-16']/strong"),
            textPreviewHead = $x("/html/body/main/div/div/div/div/section[1]/div/div[2]/div/div");



    /**
     * Проверка отображения текста на странице
     */
    @Step("Проверка отображения текста на странице")
    public boolean isVisiblePreviewHead(){
        return textPreviewHead.shouldBe(visible).isDisplayed();
    }

    /**
     * Нажатие на ссылку 'Ветвление' в содержании страницы
     */
    @Step("Нажатие на ссылку 'Ветвление' в содержании страницы")
    public void tabLinkBranch(){
        linkMenuBranch.shouldBe(visible, Duration.ofSeconds(15)).click();
    }

    /**
     * Проверка отображения текста на странице
     */
    @Step("Проверка отображения заголовка 'Ветвление' на странице")
    public boolean isVisiblePreviewBranch(){
        return textPreviewBranch.shouldBe(visible, Duration.ofSeconds(15)).isDisplayed();
    }

    /**
     * Скролл до элемента 'Ветвление' в содержании
     */
    @Step("Скролл до элемента 'Ветвление' в содержании")
    public void scrollContentBranch(){
        new Actions(getWebDriver()).scrollToElement(linkMenuBranch).perform();
    }
}
