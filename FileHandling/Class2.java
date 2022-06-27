package FileHandling;

import java.io.*;
import java.util.Properties;

public class Class2 {
    public static void main(String[] args) throws Exception {
        OutputStream os=new FileOutputStream("Properties.txt");
        Properties p=new Properties();//belongs to HashTable hence has key value pair
        p.setProperty("name","vaasu");
        p.setProperty("pass","0000");
        p.setProperty("URL","localhost:3000/myDB");

        p.store(os,null);

        InputStream is=new FileInputStream("Properties.txt");
        p.load(is);
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("pass"));
    }
}
