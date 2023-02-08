package Telusko.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchFinalBlock {
    public static void main(String[] args) {

        BufferedReader br=null;

        int i=100;
        int k=0;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int j= Integer.parseInt(br.readLine());
            k=i/j;


        }catch (Exception e){
            System.out.println(e);
        }

        finally {
            System.out.println("Output is : "+ k);
            System.out.println("Bye");
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }

}
