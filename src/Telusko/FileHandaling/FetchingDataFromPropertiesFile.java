package Telusko.FileHandaling;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class FetchingDataFromPropertiesFile {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        InputStream is = new FileInputStream("dataConfig.properties");
        p.load(is);

        System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("uName"));

        p.list(System.out);
    }
}
