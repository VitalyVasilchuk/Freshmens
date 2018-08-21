package basilisk.apps;

import java.util.ArrayList;

public class Group {
    private String id;
    private String name;
    private ArrayList<Student> students;

    public Group(String id, String name) {
        this.id = id;
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.add(student);
    }

    public String getElder() {
        Student elder = students.get(0);
        for (Student student : students) {
            if (student.compareOther(elder)) elder = student;
        }

        return String.format("%s", elder.getInfo());
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
