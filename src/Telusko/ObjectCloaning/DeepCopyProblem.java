package Telusko.ObjectCloaning;

class B{
    int i;
    int j;

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}

public class DeepCopyProblem {
    public static void main(String[] args) {
        B obj = new B();
        obj.i=5;
        obj.j=6;
        System.out.println(obj); // excepted output i=5, j=6 and it's printing

        B obj1 = new B();
        obj1.i=obj.i; // manually assign values
        obj1.j=obj.j;
        System.out.println(obj1); // excepted output i=5, j=6 and it's printing

        obj1.i=8;
        System.out.println(obj1); // excepted output i=8, j=6 it's printing same bcoz we change value of i by using obj1 object
        System.out.println(obj); // excepted output i=5, j=6 it's printing right

        // deep copying solve problem of shallow copying
        // problem with deep copying is if variable is more like 50-100 then we need to do all this manually
        // object cloning solve this problem
    }
}
