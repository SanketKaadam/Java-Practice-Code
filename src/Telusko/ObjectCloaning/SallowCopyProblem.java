package Telusko.ObjectCloaning;

class A{
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

public class SallowCopyProblem {
    public static void main(String[] args) {
        A obj = new A();
        obj.i=5;
        obj.j=6;

        System.out.println(obj); // to print directly object we need to create toString method in class
        A obj1 = obj;
        System.out.println(obj1);

        obj1.i=8;
        System.out.println(obj1); // excepted output i=8, j=6 it's printing same bcoz we change value of i by using obj1 object
        System.out.println(obj); // excepted output i=5, j=6 but it's printing i=8, j=6 bcoz both reference variable pointing same object

        // problem with shallow coping is if we change value by using one object it reflect to other object also

    }
}
