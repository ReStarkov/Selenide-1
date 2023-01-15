package demoqa.tests;

import com.codeborne.selenide.Configuration;
import demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();
    @BeforeAll
    public static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize="1920x1080";
    }
}
