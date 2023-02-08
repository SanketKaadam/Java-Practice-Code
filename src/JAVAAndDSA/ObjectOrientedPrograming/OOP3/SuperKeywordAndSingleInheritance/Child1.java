package JAVAAndDSA.ObjectOrientedPrograming.OOP3.SuperKeywordAndSingleInheritance;

public class Child1 extends Base1 {

    int weight;
    public static void main(String[] args) {
       // Child1 ch = new Base1(); error for child class object we use child class constructor only
        Base1 bs = new Child1(); // it's working now

        bs.breath=100;
        bs.height=200;
        bs.length=300;
        //bs.weight=400; not work
    // type of reference variable that actually determine not the type of object that determine what members can be access

        System.out.println(bs.length);

    }
}
