import java.util.*;
public class SortingTests {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Антон", 4.0));
        students.add(new Student(105, "Семён", 1.1));
        students.add(new Student(107, "Евгений", 2.5));
        students.add(new Student(122, "Виктория", 4.3));
        students.add(new Student(98, "Дмитрий", 4.9));
        students.add(new Student(110, "Илья", 4.4));
        students.add(new Student(120, "Светлана", 4.9));

        System.out.println("Сортировка вставками по возрастанию ID:");
        ComparatorID.SortingID(students);
        System.out.print(students + "\n\n");

        Comparator<Student> compareByGPA = new ComparatorGPA();
        System.out.println("Быстрая сортировка по убыванию GPA (без компаратора):");
        ComparatorGPA.quickSortByGPA(students, 0, students.size()-1);
        System.out.println(students + "\n");

        System.out.println("Быстрая сортировка по убыванию GPA (с компаратором):");
        students.sort(compareByGPA);
        System.out.print(students + "\n\n");

        System.out.print("Сортировка слиянием по возрастанию GPA:");
        Student[] students2 = new Student[3];
        students2[0] = new Student(97, "Елена", 3.3);
        students2[1] = new Student(125, "Мария", 4.6);
        students2[2] = new Student(123, "Егор", 5.0);
        MergingSort.mergeSort(students2, 0, students2.length);
        for (Student student : students2) {
            System.out.print(student);
        }
    }
}
