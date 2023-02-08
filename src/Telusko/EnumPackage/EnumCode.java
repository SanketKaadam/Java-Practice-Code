package Telusko.EnumPackage;

public class EnumCode {
    enum Week{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; // Semi-column(';') is not mandatory but we use as a practice
    }  // we can create enum in class and outside of class also

    // Enum means creating group of constant variables
    // Before enum we use interface to create group of constant variables

    public static void main(String[] args) {
        Week week;
        week= Week.MONDAY;

        System.out.println(week);
    }
}
