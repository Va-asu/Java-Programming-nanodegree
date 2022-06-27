package FileHandling;

import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class Class4 {
    public static void main(String[] args) throws Exception {
        Student s1=new Student();
        s1.setName("vaasu");
        s1.setRollNo(123);

        Student s2=new Student();
        s2.setName("yash");
        s2.setRollNo(124);

        List<Student>list=new ArrayList<>();
        list.add(s1);
        list.add(s2);

        College c=new College();
        c.setStudents(list);
        System.out.println(c.getStudents());
//        XMLEncoder e = new XMLEncoder(
//                new BufferedOutputStream(
//                        new FileOutputStream("XMLObject.txt")));
       // e.writeObject(c);
       // e.close();

        OutputStream os=new FileOutputStream("XMLObject.txt");
        BufferedOutputStream oos=new BufferedOutputStream(os);

        try (XMLEncoder enc = new XMLEncoder(oos)) {
            enc.writeObject(c);
        }
//        XMLEncoder encode=new XMLEncoder(oos);
//
//       //oos.writeObject(c);


    }
}
