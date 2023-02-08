package Telusko.InnerClass;

public class AnonymousClass {
    public static void main(String[] args) {
        Outer2 obj = new Outer2() // here i don't put semicolon
                    {
                        public void show(){
                        System.out.println("I am show method of Anonymous class");
                        }
                    }; // here i put semi colon

        obj.show(); // this call show method of AnonymousClass class not Outer class show method
    }
}

class Outer2{
    int k;
        public void show(){
            System.out.println("I am show method of Inner2 class");
        }
}
