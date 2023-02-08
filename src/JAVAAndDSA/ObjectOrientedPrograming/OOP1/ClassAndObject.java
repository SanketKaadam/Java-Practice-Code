package JAVAAndDSA.ObjectOrientedPrograming.OOP1;

public class ClassAndObject {
    int rollNo=200; // here i initialize value
    String name;
    float marks;


    public static void main(String[] args) {


        ClassAndObject sanket; // here i declare
       // System.out.println(sanket); give error bcoz still object is not initialize or memory address is not assign
       // System.out.println(sanket.rollNo); error boz not initialize

        sanket = new ClassAndObject(); // here i initialize

        System.out.println(sanket); // it give random value
        System.out.println(sanket.rollNo); // output 200
        System.out.println(sanket.name); // null
        System.out.println(sanket.marks); // 0.0

        // System.out.println(IntroductionAndConcepts.rollNo); giving error bcoz rollNo variable is non-static

        // manipulate object
        sanket.rollNo=100; // here i change value
        sanket.name="Sanket";
        sanket.marks=85.56f;

        System.out.println(sanket.rollNo);
        System.out.println(sanket.name);
        System.out.println(sanket.marks);
    }

}
