package Telusko.ObjectCloaning;

class C implements Cloneable{ // to clone objects we need permission for this we implement cloneable interface, cloneable is Marker interface which does not have anything
    int i;
    int j;

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { // bcoz clone is protected we need to override this
        return super.clone();  // super bcoz it's call super class method
    }
}

public class CloningObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        C obj = new C();
        obj.i=5;
        obj.j=6;
        System.out.println(obj); // excepted output i=5, j=6 and it's printing

        C obj1 = (C)obj.clone(); // we cast to our class and handle exception

        obj1.i=8;
        System.out.println(obj1); // excepted output i=8, j=6 it's printing same bcoz we change value of i by using obj1 object
        System.out.println(obj); // excepted output i=5, j=6 it's printing right

        // it's mixture of both shallow and deep copying and solve problem of both
    }
}
