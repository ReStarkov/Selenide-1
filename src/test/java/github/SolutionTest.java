package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SolutionTest {

    @Test
    public void solutionTest(){
        //открыть github.com
        open("https://github.com");

        //выберите меню Solutions -> Enterprize с помощью команды hover для Solutions
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();

        //Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."
        $(".h1-mktg").shouldBe(visible);
        $(".h1-mktg").shouldHave(text("Build like the best"));
    }
}
