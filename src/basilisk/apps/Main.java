package basilisk.apps;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Group> groups = new ArrayList<>();
    private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        init();

        int i = 0;
        Group group;
        for (Student student : students) {
            group = groups.get(i++);
            group.addStudent(student);
            if (i == groups.size()) i = 0;
        }

        Lecture lecturePhysics = new Lecture();
        lecturePhysics.addGroup(groups.get(0));
        lecturePhysics.addGroup(groups.get(1));

        Lecture lectureChemistry = new Lecture();
        lectureChemistry.addGroup(groups.get(2));
        lectureChemistry.addGroup(groups.get(3));

        teachers.get(0).rollcall(lecturePhysics.getGroups());
        teachers.get(1).rollcall(lectureChemistry.getGroups());
    }

    private static void init() {
        students.add(new Student("S1","Антонов", "Антон", "Игоревич", "male", "01/01/1995"));
        students.add(new Student("S2","Болгов", "Артем", "Игоревич", "male", "01/01/1995"));
        students.add(new Student("S3","Васильев", "Денис", "Филиппович", "male", "01/01/1994"));
        students.add(new Student("S4","Васильева", "Наталья", "Васильевна", "female", "01/01/1995"));
        students.add(new Student("S5","Волова", "Анна", "Дмитриевна", "male", "01/01/1995"));
        students.add(new Student("S6","Глембо", "Алексей", "Сергеевич", "male", "01/01/1995"));
        students.add(new Student("S7","Грачёва", "Анна", "Алексеевна", "female", "01/01/1991"));
        students.add(new Student("S8","Гунькина", "Дарья", "Александровна", "female", "01/01/1994"));
        students.add(new Student("S9","Докучаева", "Кристина", "Алексеевна", "female", "01/01/1993"));
        students.add(new Student("S10","Зеленов", "Владимир", "Эдуардович", "male", "01/01/1995"));
        students.add(new Student("S11","Ишмухаметова", "Элина", "Ильдаровна", "female", "01/01/1995"));
        students.add(new Student("S12","Калёнова", "Екатерина", "Денисовна", "female", "01/01/1994", false));
        students.add(new Student("S13","Коновалова", "Арина", "Александровна", "female", "01/01/1995", false));
        students.add(new Student("S14","Корбей", "Анастасия", "Сергеевна", "female", "01/01/1995", false));
        students.add(new Student("S15","Крицкая", "Екатерина", "Владимировна", "female", "01/01/1995", false));
        students.add(new Student("S16","Кубарев", "Иван", "Алексеевич", "male", "01/01/1992", false));
        students.add(new Student("S17","Кузницын", "Павел", "Олегович", "male", "01/01/1995", false));
        students.add(new Student("S18","Матвеева", "Мария", "Евгеньевна", "female", "01/01/1991"));
        students.add(new Student("S19","Нопин", "Данил", "Александрович", "male", "01/01/1995"));
        students.add(new Student("S20","Очирова", "Римма", "Осоровна", "female", "01/01/1993"));

        groups.add(new Group("G1", "Р-01"));
        groups.add(new Group("G2", "Р-02"));
        groups.add(new Group("G3", "К-01"));
        groups.add(new Group("G4", "К-02"));

        teachers.add(new Teacher("T1", "Петренко", "Петр", "Петрович", "male", "01/01/1960"));
        teachers.add(new Teacher("T2", "Степаненко", "Степан", "Степанович", "male", "01/01/1970"));
    }
}
