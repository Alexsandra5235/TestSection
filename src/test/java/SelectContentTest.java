import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Owner("Alexandra")
@DisplayName("Тесты выбора элементов в содержании статьи")
@Tag("selectContent")
public class SelectContentTest extends BaseTest{

    /**
     * Выбор "Ветвление" в содержании страницы
     */
    @DisplayName("Выбор 'Ветвление' в содержании страницы")
    @Description("Открытие страницы, переход к оглавлению страницы, выбор пункта 'Ветвление'")
    @Tag("positive")
    @Test
    public void selectBranch() throws Exception{
        mainPage.scrollContentBranch();
        mainPage.tabLinkBranch();

        assertTrue(mainPage.isVisiblePreviewBranch());
    }
}
