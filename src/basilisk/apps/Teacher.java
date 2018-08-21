package basilisk.apps;

import java.util.ArrayList;

public class Teacher extends Person {

    public Teacher(String id, String lastName, String firstName, String middleName, String sex, String birthday) {
        super(id, lastName, firstName, middleName, sex, birthday);
    }

    public void rollcall(ArrayList<Group> groups) {
        for (Group group : groups) {
            System.out.println(String.format("Группа \"%s\" (староста %s)", group.getName(), group.getElder()));
            System.out.println("-------------------------");
            for (Student student : group.getStudents()) {
                System.out.println(String.format("%s - %s", student.getInfo(), (student.isPresent() ? "V" : "X")));
            }
            System.out.println();
        }
    }
}
