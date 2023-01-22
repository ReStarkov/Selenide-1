package hh.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SearchByCsvSourceTest extends BaseTest{
    @CsvSource({
            "ВТБ, ПАО ВТБ",
            "Альфа, Альфа-Банк"
    })

    @ParameterizedTest(name = "Результаты поиска: {1} должны содержать искомое значение в названии компании: {0}")
    @Tags({@Tag("BLOCKER"), @Tag("UI_TEST")})
    void searchResultShouldHaveValidValue(String value){
        mainPage.openPage()
                .setValueToInputAndPressEnter(value);
        resultSearchPage.companyNameEqualSearchName(value);
    }

}
