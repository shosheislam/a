package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest3 {
    public static WebDriver driver;
    @BeforeTest
    public static void initiSetup(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");

    }
    @AfterTest
    public static void teardown(){
        driver.quit();

    }
    @Test(priority = 1,description = "Email and password are valid")
    public static void TC_Login1() throws InterruptedException {
        WebElement Email= driver.findElement(By.name("email"));
        Email.clear();
        Email.sendKeys("733B2@gmail.com");
        Thread.sleep(3000);
        WebElement Password= driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("12345");
        Thread.sleep(3000);
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);

        System.out.println("login1 execute");
    }
    @Test(priority = 2,description = "Email valid and password invalid")
    public static void TC_Login2() throws InterruptedException {
        WebElement Email= driver.findElement(By.name("email"));
        Email.clear();
        Email.sendKeys("733B2@gmail.com");
        Thread.sleep(3000);
        WebElement Password= driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("1234");
        Thread.sleep(3000);
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();
        System.out.println("login2 execute");
    }
    @Test(priority = 3,description = "Email and password are invalid")
    public static void TC_Login3() throws InterruptedException {
        WebElement Email= driver.findElement(By.name("email"));
        Email.clear();
        Email.sendKeys("khadija309@gmail.com");
        Thread.sleep(3000);
        WebElement Password= driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("1234");
        Thread.sleep(3000);
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();
        System.out.println("login3 execute");
    }





}
