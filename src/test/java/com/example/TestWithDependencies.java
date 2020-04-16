package com.example;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestWithDependencies {

    @Test
    void startCar()
    {
        System.out.println("Car started");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("Car driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"driveCar", "stopCar"})
    void parkCar()
    {
        System.out.println("Car parked");
    }

}
