package Telusko.InnerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner obj2 = obj.new Inner();
        obj.i=100;
        obj2.show();
        // obj.show(); this not work
    }
}

class Outer {
    int  i;
    class Inner {
        public void show(){
            System.out.println("I am show method of Outer class");
        }
    }
}
