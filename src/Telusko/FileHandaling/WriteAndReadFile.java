package Telusko.FileHandaling;

import java.io.*;

public class WriteAndReadFile {
    public static void main(String[] args) throws Exception {

        File f = new File("Demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Demo content");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}
