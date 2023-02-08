package JAVAAndDSA.ObjectOrientedPrograming.OOP3.SuperKeywordAndSingleInheritance;

public class SuperKeywordChild extends SuperKeywordBase {

    int length=100; // same variable name

    int b = super.length; // it's work
    // super.length=100 not working we can't modify value
    void display(){
        System.out.println("length is "+super.length); // base class length variable used
    }

    void display2(){
        System.out.println(length); // child class length variable used
        System.out.println(this.length); // same thing
    }

    public void greeting(){ // child class method
        System.out.println("i am child class method ");
    }

    // super.greeting(); not work we only access this in method body

    public void display3(){
        // child greeting() method
        greeting();

        // base greeting() method
        super.greeting();
    }

    SuperKeywordChild(){
        super(); // invoke or call parent class constructor

        System.out.println("i am child class constructor");
    }

}
