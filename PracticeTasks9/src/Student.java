public class Student implements Comparable<Student>, LabClassUI {
    private int ID;
    private double GPA;
    private String name;
    public Student(int ID, String name, double GPA) {
        this.ID = ID;
        this.name = name;
        this.GPA = GPA;
    }
    public int getID() {
        return ID;
    }
    public double getGPA() {
        return GPA;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "\n" + name + " " + ID + " " + GPA;
    }

    @Override
    public int compareTo(Student s) {
        return (int) (10*(this.getGPA() - s.getGPA()));
    }
}