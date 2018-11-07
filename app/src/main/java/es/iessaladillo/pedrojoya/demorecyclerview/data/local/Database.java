package es.iessaladillo.pedrojoya.demorecyclerview.data.local;

import java.util.ArrayList;
import java.util.Arrays;

import es.iessaladillo.pedrojoya.demorecyclerview.data.local.model.Student;

public class Database {

    // TODO: Define Database as a singleton.

    private ArrayList<Student> students = new ArrayList<>(Arrays.asList(
        new Student(1, "Baldo", 23),
        new Student(2, "German", 17)
    ));

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }
}
