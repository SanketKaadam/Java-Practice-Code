package JAVAAndDSA.ObjectOrientedPrograming.OOP2;

public class StaticInnerAndOuterClass {
    public static class Inner{ // it's working bcoz inner class is static and outer class is non-static

    }
}

//outer class is not static bcoz itself not dependent on any other class
// but inner class is dependent on outer class hence it's static

/*
public static class OuterClass{
    public class Inner{ // it not working bcoz inner class is non-static and outer class is static

    }
} */
