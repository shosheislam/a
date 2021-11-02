package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DP_ProviderLoginTest {
    public static WebDriver driver;
    @BeforeClass
    public static void initiSetup(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");

    }
    @AfterClass
    public static void teardown(){
        driver.quit();

    }
    @DataProvider(name = "LoginData")
    public Object [][] data(){
        Object[][] data=new Object[3][2];
        //Set1
        data[0][0]="shoshe@gmail.com";
        data[0][1]="12345";
        //set2
        data[1][0]="khadija2gmail.com";
        data[1][1]="4569";
        //set3
        data[2][0]="khadijaakter@gmail.com";
        data[2][1]="456";
        return data;

    }
    @Test(dataProvider = "LoginData")
    public static void TC_Login1(String DP_Email,String DP_Password) throws InterruptedException {
        WebElement Email= driver.findElement(By.name("email"));
        Email.clear();
        Email.sendKeys(DP_Email);
        Thread.sleep(3000);
        WebElement Password= driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys(DP_Password);
        Thread.sleep(3000);
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();
        System.out.println("login1 execute");
    }



}
