package demoqa.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class PracticeFormTest extends BaseTest {

    @Test
    @Tag("form")
    void practiceFormTest(){

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открытие страницы с формой", () -> {
            registrationPage.openPage();
        });
        step("Ввод имени", () ->{
            registrationPage.setFirstName(testData.firstName);
        });
        step("Ввод фамилии", () ->{
            registrationPage.setLastName(testData.lastName);
        });
        step("Ввод email", () ->{
            registrationPage.setMail(testData.mail);
        });
        step("Выбор пола", () ->{
            registrationPage.setGender(testData.gender);
        });
        step("Ввод телефонного номера", () ->{
            registrationPage.setPhone(testData.phone);
        });
        step("Выбор даты рождения", () ->{
            registrationPage.setBirthDate(testData.day, testData.month, testData.year);
        });
        step("Выбор предметов", () ->{
            registrationPage.setSubject(testData.subject);
        });
        step("Выбор хобби", () ->{
            registrationPage.setHobbies(testData.hobbies);
        });
        step("Загрузка изображения", () ->{
            registrationPage.uploadImage(testData.pathToImage);
        });
        step("Ввод адресса", () ->{
            registrationPage.setAddress(testData.currentAddress);
        });
        step("Выбор штата", () ->{
            registrationPage.setState(testData.state);
        });
        step("Выбор города", () ->{
            registrationPage.setCity(testData.city);
        });
        step("Нажатие на кнопку submit", () ->{
            registrationPage.submitForm();
        });


        step("Проверка результата: Открытие модального окна с результатами", () ->{
            registrationPage.verifyModalAppears();
        });
        step("Проверка результата: Имя и фамилия соответствует введенному значению", () ->{
            registrationPage.verifyResult("Student Name",testData.firstName + " " + testData.lastName);
        });
        step("Проверка результата: Email соответствует введенному значению", () ->{
            registrationPage.verifyResult("Student Email",testData.mail);
        });
        step("Проверка результата: Пол соответствует выбранному значению", () ->{
            registrationPage.verifyResult("Gender", testData.gender);
        });
        step("Проверка результата: Телефон соответствует введенному значению", () ->{
            registrationPage.verifyResult("Mobile", testData.phone);
        });
        step("Проверка результата: Дата рождения соответствует выбранному значению", () ->{
            registrationPage.verifyResult("Date of Birth", testData.dateBirth);
        });
        step("Проверка результата: Предмет соответствует выбранному значению", () ->{
            registrationPage.verifyResult("Subjects", testData.subject);
        });
        step("Проверка результата: Хобби соответствует выбранному значению", () ->{
            registrationPage.verifyResult("Hobbies", testData.hobbies);
        });
        step("Проверка результата: Название изображения соответствует выбранному значению", () ->{
            registrationPage.verifyResult("Picture", testData.image);
        });
        step("Проверка результата: Адресс соответствует введенному значению", () ->{
            registrationPage.verifyResult("Address", testData.currentAddress);
        });
        step("Проверка результата: Город и штат соответствует выбранному значению", () ->{
            registrationPage.verifyResult("State and City", testData.state + " " + testData.city);
        });
    }
}
