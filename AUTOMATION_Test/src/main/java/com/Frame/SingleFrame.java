package com.Frame;

import com.TestBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleFrame extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://the-internet.herokuapp.com/iframe");
        Iframe();


    }
    public static void Iframe(){
        driver.switchTo().frame("mce_0_ifr");
        WebElement FrameBody= driver.findElement(By.id("tinymce"));
        FrameBody.clear();
        FrameBody.sendKeys("automation");

    }
}
