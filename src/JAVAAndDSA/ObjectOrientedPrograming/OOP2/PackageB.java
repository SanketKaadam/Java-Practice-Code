package JAVAAndDSA.ObjectOrientedPrograming.OOP2;

//import static JAVABootCamp.ObjectOrientedPrograming.OOP2.PackageA.greeting; // here I import package, static because we  want to use in main method and main method is static

public class PackageB {                                                       // at the last I  mention method name greeting we can also mention *, * means all
    public static void main(String[] args) {
        // greeting("Sham"); for this we need to use import so uncomment import it will work
        PackageA.greeting("Kunal"); // In same package not compulsory to use import, but we need to use class name + '.'
    }
}
