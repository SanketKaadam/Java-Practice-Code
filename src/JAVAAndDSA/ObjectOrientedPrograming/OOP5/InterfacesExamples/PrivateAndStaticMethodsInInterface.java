package JAVAAndDSA.ObjectOrientedPrograming.OOP5.InterfacesExamples;

interface Demo2{
    private void sum(int a, int b){
        System.out.println("Sum method in interface" + (a+b));
    }

  /*  protected void fun(){
        // protected is not allowed
    } */

    static void mul(int a, int b){
        System.out.println("mul method in interface " + a*b);
        div(a,b); // here i am call static and private div method
        // sum(a,b); we can't call non-static sum method in static mul method
    }

    private static void div(int a, int b){
        System.out.println("div method in interface " + a/b);
    }

    void print(int a, int b); // abstract and public by default

    default void allMethod(int a, int b){
        sum(a,b);
    }


}

class DemoClass implements Demo2{
    public void print(int a, int b){ // here i give body to abstract method
        System.out.println("print "+ a + " "+b);
    }

}

public class PrivateAndStaticMethodsInInterface {
    public static void main(String[] args) {
        Demo2.mul(10,20); // static method so we can access without object
       // Demo2.div(100,200); give error, its static method but it private also
        // Demo2.sum(5,5); give error bcoz its not static method and private also

        DemoClass obj = new DemoClass();
       // obj.sum(30,40); we can't access private methods by using object also
       // obj.mul(30,40); we can't access static method by using object also
       // obj.div(50,5); we can't access private and static method by using object also

        obj.print(10,20);
        // Demo2.sum(10,20); we can't access private methods by using interface  also
        Demo2.mul(10,20);
        // Demo2.div(20,10); we can't access private and static methods by using interface also

        obj.allMethod(10,20); //by using default allMethod method we called private sum method
        // Demo2.allMethod(10,20); bcoz default allMethod is not static so we need object to call non-static method
    }
}
