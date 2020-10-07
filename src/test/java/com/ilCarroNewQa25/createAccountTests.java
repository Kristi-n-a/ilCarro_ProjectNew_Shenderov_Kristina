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
        public void testSingUp(){
            click(By.cssSelector("[href='/signup']"));
            Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

            type(By.cssSelector("#first_name"), "KR");
            type(By.cssSelector("#second_name"),"SH");
            //do not forget to change at startup
            type(By.cssSelector("#email"),"mb@xs113.com.com");
            type(By.cssSelector("#password"),"123456789Ah");

            click(By.cssSelector("#check_policy"));


            submitForm();

            Assert.assertTrue(isLoginFormPresent());

        }

}

