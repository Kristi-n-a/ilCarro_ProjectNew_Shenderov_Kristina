package com.ilCarroNewQa25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {

       static WebDriver wd;

        @BeforeSuite
        public void setUp(){
            wd = new ChromeDriver();
            wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            wd.manage().window().maximize();
            wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
        }

        public boolean isElementPresent(By locator){
            return wd.findElements(locator).size()>0;
        }

        public void isFindFormPresent(){
            //return  isFindCarFormPresent(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
        }

        public boolean isFindCarFormPresent(){
            return wd.findElements(By.cssSelector(".Main_mainpage__find_your_car__AHLkw")).size()>0;
        }

        public boolean isFindCarFormPresent2(){
            try{
                wd.findElements(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
                return true;
            } catch(NoSuchElementException ex){
                return false;
            }
        }
        public boolean isPresentElementSearch(){
            try{
                wd.findElements(By.xpath(" //header/section[1]/ul[1]/li[1]/a[1]"));
                return true;
            }catch(org.openqa.selenium.NoSuchElementException ex){
                return false;
            }
        }
        public boolean isPresentElementLetTheCar(){
            return wd.findElements(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]")).size()>0;
        }

        public boolean isPresentElementSingUp(){
            try{
                wd.findElements(By.cssSelector("[href=\"/signup\"]"));
                return true;
            }catch (NoSuchElementException ex) {
                return false;
            }
        }
        public boolean isPresentElementLogIn(){
            return wd.findElements(By.cssSelector("[href=\"/login\"]")).size()>0;
        }

        @AfterSuite(enabled = false)
        public void tearDown(){
            wd.quit();
        }

    protected boolean isLoginFormPresent() {
            return isElementPresent(By.cssSelector(".Login_login__right_block__1niYm"));
    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
            wd.findElement(locator).click();
        }

    public void submitForm() {
            new WebDriverWait(wd,15).until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='submit']"))).click();
    }

    public boolean isSignUpPresentInHeader() {
        return isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void logOut() {
        click(By.cssSelector("//a[contains(., 'logOut')]"));
    }

    public void ClickLogInTabInHeader() {
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(., 'logOut')]"));
    }
}

