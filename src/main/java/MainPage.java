import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public final SelenideElement
            linkMenuBranch = $x("//a[@href='#stk-16']"),
            textPreviewBranch = $x("//*[@id='stk-16']/strong"),
            buttonCategoryWomen = $x("//*[@id=\"ui-id-4\"]"),
            buttonCategoryTops = $x("//*[@id=\"ui-id-9\"]"),
            textBoxSearchBar = $x("//*[@id=\"search\"]");

    public final ElementsCollection
            textPreviewHead = $$x("//div[@class='article-preview']");

    /**
     * Проверка отображения текста на странице
     */
    @Step("Проверка отображения текста на странице")
    public boolean isVisiblePreviewHead(){
        return textPreviewHead.first().shouldBe(visible, Duration.ofSeconds(15)).isDisplayed();
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
        linkMenuBranch.scrollTo();
    }
}
