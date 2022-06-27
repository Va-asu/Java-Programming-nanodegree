package FileHandling;

import java.io.*;
import java.nio.file.Files;

//by default object can be read directly using readObject function
//to read the object we need to implement the interface Serializable
//which doesn't have any declaration.
class Save implements Serializable{
    int i;
}

public class Class3 {
    public static void main(String[] args) throws Exception {
        Save obj=new Save();
        obj.i=4;

        File f=new File("SaveObj.txt");
        OutputStream os=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(os);
        oos.writeObject(obj);

        InputStream is=new FileInputStream(f);
        ObjectInputStream ios=new ObjectInputStream(is);
        System.out.println("Value of i is "+((Save)ios.readObject()).i);

    }
}
