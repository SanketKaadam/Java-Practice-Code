package Telusko.Others;

public class CountNumberOfObjectsCreated {
    public static void main(String[] args) {
        P obj1 = new P(); // at every new object creation constructor will call
        P obj2 = new P();
        P obj3 = new P();
        P obj4 = new P();
        obj4.count();
    }
}

class P{
    static int i; // check notes why we use static here
    public P(){
        i++;
    }

    public void count(){
        System.out.println(i);
    }
}
