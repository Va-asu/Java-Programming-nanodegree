package FileHandling;

import java.io.*;

public class Class1 {
    public static void main(String[] args) throws Exception {
        File f=new File("Demo.txt");
        //file with Demo.txt name will be created


        //Wrting in Demo.txt
        FileOutputStream fos=new FileOutputStream(f);
        //passed file reference to output stream of file
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("here you will get the content");
        //writeUTF to write the string inside the data output stream
        //which is the non static method belongs to DataOutputStream

        //Reading the Demo.txt
        FileInputStream fis=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fis);
        String str=dis.readUTF(dis);
        System.out.println(str);


    }
}
