package Task_1;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Leovin",  "Alexander",  "Alexandrovich");
        System.out.println(person.getSNP());

        Person person1 = new Person("Leovin", "Alexander");
        System.out.println(person1.getSNP());

        Person person2 = new Person("Leovin");
        System.out.println(person2.getSNP());

        Person person3 = new Person();
        System.out.println(person3.getSNP());
    }
}
