package allureLesson;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @DisplayName("Чистый selenide")
    @Test
    public void checkName(){

        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com/selenide/selenide/issues");
        $("#js-issues-search").setValue("2126").pressEnter();
        $("#issue_2126_link").shouldBe(Condition.visible);
        $("#issue_2126_link").shouldHave(text("Bump nettyVersion from 4.1.86.Final to 4.1.87.Final"));
    }

}
