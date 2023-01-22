package tests;

import com.codeborne.selenide.Configuration;
import hh.pages.MainPage;
import hh.pages.ResultSearchPage;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    MainPage mainPage = new MainPage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();
    @BeforeAll
    public static void setUp(){
        Configuration.browserSize="1920x1080";
    }
}
