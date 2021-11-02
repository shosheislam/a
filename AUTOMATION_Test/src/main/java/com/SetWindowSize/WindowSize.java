package com.SetWindowSize;

import com.TestBase.Base;
import org.openqa.selenium.Dimension;

public class WindowSize extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://www.google.com");
        GetWindowsize();
        SetWindowsize(400,500);


    }
    public static void GetWindowsize(){
        int height=driver.manage().window().getSize().getHeight();
        int width=driver.manage().window().getSize().getWidth();
        System.out.println("Full Window Height: "+height);
        System.out.println("Full Window Width: "+width);
    }

    public static void SetWindowsize(int Width,int Height){
        driver.manage().window().setSize(new Dimension(Width,Height));

        int height=driver.manage().window().getSize().getHeight();
        int width=driver.manage().window().getSize().getWidth();
        System.out.println("New Window Height: "+height);
        System.out.println("New  Window Width: "+width);
    }
}
