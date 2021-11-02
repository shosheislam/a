package com.Testng;


import org.testng.annotations.Test;

public class BasicTestng{

    @Test(enabled = false)
    public static void Method1(){
            System.out.println("AUTOMATION");
        }
     @Test(priority = 1)
    public static void Method2(){
        System.out.println("automation2");
     }
     @Test(description ="test description")
    public static void method3(){
        System.out.println("testng");
     }



}
