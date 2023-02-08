package Telusko.FileHandaling.SerializationAndDeSerializationUsingXMLEncoder;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.List;

public class DeSerializationObjectUsingXMLDecoder {
    public static void main(String[] args) throws Exception {
        XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("MyCollege.xml")));
        College c = (College)x.readObject();
        List<Students> s = c.getStudents();

        for (Students value : s){
            System.out.println(value);
        }


    }
}
