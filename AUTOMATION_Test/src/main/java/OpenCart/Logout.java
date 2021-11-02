package OpenCart;

import com.TestBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://demo.opencart.com/");
        Login.OpenLogin_Page();
        Login.TC_Login();
        Logout();

    }
    public static void Logout(){
        WebElement Logout= driver.findElement(By.linkText("Logout"));
        Logout.click();

    }
}
