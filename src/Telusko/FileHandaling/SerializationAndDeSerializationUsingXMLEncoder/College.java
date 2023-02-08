package Telusko.FileHandaling.SerializationAndDeSerializationUsingXMLEncoder;

import java.util.List;

public class College {
    List<Students> students;

    public void setStudents(List<Students> students){
        this.students = students;
    }

    public List<Students> getStudents(){
        return students;
    }
}
