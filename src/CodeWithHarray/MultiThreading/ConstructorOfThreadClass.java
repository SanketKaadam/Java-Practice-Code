package CodeWithHarray.MultiThreading;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        System.out.println("Thank you");
    }
}

public class ConstructorOfThreadClass {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Sanket");
        MyThr t2 = new MyThr("Harray");

        t1.start();
        System.out.println("ID of thread t1 : "+ t1.getId());
        System.out.println("Name of thread  t2 : "+ t1.getName());

        t2.start();
        System.out.println("ID of thered t2 : "+ t2.getId());
        System.out.println("Name of Thread : "+ t2.getName());
    }
}
