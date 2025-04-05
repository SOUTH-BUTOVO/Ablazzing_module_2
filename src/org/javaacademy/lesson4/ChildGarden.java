package org.javaacademy.lesson4;

import java.util.ArrayList;
import java.util.List;

public class ChildGarden {
    private List<Child>[] groups;

    public ChildGarden(int countGroups) {
        groups = new List[countGroups];
        for (int i = 0; i < groups.length; i++) {
            groups[i] = new ArrayList<>();
        }
    }

    public void addChildInGroup(Child child) {
//        if (child.hashCode() % 3 == 0) {
//            groups[0].add(child);
//        } else if (child.hashCode() % 3 == 1) {
//            groups[1].add(child);
//        } else {
//        groups[2].add(child);
//        }
        groups[child.hashCode() % groups.length].add(child);
    }

    public boolean hasChild(Child child) {
        //int groupIndex = child.hashCode() % 3;
        List<Child> group = groups[child.hashCode() % groups.length];
        for (Child element : group) {
            if (element.equals(child)) {
                return true;
            }
        }
        return false;
    }

    public List<Child>[] getGroups() {
        return groups;
    }
}
