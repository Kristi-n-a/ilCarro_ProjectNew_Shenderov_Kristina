package com.ilCarroNewQa25;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

public class HeaderTests extends TestBase{
    @BeforeMethod
    public void findElementSearch(){
        System.out.println("" + isPresentElementSearch());
        System.out.println(" " + isPresentElementLetTheCar());
        System.out.println("" + isPresentElementSingUp());
        System.out.println("" + isPresentElementLogIn());
    }

    @Test
    public void testsHeader(){

        click(By.xpath(" //header/section[1]/ul[1]/li[1]/a[1]"));
        click(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]"));
        click(By.cssSelector("[href=\"/signup\"]"));
        click(By.cssSelector("[href=\"/login\"]"));
    }

}
