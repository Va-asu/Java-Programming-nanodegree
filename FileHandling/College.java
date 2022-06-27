package FileHandling;

import java.io.Serializable;
import java.util.List;

public class College {
    private List<Student> Students;

    public void setStudents(List<Student> students) {
        this.Students = students;
    }

    public List<Student> getStudents() {
        return Students;
    }
}