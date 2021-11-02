package com.BawserOptions;

import com.TestBase.Base;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class SetBinary extends Base {
    public static void main(String[] args) {

        BrowserSetBinary();

    }
    public static void BrowserSetBinary(){
      System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
      FirefoxOptions fireObj=new FirefoxOptions();
      fireObj.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe")));
      driver=new FirefoxDriver();
      driver.get("https://google.com");

    }
}
