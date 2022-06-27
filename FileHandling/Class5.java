package FileHandling;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class Class5 {
    public static void main(String[] args) throws Exception {
        File f=new File("XMLObject.txt");
        InputStream is=new FileInputStream(f);
        BufferedInputStream bis=new BufferedInputStream(is);

        XMLDecoder encode=new XMLDecoder(bis);
        College c=(College) encode.readObject();
        List<Student>list=c.getStudents();
        System.out.println(list);

    }
}
