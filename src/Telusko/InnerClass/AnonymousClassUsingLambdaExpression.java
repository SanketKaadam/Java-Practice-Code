package Telusko.InnerClass;

public class AnonymousClassUsingLambdaExpression {
    public static void main(String[] args) {
      /*  A obj = ()->{
            System.out.println("I implemented display method in Main class ");
        }; */

        A obj = ()-> System.out.println("I implemented display method in Main class");
        // this also work
        obj.display();
    }
}

interface A{
    void display();
}
