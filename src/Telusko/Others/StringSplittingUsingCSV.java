package Telusko.Others;

public class StringSplittingUsingCSV {
    public static void main(String[] args) {
        String str = "Sanket, Rahul, Nitin, Mukesh, Akshay";

        System.out.println(str); // print all name's

        String[] name = str.split(","); // all this names from str separately store in name array by using ","
        System.out.println(name[2]);
    }
}
