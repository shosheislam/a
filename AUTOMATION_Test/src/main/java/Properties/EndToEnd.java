package Properties;

import OpenCart.Login;
import OpenCart.Logout;
import com.TestBase.Base;

import java.io.IOException;

public class EndToEnd extends Base {
    public static void main(String[] args) throws IOException {
        Chrome_launch();
        OpenUrl("https://demo.opencart.com/");
        PropertiesWithRegistration.OpenRegister_Page();
        RandomEmail();
        PropertiesWithRegistration.TC_PropertiesWithRegister();
        Logout.Logout();
        PropertiesWithLogin.OpenLogin_Page();
        PropertiesWithLogin.TC_Login();

        Logout.Logout();

    }
}
