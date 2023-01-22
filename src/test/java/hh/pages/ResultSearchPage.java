package hh.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultSearchPage {
    public ResultSearchPage headerHaveText(String value){
        $("[data-qa = vacancies-search-header").shouldHave(text(value));
        return this;
    }

    public ResultSearchPage companyNameEqualSearchName(String value){
        $("[data-qa = vacancy-serp__vacancy-employer").shouldHave(text(value));
        return this;
    }
}
