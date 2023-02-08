package JAVAAndDSA.ObjectOrientedPrograming.OOP3.SuperKeywordAndSingleInheritance;

public class ChildClass extends BaseClass {

    int weight;
    public static void main(String[] args) {
        BaseClass b = new BaseClass();
        b.length=10;
        b.breath=20;
        b.height=30;
        // b.weight=40; not work bcoz weight is child class variable

        ChildClass child = new ChildClass();
        child.length=100;
        child.height=200;
        child.breath=300;
        child.weight=500;

        System.out.println(child.length);
        System.out.println(child.weight);

    }
}
