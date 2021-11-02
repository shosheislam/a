package com.BrawserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrawserLaunch {
    public static WebDriver driver;
    public static void main(String[] args) {
        //Chrome_launch();
       // Chrome_close();
        Firefox_launch();
        Firefox_close();

    }
    public static void Chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
    }
    public static void  Chrome_close(){
        driver.close();
    }
    public static void Firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }
    public static void  Firefox_close(){
        driver.close();
    }
}
