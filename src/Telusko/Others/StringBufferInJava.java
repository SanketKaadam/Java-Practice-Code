package Telusko.Others;

public class StringBufferInJava {
    public static void main(String[] args) {
        StringBuffer obj = new StringBuffer("Sanket");
        obj.append(" Kadam");
        obj.replace(0,5, "Savita");
        obj.delete(8,10);
        System.out.println(obj);

        // StringBuilder and StringBuffer is same there is only one difference
        // StringBuffer is thread safe but StringBuilder is not thread safe
        // with no guarantee of Synchronization
    }
}
