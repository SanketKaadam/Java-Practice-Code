package JAVAAndDSA.ObjectOrientedPrograming.OOP3.FinalKeyword;// Java Program to demonstrate result of overriding a final
// method

class IntegralOperations {

    // add declared as final
    final int add(int a, int b) { return a + b; }

    // subtract declared as final
    final int subtract(int a, int b) { return a - b; }
}

class child extends IntegralOperations {

    /*// try to override add
    @Override int add(int a, int b) { return a - b; }

    // try to override subtract
    @Override int subtract(int a, int b) { return a * b; } */
    // giving error not able to override bcoz of final
}

public class FinalKeywordOverriding {
    public static void main(String[] args)
    {
        child c1 = new child();
        System.out.println(c1.add(1, 4));
    }
}
