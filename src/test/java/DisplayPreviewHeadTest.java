import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisplayPreviewHeadTest extends BaseTest{
    /**
     * Проверка отображения заголовка на странице
     */
    @DisplayName("Проверка отображения заголовка на странице")
    @Description("Открытие страницы, проверка отображения заголовка на странице")
    @Tag("positive")
    @Test
    public void displayPreviewHead(){
        assertTrue(mainPage.isVisiblePreviewHead());
    }
}
