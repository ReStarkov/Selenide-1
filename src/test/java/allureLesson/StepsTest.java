package allureLesson;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StepsTest {

    @Test
    @DisplayName("Проверка имени задачи через Steps")
    public void checkName() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        Steps steps = new Steps();

        steps.openPage("selenide/selenide/issues");
        steps.setValueIssueId("2126");
        steps.issueShoudBeVisible("2126");
        steps.checkName("2126", "Bump nettyVersion from 4.1.86.Final to 4.1.87.Final");
    }
}


