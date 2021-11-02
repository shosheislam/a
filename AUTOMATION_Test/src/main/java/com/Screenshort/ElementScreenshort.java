package com.Screenshort;

import com.TestBase.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class ElementScreenshort extends Base {
    public static void main(String[] args) throws IOException {
        Chrome_launch();
        OpenUrl("https://demo.opencart.com/");
        Element_screenshort("CartImage");

    }
    public static void Element_screenshort(String name) throws IOException {
        WebElement btn= driver.findElement(By.cssSelector("#cart-total"));
        //Capture
        File srcfile=((TakesScreenshot)btn).getScreenshotAs(OutputType.FILE);
        //save
        FileUtils.copyFile(srcfile,new File("./src/main/Screenshorts/"+name+".jpg"),true);
        System.out.println("Image capture and save");
    }
}
