package JAVAAndDSA.ObjectOrientedPrograming.OOP2;

public class SingletonClass {
    private SingletonClass(){ // private because I don't want anyone call contractor or crete object of this class

    }

    private static SingletonClass instance; // here we create only one instance, in singleton we only create one object or instance
    // static bcoz this instance not dependent on object of this class hence it static

    public static SingletonClass getInstance(){ // static becoz we're accessing this getInstance method by using class name
      // check whether 1 obj is created or not                                           // getInstance return SingletonClass type instance
        if (instance==null){ // if object not create then create and return
            instance = new SingletonClass(); //only one object create on 1st object call
        }
        return instance; // if object created then return same object only
    }


    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance(); // here on 1st call object create

        SingletonClass obj2 = SingletonClass.getInstance(); // here obj2 also pointing same object was created by obj1

        SingletonClass obj3 = SingletonClass.getInstance(); /// here obj3 also pointing same object was created by obj1
    }
}
