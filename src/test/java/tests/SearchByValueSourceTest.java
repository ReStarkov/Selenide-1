package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SearchByValueSourceTest extends BaseTest{
    @ValueSource(
            strings = {"QA Java", "QA Python"}
    )

    @ParameterizedTest(name = "Результаты поиска должны содержать искомое значение в хедере: {0}")
    @Tags({@Tag("BLOCKER"), @Tag("UI_TEST")})
    void searchHeaderResultShouldHaveValidValue(String value){
        mainPage.openPage()
                .setValueToInputAndPressEnter(value);
        resultSearchPage.headerHaveText(value);
    }

}
