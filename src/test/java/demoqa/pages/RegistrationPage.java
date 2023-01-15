package demoqa.pages;

import demoqa.pages.components.CalendarComponent;
import demoqa.pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();
    private final String HEADER_TEXT = "Practice Form";
    private final String TITLE_TEXT = "Student Registration Form";


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".playgound-header").shouldHave(text(HEADER_TEXT));
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value){
        $("#firstName").setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value){
        $("#lastName").setValue(value);
        return this;
    }

    public RegistrationPage setMail(String value){
        $("#userEmail").setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value){
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage setPhone(String value){
        $("#userNumber").setValue(value);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubject(String value){
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String value){
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadImage(String path){
        $("#uploadPicture").uploadFromClasspath(path);
        return this;
    }

    public RegistrationPage setAddress(String value){
        $("#currentAddress").setValue(value);
        return this;
    }

    public RegistrationPage setState(String value){
        $("#state").click();
        $(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity(String value){
        $("#city").click();
        $(byText(value)).click();
        return this;
    }

    public RegistrationPage submitForm(){
        $("#submit").click();
        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {
        registrationResultsModal.verifyResult(key,value);
        return this;
    }

    public RegistrationPage verifyModalAppears() {
        registrationResultsModal.verifyModalAppears();
        return this;
    }

}
