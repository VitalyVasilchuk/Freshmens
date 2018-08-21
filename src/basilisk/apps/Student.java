package basilisk.apps;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Student extends Person {

    private boolean present;

    public Student(String id, String lastName, String firstName, String middleName, String sex, String birthday) {
        super(id, lastName, firstName, middleName, sex, birthday);
        this.present = true;
    }

    public Student(String id, String lastName, String firstName, String middleName, String sex, String birthday, boolean present) {
        super(id, lastName, firstName, middleName, sex, birthday);
        this.present = present;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public int getAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(getBirthday(), formatter);
        LocalDate currentDate = Instant.ofEpochMilli(System.currentTimeMillis()).atZone(ZoneId.systemDefault()).toLocalDate();
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public boolean compareOther(Student student) {
        return (this.getAge() > student.getAge());
    }

    public String getInfo() {
        return String.format("%s %s %s (%s)", getLastName(), getFirstName(), getMiddleName(), getAge());
    }
}
