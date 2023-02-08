package Telusko.FileHandaling.SerializationAndDeSerializationUsingXMLEncoder;

public class Students {
    private int rollNo;
    private String sName;

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    public void setSName(String sName){
        this.sName=sName;
    }

    public int getRollNo(){
        return rollNo;
    }

    public String getSName(){
        return sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                '}';
    }
}
