import java.util.*;
public class SortingTests {
    public static void main(String[] args) {
        LabClassUI[] students = new Student[5];
        students[0] = new Student(103, "Антон", 4.);
        students[1] = new Student(105, "Семён", 1.1);
        students[2] = new Student(107, "Евгений", 2.5);
        students[3] = new Student(122, "Виктория", 4.3);
        students[4] = new Student(98, "Дмитрий", 4.9);
        System.out.println("Список студентов: " + Arrays.toString(students) + "\n");
        Scanner keyboard = new Scanner(System.in);
        String NameSearch = null;
        int next = 1;
        boolean found = true;
        while (next == 1) {
            try {
                System.out.println("Введите имя студента: ");
                NameSearch = keyboard.next();
                if (!FindStudent.findStudent((Student[]) students, NameSearch)) {
                    throw new StudentNotFoundException("Студент с такой фамилией в списке не найден!");
                }
            } catch (StudentNotFoundException e) {
                found = false;
                e.printStackTrace();
            } finally {
                if (found) {
                    System.out.println("Студент с именем " + NameSearch + " найден!");
                }
                System.out.println("Для продолжения введите 1, иначе 0 для завершения");
                next = keyboard.nextInt();
            }
        }


    }
}
