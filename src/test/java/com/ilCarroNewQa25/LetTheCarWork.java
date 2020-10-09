package com.ilCarroNewQa25;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LetTheCarWork extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {

        isPresentElementLetTheCar();
        click(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]"));
    }
    @Test
    public void testFormLetTheCarWork(){
        // click(By.cssSelector(".let-carwork-style_let_car__location__30BIh"));

        NewCar(
                new NewCar().setCountri("Israel").setAddress("Balfour Street").setDistance("500")
                        .setSerial_numb("123-45-677").setBrand("Volksvagen").setModel("Bora")
                        .setYear("2002").setEngine("1.8").setFuel("8").setFuel1("petrol")
                        .setTransmision("automatic").setWd("fghj").setHorsepower("110").setTorque("3456")
                        .setDoors("5").setSeats("4").setClas("E").setAbout("dsfghj")
                        .setType("ghj").setPrice("97"));

        submitForm();

    }

    @Test
    public void testFormLetTheCarWork2(){
        // click(By.cssSelector(".let-carwork-style_let_car__location__30BIh"));

        NewCar(
                new NewCar().setCountri("Israel").setAddress("Anna Frank Street").setDistance("500")
                        .setSerial_numb("123-23-347").setBrand("BMV").setModel("118i")
                        .setYear("2015").setEngine("1.8").setFuel("8").setFuel1("petrol")
                        .setTransmision("automatic").setWd("fghj").setHorsepower("130").setTorque("5467")
                        .setDoors("5").setSeats("4").setClas("A").setAbout("asdfgt")
                        .setType("lgkgjkddjkskld").setPrice("456"));

        submitForm();

    }

    public void NewCar(NewCar newCar) {
        type(By.cssSelector("[name='country']"), newCar.getCountri());
        type(By.cssSelector(".address"), newCar.getAddress());
        type(By.cssSelector(".distance_included"), newCar.getDistance());
        type(By.cssSelector(".serial_number"), newCar.getSerial_numb());
        type(By.cssSelector(".brand"), newCar.getBrand());
        type(By.cssSelector(".model"), newCar.getModel());
        type(By.cssSelector(".year"), newCar.getYear());
        type(By.cssSelector(".engine"), newCar.getEngine());
        type(By.cssSelector(".fuel_consumption"), newCar.getFuel());
        type(By.cssSelector(".fuel"), newCar.getFuel1());
        type(By.cssSelector(".transmition"), newCar.getTransmision());
        type(By.cssSelector(".wd"), newCar.getWd());
        type(By.cssSelector(".horsepower"), newCar.getHorsepower());
        type(By.cssSelector(".torque"), newCar.getTorque());
        type(By.cssSelector(".doors"), newCar.getDoors());
        type(By.cssSelector(".seats"), newCar.getSeats());
        type(By.cssSelector(".class"), newCar.getClas());
        type(By.cssSelector("[name='about']"), newCar.getAbout());
        type(By.cssSelector(".type_feature"), newCar.getType());
        type(By.cssSelector(".price"), newCar.getPrice());

    }
}


