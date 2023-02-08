package JAVAAndDSA.MethodsInJava;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        swap(10,20);
    }

    static void swap(int n1,int n2){ // here i give n1 = 10 and n2 = 20
        int temp = n1;
        n1=n2;
        n2=temp;
        System.out.print("1st No is: "+n1);
        System.out.println();
        System.out.print("2nd No is: "+n2);
    }
}
