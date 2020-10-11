import java.util.*;
public class ComparatorID {
    public static void SortingID(List<Student> students) {
        for (int l = 0; l < students.size(); l++) {
            int min = students.get(l).getID();
            for (int i = l - 1; i >= 0; i--) {
                if (min < students.get(i).getID()) {
                    Collections.swap(students, i + 1, i);
                } else {
                    break;
                }
            }
        }
    }
}