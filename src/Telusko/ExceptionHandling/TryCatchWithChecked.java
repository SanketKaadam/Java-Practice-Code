package Telusko.ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryCatchWithChecked {
    public static void main(String[] args) {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        int i=100;
        int k=0;

        try {
            int j= Integer.parseInt(br.readLine());
            k=i/j;
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(k);
    }
}