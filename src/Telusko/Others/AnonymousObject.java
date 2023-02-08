package Telusko.Others;

public class AnonymousObject {
    public static void main(String[] args) {
        // if you want to call method only one time in entire code that time we use Anonymous object
        // as Anonymous object don't take space in stack bcoz we don't use reference variable of object
        // Anonymous object it take memory in heap temporarily bcoz after garbage collection it will remove that space also

       /* X obj = new X();
        obj.show(); */ // if we use this it take space in stack and heap

        new X().show(); // it take temporarily space in heap only

    }
}

class X{
    int k;
    public void show(){

    }
}
