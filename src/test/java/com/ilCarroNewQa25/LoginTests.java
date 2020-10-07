package com.ilCarroNewQa25;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        if (!isLoginFormPresent()) {
            if (isUserLoggedIn()) {
                logOut();
            }
            ClickLogInTabInHeader();
        }
    }

    @Test
    public void loginRegisteredUserPositiveTest() {

        //do not forget to change at startup
        fillLoginForm(new User()
                .withEmail("ssdd@67kk.com")
                .withPassword("1234567123Df"));
        //submit login
        submitForm();
        Assert.assertTrue(isUserLoggedIn());
        String email = wd.findElement(By.cssSelector("[href='/account']")).getText();
        System.out.println(email);
        Assert.assertEquals(email, "ssdd@67kk.com");
    }
    public void fillLoginForm(User user) {
        type(By.name("email"), user.getEmail());
        type(By.name("password"),user.getPassword());
    }
}