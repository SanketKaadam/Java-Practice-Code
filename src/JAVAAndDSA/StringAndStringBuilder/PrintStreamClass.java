package JAVAAndDSA.StringAndStringBuilder;

public class PrintStreamClass {
    public static void main(String[] args) {
        System.out.println();
        // internally println is method of PrintStream class and it call .valueOf and valueOf call .toString method this is the flow internally
        // Arrays.toString is different it is used to represent array only

        // Pretty Printing in java

        float a= 453.1274f;
        System.out.printf("floating no is: % .2f",a);
        System.out.printf("My name is %s and i am %s","sanket", "cool");
        // sanket replace with 1st %s and cool replace with 2nd %s
    }
}
