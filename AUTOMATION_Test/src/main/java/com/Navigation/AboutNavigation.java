package com.Navigation;

import com.TestBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AboutNavigation extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://demo.opencart.com/");
        Navigation_To();

        Navigation_Forward();
       // Navigation_Back();
       // Navigation_Refresh();

    }

    public static void Navigation_To(){
        driver.navigate().to("https://google.com");
        System.out.println(driver.getTitle());
    }

    public static void Navigation_Forward(){
        driver.navigate().forward();
        System.out.println(driver.getTitle());
    }
    public static void Navigation_Back(){
        driver.navigate().back();
        System.out.println(driver.getTitle());
    }

    public static void Navigation_Refresh(){
        WebElement Search= driver.findElement(By.name("search")) ;
        Search.sendKeys("macbook");
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
    }





}
