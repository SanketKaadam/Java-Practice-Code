package JAVAAndDSA.ObjectOrientedPrograming.OOP1;

public class ConstructorExample {
    int rollNo=200; // here i initialize value
    String name;
    float marks;

    ConstructorExample(int rollNo1, String name1, float marks1){ // constructor
        this.rollNo=rollNo1;
        this.name=name1;
        this.marks=marks1;
    }

    public static void main(String[] args) {
        ConstructorExample student = new ConstructorExample(11,"ram",50.30f);

        System.out.println(student.rollNo);
        System.out.println(student.name);
        System.out.println(student.marks);
    }
}
