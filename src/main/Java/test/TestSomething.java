package main.Java.test;

public class TestSomething {
    public static void main (String... args) {
        Student student = new Student(1, "xuefeng");
        System.out.println(student);
    }
}


abstract class Property {
    private int id;
    private String name;

    public Property(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Student extends Property {
    public Student(int id, String name) {
        super(id, name);
    }
}
