import java.util.*;
public class ComparatorGPA implements Comparator<Student> {
    public static void quickSortByGPA(List<Student> students, int lBorder, int rBorder) {
        int lPoint = lBorder;
        int rPoint = rBorder;
        Student pivot = students.get((lPoint + rPoint) / 2);
        do {
            while (students.get(lPoint).getGPA() > pivot.getGPA()) {
                lPoint++;
            }
            while (students.get(rPoint).getGPA() < pivot.getGPA()) {
                rPoint--;
            }
            if (lPoint <= rPoint) {
                if (lPoint < rPoint) {
                    Student tempStudent = students.get(lPoint);
                    students.set(lPoint, students.get(rPoint));
                    students.set(rPoint, tempStudent);
                }
                lPoint++;
                rPoint--;
            }
        } while (lPoint <= rPoint);
        if (lPoint < rBorder) {
            quickSortByGPA(students, lPoint, rBorder);
        }
        if (lBorder < rPoint) {
            quickSortByGPA(students, lBorder, rPoint);
        }
    }
    @Override
    public int compare(Student s1, Student s2) {
        return (int) (10*(s2.getGPA() - s1.getGPA()));
    }
}