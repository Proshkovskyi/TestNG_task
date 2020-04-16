package com.example;

import org.testng.annotations.Test;

public class TestWithPriority {

    @Test(priority = 3)
    void test1()
    {
        System.out.println("this is test1");
    }

@Test(priority = 2)
    void test2()
    {
        System.out.println("this is test2");
    }

@Test(priority = 1)
    void test3()
    {
        System.out.println("this is test3");
    }

@Test(priority = 0, enabled = false)
    void test4()
    {
        System.out.println("this is test4");
    }


}
