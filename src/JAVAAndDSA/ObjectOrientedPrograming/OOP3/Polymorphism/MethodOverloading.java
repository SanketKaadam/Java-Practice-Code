package JAVAAndDSA.ObjectOrientedPrograming.OOP3.Polymorphism;

public class MethodOverloading {
// compile time or static polymorphism

    public int sum(int a, int b){
        return a+b;
    }

    public String sum(int a, String d){
        return a+d;
    }

    public float sum(int a, float b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverloading ml = new MethodOverloading();

        System.out.println(ml.sum(10,20));
        System.out.println(ml.sum(20,30.5f));
        System.out.println(ml.sum(100,"sanket"));
        System.out.println(ml.sum(100,200,300));

    }
}
