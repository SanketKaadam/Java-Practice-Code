package JAVAAndDSA.BitwiseOperatorNumberSystem;

public class Question4 {
    // find ith bit of Number 10110110
    public static void main(String[] args) {
       int n=10110110;
       int i =5;
        System.out.println(Integer.toBinaryString(n&(1<<(i-1)))); // 2 raised to 4 is 16 that's why output is in bit 10000
        //   10110110
        //   00010000
        //   ---------
        //   00010000    we ignore left side zeros
        //  10000 = 16 in decimal
    }
}
