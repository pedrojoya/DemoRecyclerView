package es.iessaladillo.pedrojoya.demorecyclerview.data.local;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import es.iessaladillo.pedrojoya.demorecyclerview.data.local.model.Student;

public class Database {

    // TODO: Define Database as a singleton.

    private final ArrayList<Student> students = new ArrayList<>(Arrays.asList(
        new Student(1, "Baldo", 23),
        new Student(2, "German", 17),
        new Student(3, "Julián", 17),
        new Student(4, "Baldom", 23),
        new Student(5, "Germanm", 17),
        new Student(6, "Juliánm", 17),
        new Student(7, "Lorenzo", 17)
    ));
    private final MutableLiveData<List<Student>> studentsLiveData = new MutableLiveData<>();

    public Database() {
        updateStudentsLiveData();
    }

    private void updateStudentsLiveData() {
        studentsLiveData.setValue(new ArrayList<>(students));
    }

    public LiveData<List<Student>> getStudents() {
        return studentsLiveData;
    }

    public void deleteStudent(Student student) {
        students.remove(student);
        updateStudentsLiveData();
    }

}
