package Telusko.ExceptionHandling;

public class TryCatchBlock {
    public static void main(String[] args) {
        int i=8;
        int j=0;
        int k=0;

        try {
            k=i/j;  // bcoz of this try and catch program flow is not stop here
        }catch (Exception e){
            System.out.println("Can't divide by zero ");
        }
        System.out.println(k); //
    }
}
