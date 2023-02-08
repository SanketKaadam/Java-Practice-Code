package JAVAAndDSA.ObjectOrientedPrograming.OOP2;

public class StaticKeyword {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    static int marks;

    public StaticKeyword(int age, String name, int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        StaticKeyword.population=population+1; // here we assign value
        // static variables is object independent, but they are common for all object of calss
    }

    public static void main(String[] args) {

        System.out.println(StaticKeyword.marks); // here i access marks without using object name
        marks=200; // here i modify static variable
        System.out.println(StaticKeyword.marks);

        StaticKeyword obj1 = new StaticKeyword(101,"Sanket",45678,false);
        StaticKeyword obj2 = new StaticKeyword(102,"Kunal",98745,true);

        System.out.println(obj1.population); // same population for both obj1 and obj2
        System.out.println(obj2.population);
        // here I am accessing static variable by using object name it work but don't use object name use class name

        System.out.println(StaticKeyword.population); // accessing using class name
    }

}
