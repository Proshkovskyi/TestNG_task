package com.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersWithDataProvider {


//    @Parameters({"username", "password"})

    @Test(dataProvider = "LoginDataProvider")
    public void TestParametersWithDataProvider(String email, String password){
        System.out.println(email + "   " + password);
    }



    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData(){

        Object[][] data={ {"abc@gmail.com", "abc"}, {"qwe@gmail.com", "qwe"},{"asd@gmail.com", "asd"}};
        return data;
    }


}
