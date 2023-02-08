package CodeWithHarray.MultiThreading;

class MyNewThr1 extends Thread{

    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("I am MyNewThread 111111");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            i++;
        }
    }
}

class MyNewThr2 extends Thread{
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("I am MyNewThread 22222");
            i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();

        t1.start();
       /* try{
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        } */
        t2.start();

    }
}
