package Properties;

import com.TestBase.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties extends Base {
    public static void main(String[] args) throws IOException {
        Chrome_launch();
        Read_Properties();

    }
    public static void Read_Properties() throws IOException {
        FileInputStream fis=new FileInputStream("./src/main/resources/Data.Properties");
        Properties pro=new Properties();
        pro.load(fis);
        System.out.println(pro.getProperty("name"));

    }
}
