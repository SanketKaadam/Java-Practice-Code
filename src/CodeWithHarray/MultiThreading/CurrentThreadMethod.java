package CodeWithHarray.MultiThreading;

class CurrentThreadDemo extends Thread{
    public void run(){

    }
}

public class CurrentThreadMethod {
    public static void main(String[] args) {
        CurrentThreadDemo t = new CurrentThreadDemo();
        System.out.println(t.getState());
        t.start();
        System.out.println(Thread.currentThread().getState());
    }
}
