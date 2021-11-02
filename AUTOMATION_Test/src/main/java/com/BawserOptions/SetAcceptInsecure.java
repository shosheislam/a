package com.BawserOptions;

import com.TestBase.Base;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SetAcceptInsecure extends Base {
    public static void main(String[] args) {
        Browser_SetAcceptInsecure();

    }
    public static void Browser_SetAcceptInsecure(){
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        FirefoxOptions fireObj=new FirefoxOptions();
        fireObj.setAcceptInsecureCerts(true);
        driver=new FirefoxDriver();
        driver.get("https://www.cacert.org/");
        System.out.println(driver.getTitle());
    }
}
