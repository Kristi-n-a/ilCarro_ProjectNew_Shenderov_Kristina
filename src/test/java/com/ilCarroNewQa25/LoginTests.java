package com.ilCarroNewQa25;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions(){
        System.out.println("" + isPresentElementLogIn());
        //goTo login page
        if(!isLoginFormPresent()){
            //if user logged in, click logout, go to login
            if(!isUserLoggedIn()){
                logOut();
            }
            ClickLogInTabInHeader();
        }
    }

    @Test
    public void LoginRegisteredUserPositiveTest(){

        click(By.cssSelector("[href=\"/login\"]"));

        ////do not forget to change at startup
       type(By.name("email"), "mfgr588@gmail.com");
       type(By.name("password"), "123456789Ah");

        submitForm();
    }


}
