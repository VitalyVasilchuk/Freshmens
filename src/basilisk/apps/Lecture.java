package basilisk.apps;

import java.util.ArrayList;

public class Lecture {
    private ArrayList<Group> groups;

    public Lecture() {
        groups = new ArrayList<>();
    }

    public Lecture(ArrayList<Group> groups) {
        super();
        this.groups = groups;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void removeGroup(Group group) {
        groups.add(group);
    }
}
