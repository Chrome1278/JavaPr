public class FindStudent {

    public static boolean findStudent(Student[] students, String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return true;
            }
        }
        throw new StudentNotFoundException("Студент с такой фамилией не найден");
    }

}