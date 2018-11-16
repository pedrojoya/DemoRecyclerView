package es.iessaladillo.pedrojoya.demorecyclerview.ui.main;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import es.iessaladillo.pedrojoya.demorecyclerview.data.local.Database;
import es.iessaladillo.pedrojoya.demorecyclerview.data.local.model.Student;

class MainActivityViewModel extends ViewModel {

    private final Database database;
    private final LiveData<List<Student>> students;

    MainActivityViewModel(Database database) {
        this.database = database;
        students = database.getStudents();
    }

    LiveData<List<Student>> getStudents() {
        return students;
    }

    void deleteStudent(Student student) {
        database.deleteStudent(student);
    }

}
