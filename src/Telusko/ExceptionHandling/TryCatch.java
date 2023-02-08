package Telusko.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int i=10;
        int j=2;
        int k=0;
        int[] l = new int[5];

        try {
            k=i/j;

            for (int a = 0; a <=5; a++) {
                l[a]=a+a;
            }

        }catch (ArithmeticException e){
            System.out.println("we can't divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array size wrongly define");
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println(k);
    }
}
