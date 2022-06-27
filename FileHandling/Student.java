package FileHandling;

import java.io.Serializable;

public class Student {
    private String name;
    private int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString()
    {
        return "name: "+name+" rollNo: "+rollNo;
    }
}