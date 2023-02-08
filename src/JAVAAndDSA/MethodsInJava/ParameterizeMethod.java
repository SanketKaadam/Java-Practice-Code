package JAVAAndDSA.MethodsInJava;

public class ParameterizeMethod {
    public static void main(String[] args) {
        sum(10,20);
    }

    static void sum(int n1, int n2){
        int total = n1+n2;
        System.out.print("Addition is: "+total);
    }
}
