package CodeWithHarray.MultiThreading;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("I am thread : "+ getName());
            i++;
        }
    }
}

public class prioritiesOfThreads {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Sanket");
        MyThr1 t2 = new MyThr1("Harray");
        MyThr1 t3 = new MyThr1("Akshay");
        MyThr1 t4 = new MyThr1("Mukesh");
        MyThr1 t5 = new MyThr1("Sunil");

        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        // Giving priorities TO threads also depend on OS

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
