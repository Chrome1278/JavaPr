package Task_1;

public class Person {
    private String surname = "EMPTY";
    private String name = "EMPTY";
    private String patronymic = "EMPTY";

    public Person() {

    }

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public StringBuilder getSNP() {
        return new StringBuilder("Person: surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'');
    }
}
