package com.ilCarroNewQa25;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class createAccountTests extends TestBase {
        @BeforeMethod
        public void ensurePreconditions() {
            if (!isSignUpTabPresentInHeader()) {
                logOut();
            }
        }

    @Test
        public void testSingUp() throws InterruptedException {
            click(By.cssSelector("[href='/signup']"));
            Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
           fillRegistrationForm(new User()
                   .withfirstName("Kr")
                   .withsecondName("SH")
                   .withEmail("df@Jk876.com")
                   .withPassword("98765432Ad"));
//переписать нехватает метода без пароля,потом его добавить
        click(By.cssSelector("#check_policy"));

        pause(2000);

        submitForm();

            Assert.assertTrue(isLoginFormPresent());

        }

    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    @Test
    public void testSingUp1(){
        click(By.cssSelector("[href='/signup']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

        fillRegistrationForm(new User()
                .withfirstName("Moly")
                        .withsecondName("Bgty")
                        .withEmail("Fg76Yt@Sd.com")
                        .withPassword("24354657Kl"));

        click(By.cssSelector("#check_policy"));


        submitForm();

        Assert.assertTrue(isLoginFormPresent());

    }

    public void fillRegistrationForm(User user) {
        type(By.name("first_name"), user.getFirstName());
        type(By.name("second_name"), user.getSecondName());
        //do not forget to change at startup
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

}

