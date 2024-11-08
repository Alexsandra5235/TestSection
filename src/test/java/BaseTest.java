import java.util.ArrayList;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {

    public void SetUp(){
        Configuration.browser = "edge";
    }

    @BeforeEach
    public void Init(){
        SetUp();
        Selenide.open(Constants.url);
    }

    @AfterEach()
    public void TernDown(){
        Selenide.closeWebDriver();
    }
}
