package CodeWithHarray.MultiThreading;

class MyRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("I am MyRunnable 11111111");
            i++;
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("I am MyRunnable 2222222");
            i++;
        }
    }
}

public class UsingRunnableInterface {
    public static void main(String[] args) {
        MyRunnable1 bullet1 = new MyRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
