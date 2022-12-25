import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SoftAssertionsTest {
    @Test
    public void softAssertionsTest(){
        //Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");

        //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

        //В списке страниц (Pages) есть страница SoftAssertions
        $(byText("Show 2 more pages…")).click();
        $("div.js-wiki-sidebar-toggle-display").shouldHave(text("SoftAssertions"));
        $("div.js-wiki-sidebar-toggle-display").find(byText("SoftAssertions")).click();

        // внутри есть пример кода для JUnit5
        $("div#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
