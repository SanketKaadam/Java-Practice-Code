package Telusko.AnnotationsInJava;


@interface SmartPhone{ // for creating new annotation we use interface keyword
    String os() default "IOS"; // here we define default values also
    int version() default 2;
}

@SmartPhone(os="Android", version =1) //here we override default values by giving new values
class NokiaSeries{

}

public class CustomAnnotations {
    public static void main(String[] args) {

    }
}
