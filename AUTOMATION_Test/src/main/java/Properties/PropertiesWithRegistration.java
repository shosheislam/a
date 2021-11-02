package Properties;

import com.TestBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWithRegistration extends Base {
    public static void main(String[] args) throws IOException {
        Chrome_launch();
        OpenUrl("https://demo.opencart.com/");
        OpenRegister_Page();
        RandomEmail();
        TC_PropertiesWithRegister();

    }
    public static void OpenRegister_Page(){
        WebElement MyAccount= driver.findElement(By.linkText("My Account"));
        MyAccount.click();
        WebElement Register= driver.findElement(By.linkText("Register"));
        Register.click();
    }
    public static void TC_PropertiesWithRegister() throws IOException {
        FileInputStream fis=new FileInputStream("./src/main/resources/Data.Properties");
        Properties pro=new Properties();
        pro.load(fis);
        WebElement FirstName= driver.findElement(By.name("firstname"));
        FirstName.sendKeys("Khadija");
        WebElement LastName= driver.findElement(By.name("lastname"));
        LastName.sendKeys("Akter");
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys(pro.getProperty("RandomName"));
        WebElement Telephone= driver.findElement(By.name("telephone"));
        Telephone.sendKeys("01765645648");
        WebElement  Password= driver.findElement(By.name("password"));
        Password.sendKeys("12345");
        WebElement ConfirmPassword= driver.findElement(By.name("confirm"));
        ConfirmPassword.sendKeys("12345");
        WebElement Subscribe= driver.findElement(By.name("newsletter"));
        Subscribe.click();
        WebElement PrivacyPolice= driver.findElement(By.name("agree"));
        PrivacyPolice.click();
        WebElement Continue=driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        Continue.click();

    }
}
