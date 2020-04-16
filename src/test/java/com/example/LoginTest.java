package com.example;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeClass
    public void setup() {
        System.out.println("Setup");
    }

    @AfterClass
    public void teardown() {
        System.out.println("teardown");
    }

    @Test
    public void loginWithValidPasswordTest() {
        Assert.assertEquals(1, 1);
        System.out.println("First testcase");
    }

    @Test
    public void loginWithInvalidPasswordTest() {
        System.out.println("Second testcase");
    }


}