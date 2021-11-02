package com.Screenshort;

import com.TestBase.Base;
import java.io.IOException;

public class AboutScreenshort extends Base {
    public static void main(String[] args) throws IOException {
        Chrome_launch();
        OpenUrl("https://www.google.com/");
        PageScreenshort("newImage");

    }

}
