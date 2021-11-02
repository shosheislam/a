package OpenCart;

import com.TestBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://demo.opencart.com/");
        OpenLogin_Page();
        TC_Login();

    }
    public static void OpenLogin_Page(){
        WebElement MyAccount=driver.findElement(By.linkText("My Account"));
        MyAccount.click();
        WebElement Login= driver.findElement(By.linkText("Login"));
        Login.click();
    }
    public static void TC_Login(){
        WebElement Email= driver.findElement(By.name("email"));
        Email.sendKeys("khadija309@gmail.com");
        WebElement Password= driver.findElement(By.name("password"));
        Password.sendKeys("12345");
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();
    }

}
