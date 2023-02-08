package JAVAAndDSA.ObjectOrientedPrograming.OOP3.Encapsulation;

class Area{
    private int length;
    private int width;

    public void setLength(int leghth){
        this.length=leghth;
    }

    public void setWidth(int width){
        this.width=width;
    }

    public int getArea(){
        int area = length*width;
        return area;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Area a = new Area();
        a.setLength(10);
        a.setWidth(20);
        System.out.println(a.getArea());
    }
}
