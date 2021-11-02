package com.TestBase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class Base {
    public static WebDriver driver;

    public static void Chrome_launch() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void Chrome_close() {
        driver.close();
    }

    public static void Firefox_launch() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public static void Firefox_close() {
        driver.close();
    }

    public static void OpenUrl(String URL) {
        driver.get(URL);
    }

    public static String RandomEmail() throws IOException {
        FileOutputStream fis = new FileOutputStream("./src/main/resources/Data.Properties");
        Properties pro = new Properties();
        String SALTCHAR="ABCDEFGHIJ123456789";
        StringBuilder salt=new StringBuilder();
        Random rnd=new Random();
        while (salt.length()<5){
            int index=(int)(rnd.nextFloat()*SALTCHAR.length());
            salt.append(SALTCHAR.charAt(index));
        }
        String saltstr= salt.toString().concat("@gmail.com");
        pro.setProperty("RandomName",saltstr);
        pro.store(fis,null);
        return saltstr;




    }
    public static void PageScreenshort(String name) throws IOException {
        //Capture
        File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //save
        FileUtils.copyFile(srcfile,new File("./src/main/Screenshorts/"+name+".png"),true);
        System.out.println("Image capture and save");

    }
}
