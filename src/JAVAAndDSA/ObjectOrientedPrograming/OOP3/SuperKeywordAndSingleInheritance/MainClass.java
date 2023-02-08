package JAVAAndDSA.ObjectOrientedPrograming.OOP3.SuperKeywordAndSingleInheritance;

public class MainClass {
    public static void main(String[] args) {
        SuperKeywordChild child = new SuperKeywordChild(); // calling child constructor
        child.display(); // in display method base class variable is used
        child.display2();
        System.out.println(child.b);

        // accessing methods using super keyword
        child.display3();
        //super.greeting(); we can't use directly in main method



    }
}
