package com.Dropdown;

import com.TestBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AboutDropdown extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://the-internet.herokuapp.com/dropdown");
       // SelectByIndex();
       // SelectByValue();
        SelectByVisibleText();

    }
    public static void SelectByIndex(){
        WebElement Dropdown= driver.findElement(By.id("dropdown"));
        Select Obj=new Select(Dropdown);
        Obj.selectByIndex(2);

    }
    public static void SelectByValue(){
        WebElement Dropdown= driver.findElement(By.id("dropdown"));
        Select Obj=new Select(Dropdown);
        Obj.selectByValue("1");

    }
    public static void SelectByVisibleText(){
        WebElement Dropdown= driver.findElement(By.id("dropdown"));
        Select Obj=new Select(Dropdown);
        Obj.selectByVisibleText("Option 1");

    }
}
