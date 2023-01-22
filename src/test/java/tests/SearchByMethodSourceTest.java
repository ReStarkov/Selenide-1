package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SearchByMethodSourceTest extends BaseTest{

    static Stream<Arguments> DataProvider() {
        return Stream.of(
                Arguments.of("DEV", List.of("Dev", "Devops","Developer", "Development", "Devexperts", "Develogroup","Devim", "Develop", "Devops junior", "Devexpress")),
                Arguments.of("QA", List.of("Qa", "Qa engineer", "Qa tester", "Qatar", "Qa automation", "Qazaq", "Qa junior", "Qa lead", "Qa тестировщик", "Qa/qc"))
        );
    }
    @MethodSource("DataProvider")
    @ParameterizedTest(name = "Для введенного значения: {0} в результате выдаче содержится вариант {1}")
    @Tags({@Tag("BLOCKER"), @Tag("UI_TEST")})
    void inputItemsShouldHaveValue(String value, List<String> items){
        mainPage.openPage()
                .setValueToInput(value)
                .suggestItemsShodHaveText(items);

    }

}
