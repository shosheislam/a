package com.BawserOptions;

import OpenCart.Registration;
import com.TestBase.Base;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SetHeadless extends Base {
    public static void main(String[] args) {
        Browser_SetHeadless();

    }
    public static void Browser_SetHeadless(){
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        FirefoxOptions fireObj=new FirefoxOptions();
        fireObj.setHeadless(true);
        driver=new FirefoxDriver(fireObj);
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        Registration.TC_Register();
        System.out.println("Registration succesfully");

    }
}
