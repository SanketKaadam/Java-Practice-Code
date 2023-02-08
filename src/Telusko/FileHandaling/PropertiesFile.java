package Telusko.FileHandaling;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("dataConfig.properties");
        p.setProperty("url","localhost:3306/myDb");
        p.setProperty("uName","sanket");
        p.setProperty("pass","pass@123");

        p.store(os,null);
    }
}
