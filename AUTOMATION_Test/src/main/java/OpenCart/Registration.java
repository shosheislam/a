package OpenCart;

import com.TestBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Registration extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://demo.opencart.com/");
        OpenRegister_Page();
        TC_Register();

    }
    public static void OpenRegister_Page(){
        WebElement MyAccount= driver.findElement(By.linkText("My Account"));
        MyAccount.click();
        WebElement Register= driver.findElement(By.linkText("Register"));
        Register.click();
    }
    protected static String RandomName(){
        String SALTCHAR="ABCDEFGHIJ123456789";
        StringBuilder salt=new StringBuilder();
        Random rnd=new Random();
        while (salt.length()<5){
            int index=(int)(rnd.nextFloat()*SALTCHAR.length());
            salt.append(SALTCHAR.charAt(index));
        }
        String saltstr= salt.toString();
        return saltstr;
    }

    public static void TC_Register(){
        String Email=RandomName().concat("@gmail.com");
        WebElement FirstName= driver.findElement(By.name("firstname"));
        FirstName.sendKeys("Khadija");
        WebElement LastName= driver.findElement(By.name("lastname"));
        LastName.sendKeys("Akter");
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys(Email);
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
