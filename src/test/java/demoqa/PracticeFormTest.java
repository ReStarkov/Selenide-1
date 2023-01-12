package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {
    @BeforeAll
    public static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize="1920x1080";
    }

    String firstName = "Mike";
    String lastName = "Smith";
    String mail = "MikeSmith@gmail.com";
    String phone = "1234567891";
    String dateBirth = "24 October,1987";

    String subject = "English";

    String currentAddress = "750 Kearny St, San Francisco";


    @Test
    void practiceFormTest(){
        //заполнение формы
        open("/automation-practice-form");
        $(".playgound-header").shouldHave(text("Practice Form"));
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(mail);
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue(phone);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("October")).click();
        $(".react-datepicker__year-select").$(byText("1987")).click();
        $(".react-datepicker__day--024").click();
        $("#subjectsInput").setValue(subject).pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("jpg/avatar.jpg");
        $("#currentAddress").setValue(currentAddress);
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Noida")).click();
        $("#submit").click();

        //проверка результата
        $(".table-responsive").shouldHave( text(mail), text(subject), text("Male"), text(phone), text(currentAddress),
                text(dateBirth), text(firstName),text(lastName), text("Sports"), text("avatar.jpg"));
    }
}
