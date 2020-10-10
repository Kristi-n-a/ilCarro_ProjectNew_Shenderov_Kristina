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
    public void testSignUp() throws InterruptedException {
        click(By.cssSelector("[href='/signup']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
        fillRegistrationForm(
                new User()
                        .withFirstName("JPUY")
                        .withSecondName("VQU")
                        .withEmail("Lisa44@gmail.com")
                        .withPassword("3Wqwtrewww"));

        click(By.cssSelector("#check_policy"));
        pause(2000);
        submitForm();

        Assert.assertTrue(isLoginFormPresent());
    }

    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
    @Test
    public void testSignUpWithOutPassword() throws InterruptedException {

        click(By.cssSelector("[href='/signup']"));
       Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

        fillRegistrationForm(new User()
                .withFirstName("Viktoria")
                .withSecondName("Fols")
                .withEmail("viktoria.katz1@gmail.com"));


        click(By.cssSelector("#check_policy"));
        pause(3000);

        //click submit button
        // submitForm();

      Assert.assertTrue(isLoginFormPresent());
    }
        public void fillRegistrationForm(User user) {
            type(By.name("first_name"), user.getFirstName());
            type(By.name("second_name"), user.getSecondName());
            type(By.name("email"), user.getEmail());
            type(By.name("password"), user.getPassword());
        }


    }