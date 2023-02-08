package CodeWithHarray.MultiThreading;

class StateThread extends Thread{
    public void run(){

    }
}

public class GetStateOfThread {
    public static void main(String[] args) {
        StateThread t = new StateThread();
        System.out.println(t.getState()); // till here we don't start thread
        t.start(); // here we start  thread
        System.out.println(t.getState());
    }
}
