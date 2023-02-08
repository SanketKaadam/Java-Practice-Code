package Telusko.Others;

public class MarkerInterface {
    public static void main(String[] args) {
        // if any interface don't have any method or empty interface this interface is called Marker Interface
        // to assign permission to class we use Marker Interface

        Demo obj = new Demo();

        if (obj instanceof Permission){
            obj.show();
        }else {
            System.out.println("No Permission");
        }

    }
}

interface Permission{

}

class Demo implements Permission{
    void show(){
        System.out.println("Hello");
    }
}
