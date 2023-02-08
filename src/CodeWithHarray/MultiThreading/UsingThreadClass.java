package CodeWithHarray.MultiThreading;

class MyThread1 extends Thread{
    int i=0;
    public void run(){
        while (i<1000){
        System.out.println("I am thread 1111111");
        i++;
        }
    }
}

class MyThread2 extends Thread{
    int i=0;
    public void run(){
        while (i<1000) {
            System.out.println("I am thread 2222222");
            i++;
        }
    }
}


public class UsingThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
