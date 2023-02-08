package Telusko.FileHandaling.SerializationAndDeSerializationUsingXMLEncoder;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationObjectInXMLUsingXMLEncoder {
    public static void main(String[] args) throws FileNotFoundException {
        Students st1  = new Students();
        st1.setRollNo(101);
        st1.setSName("Sanket");

        Students st2 = new Students();
        st2.setRollNo(102);
        st2.setSName("Navin");

        List<Students> s = new ArrayList<>();
        s.add(st1);
        s.add(st2);

        College c = new College();
        c.setStudents(s);

        XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("MyCollege.xml")));
        x.writeObject(c);
        x.close();

    }
}
