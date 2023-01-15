package demoqa.tests;

import org.junit.jupiter.api.Test;

public class PracticeFormTest extends BaseTest {

    String firstName = "Mike";
    String lastName = "Smith";
    String gender = "Male";
    String mail = "MikeSmith@gmail.com";
    String phone = "1234567891";
    String dateBirth = "24 October,1987";
    String subject = "English";
    String currentAddress = "750 Kearny St, San Francisco";
    String month = "October";
    String year = "1987";
    String day = "24";
    String hobbies = "Sports";
    String pathToImage = "jpg/avatar.jpg";
    String image = "avatar.jpg";
    String state = "NCR";
    String city = "Noida";

    @Test
    void practiceFormTest(){

        //заполнение формы
        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setMail(mail)
                .setGender(gender)
                .setPhone(phone)
                .setBirthDate(day, month, year)
                .setSubject(subject)
                .setHobbies(hobbies)
                .uploadImage(pathToImage)
                .setAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .submitForm();

        //проверка результатов
        registrationPage.verifyModalAppears()
                .verifyResult("Student Name",firstName + " " + lastName)
                .verifyResult("Student Email",mail)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", phone)
                .verifyResult("Date of Birth", dateBirth)
                .verifyResult("Subjects", subject)
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Picture", image)
                .verifyResult("Address", currentAddress)
                .verifyResult("State and City", state + " " + city);
    }
}
