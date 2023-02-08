package Telusko.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 8, k=0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int j= Integer.parseInt(br.readLine());
            k=i+j;
            if (k<10){
                throw new IOException();  // forcefully throw error
            }
            System.out.println(k);
        }
        catch (IOException e){
            System.out.println("wrong input");
        }
        catch (ArithmeticException e){
            System.out.println("minimum value");
        }
    }
}
