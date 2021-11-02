package Properties;

import com.TestBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesWithLogin extends Base {
    public static void main(String[] args) throws IOException {
        Chrome_launch();
        OpenUrl("https://demo.opencart.com/");
        OpenLogin_Page();
        RandomEmail();
        TC_Login();

    }
    public static void OpenLogin_Page(){
        WebElement MyAccount=driver.findElement(By.linkText("My Account"));
        MyAccount.click();
        WebElement Login= driver.findElement(By.linkText("Login"));
        Login.click();
    }
    public static void TC_Login() throws IOException {
        FileInputStream fis=new FileInputStream("./src/main/resources/Data.Properties");
        Properties pro=new Properties();
        pro.load(fis);
        WebElement Email= driver.findElement(By.name("email"));
        Email.sendKeys(pro.getProperty("RandomName"));
        WebElement Password= driver.findElement(By.name("password"));
        Password.sendKeys("12345");
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();
    }

}
