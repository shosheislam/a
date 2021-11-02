package com.VerifyTitle;

import OpenCart.Login;
import com.TestBase.Base;

public class TitleVerify extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://demo.opencart.com/");
        Login.OpenLogin_Page();
       // TC_TitleVerify();
        TC_UrlVerify();
    }
    public static void TC_TitleVerify(){
        String Expected_Title="Account Login";
        String Actual_Title= driver.getTitle();
        if (Expected_Title.equals(Actual_Title)){
            System.out.println("passed Title");
        }
        else {
            System.out.println("fail Title");
        }
    }
    public static void TC_UrlVerify(){
        String Exected_Url="https://demo.opencart.com/index.php?route=account/login";
        String Actual_Url= driver.getCurrentUrl();
        if (Exected_Url.equals(Actual_Url)){
            System.out.println("Pass Url");
        }
        else {
            System.out.println("fail Url");
        }
    }
}
