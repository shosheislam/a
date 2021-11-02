package com.BrowserOpen;

import com.TestBase.Base;

public class OpenWebsite extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://www.google.com");

    }
   // public static void OpenUrl(){
       // driver.get("https://www.google.com");
   // }

}
