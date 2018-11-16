package es.iessaladillo.pedrojoya.demorecyclerview.data.local.model;

// TODO: Make student implement Parcelable.
public class Student {

    private long id;
    private final String name;
    private final int age;

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
