package com.cybertek.tests.day6_package_practice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {

    @BeforeClass
    public void beforeClass (){
        System.out.println("method running before class");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("---> before method is running...");
    }

    @AfterMethod
    public void
    tearDownClass () {
        System.out.println("---> After method is running...");


    }

    @Test
    public void test1 () {
        System.out.println("running test1....");

        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test2 (){
        System.out.println("Running Test2....");
    }


}
