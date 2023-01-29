package demoqa.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class PracticeFormTest extends BaseTest {

    @Test
    void practiceFormTest(){

        //заполнение формы
        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setMail(testData.mail)
                .setGender(testData.gender)
                .setPhone(testData.phone)
                .setBirthDate(testData.day, testData.month, testData.year)
                .setSubject(testData.subject)
                .setHobbies(testData.hobbies)
                .uploadImage(testData.pathToImage)
                .setAddress(testData.currentAddress)
                .setState(testData.state)
                .setCity(testData.city)
                .submitForm();

        //проверка результатов
        registrationPage.verifyModalAppears()
                .verifyResult("Student Name",testData.firstName + " " + testData.lastName)
                .verifyResult("Student Email",testData.mail)
                .verifyResult("Gender", testData.gender)
                .verifyResult("Mobile", testData.phone)
                .verifyResult("Date of Birth", testData.dateBirth)
                .verifyResult("Subjects", testData.subject)
                .verifyResult("Hobbies", testData.hobbies)
                .verifyResult("Picture", testData.image)
                .verifyResult("Address", testData.currentAddress)
                .verifyResult("State and City", testData.state + " " + testData.city);
    }
}
