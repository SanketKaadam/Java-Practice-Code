package JAVAAndDSA.ObjectOrientedPrograming.TestPackage;
import static JAVAAndDSA.ObjectOrientedPrograming.OOP2.PackageA.greeting2; // import from package OOP2
public class C {
    public static void main(String[] args) {
        greeting2("Akashay"); // method is public in class 'A' that's why it accessible
    }                              // check class A also
}
