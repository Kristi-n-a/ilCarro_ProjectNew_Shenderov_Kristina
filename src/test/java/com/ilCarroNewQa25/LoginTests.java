package com.ilCarroNewQa25;

import org.openqa.selenium.By;
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
        type(By.name("email"), "ms@xs115.com");
        type(By.name("password"), "1234567Aa");


        //submit login
        submitForm();



    }
}