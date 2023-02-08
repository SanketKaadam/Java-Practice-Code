package Telusko.Others;

public class TernaryOperator {
    public static void main(String[] args) {
        int i=1;
        int j=0;

       /* if (i==1){
            j=6;
        }else {
            j=10;
        } */

        j= i==1?6:10; // insist of writing if else we use ternary operator
        System.out.println(j);


        // another properties of ternary operator

        Object obj2; // declare object of Object class

     //   obj2 = true?new Integer(10):new Double(20.0); commented bcoz we Don't use Integer and Double in latest java version but it give output
       // System.out.println(obj2); // print 10.0 bcoz ternary operator check the type of both values and whichever vlaue type is
                                      // maximum it occupied that type by default, here Double is max as compare with Integer
    }
}
