package hh.pages;

import com.codeborne.selenide.CollectionCondition;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public MainPage openPage(){
        open("https://hh.ru");
        return this;
    }
    public MainPage setValueToInputAndPressEnter(String value){
        $("#a11y-search-input").setValue(value).pressEnter();
        return this;
    }

    public MainPage setValueToInput(String value){
        $("#a11y-search-input").setValue(value);
        return this;
    }
    public MainPage suggestItemsShodHaveText(List<String>value){
        $$(".suggest__item").shouldHave(CollectionCondition.texts(value));
        return this;
    }
}
