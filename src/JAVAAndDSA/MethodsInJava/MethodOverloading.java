package JAVAAndDSA.MethodsInJava;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(10);
        sum(10,20);
        sum(10,20.5f);
    }
    static void sum(int n1){
        System.out.println(n1);
    }
    static void sum(int n1, int n2){  // here no of arguments are different
        int total = n1+n2;
        System.out.println(total);
    }
    static void sum(int n1, float n2){ // here also two arguments but different datatype
        float total=n1+n2;
        System.out.println(total);
    }
}
