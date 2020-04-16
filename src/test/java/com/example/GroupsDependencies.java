package com.example;
import org.testng.annotations.*;
public class GroupsDependencies {

     @BeforeGroups("database")
    public void setupDB(){
        System.out.println("setupDB()");
    }

    @AfterGroups("database")
    public void cleanDB() {
        System.out.println("cleanDB");
    }

    @Test(groups= "selenium-test")
    public void runSelenium1() {
        System.out.println("runSelenium()1");
    }

    @Test(groups = "database")
    public void testConnectOracle() {
        System.out.println("testConnectOracle");
    }

    @Test(dependsOnGroups = {"database", "selenuim-test"})
    public void runFinal() {
        System.out.println("runFinal");
    }

}
