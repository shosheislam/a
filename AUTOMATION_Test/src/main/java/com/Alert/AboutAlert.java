package com.Alert;

import com.TestBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AboutAlert extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://the-internet.herokuapp.com/javascript_alerts");
        // NormalAlert();
        //ConfirmAlert();
        PromptAlert();

    }
    public static void NormalAlert(){
        WebElement AlertBtn= driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button"));
        AlertBtn.click();
        driver.switchTo().alert().accept();
    }
    public static void ConfirmAlert(){
        WebElement AlertBtn= driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button"));
        AlertBtn.click();
        // driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
    }
    public static void PromptAlert(){
        WebElement AlertBtn= driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button"));
        AlertBtn.click();
        driver.switchTo().alert().sendKeys("automation");
        driver.switchTo().alert().accept();
    }
}
