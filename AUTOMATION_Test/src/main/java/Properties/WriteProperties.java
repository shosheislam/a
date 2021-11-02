package Properties;

import com.TestBase.Base;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties extends Base {
    public static void main(String[] args) throws IOException {
        Chrome_launch();
        WriteProperties();

    }
    public static void WriteProperties() throws IOException {
        FileOutputStream fis=new FileOutputStream("./src/main/resources/Data.Properties");
        Properties pro=new Properties();
        pro.setProperty("name","Khadija");
        pro.setProperty("password","12345");
        pro.store(fis,null);


    }
}
