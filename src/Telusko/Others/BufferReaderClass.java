package Telusko.Others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferReaderClass {
    public static void main(String[] args) throws IOException {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);
        System.out.println("Enter any No : ");
        int a = Integer.parseInt(br.readLine()); //check notes
        System.out.println(a);
    }
}
