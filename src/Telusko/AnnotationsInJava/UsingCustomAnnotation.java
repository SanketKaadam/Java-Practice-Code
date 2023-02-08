package Telusko.AnnotationsInJava;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SmartPhone1{
    String os() default "IOS";
    int version() default 1 ;
}

@SmartPhone1(os="Android", version = 1)
class NokiaSeries1{
    String model;
    int size;

    NokiaSeries1(String model, int size){
        this.model=model;
        this.size=size;
    }
}

public class UsingCustomAnnotation {
    public static void main(String[] args) {
        NokiaSeries1 obj = new NokiaSeries1("Fire",5);
        Class c = obj.getClass();
        Annotation an = c.getAnnotation(SmartPhone1.class);
        SmartPhone1 s = (SmartPhone1)an;
        System.out.println(s.os());
    }
}
