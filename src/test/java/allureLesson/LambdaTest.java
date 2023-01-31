package allureLesson;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaTest {

    @DisplayName("Проверка имени задачи через Lambda")
    @Test
    public void checkName(){

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открыть страницу с задачами", () -> {
            open("https://github.com/selenide/selenide/issues");
        });
        step("Ввести номер задачи `2126` и выполнить поиск", () -> {
            $("#js-issues-search").setValue("2126").pressEnter();
        });
        step("В списке выдачи есть искомое значение", () -> {
            $("#issue_2126_link").shouldBe(Condition.visible);
        });
        step("Заголовок соответствует значению `Bump nettyVersion from 4.1.86.Final to 4.1.87.Final`", () -> {
            $("#issue_2126_link").shouldHave(text("Bump nettyVersion from 4.1.86.Final to 4.1.87.Final"));
        });
    }
}
