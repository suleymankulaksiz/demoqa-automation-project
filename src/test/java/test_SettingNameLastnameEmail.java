import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test_SettingNameLastnameEmail extends BaseTest {



    @Test
    public void setName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("DenemeAd");
        Assertions.assertEquals("DenemeAd",practiceFormPage.getName(),"Name value is not correct");
    }

    @Test
    public void setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("DenemeSoyad");
        Assertions.assertEquals("DenemeSoyad",practiceFormPage.getLastName(),"LastName value is not correct");


    }

    @Test
    public void email(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("deneme@gmail.com");
        Assertions.assertEquals("deneme@gmail.com",practiceFormPage.getEmail(),"Email value is not correct");


    }




}
