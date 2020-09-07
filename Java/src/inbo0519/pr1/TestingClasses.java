package inbo0519.pr1;

public class TestingClasses {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Larry", 3);
        Dog dog2 = new Dog("Alexa", 7);
        Dog dog3 = new Dog("Sharik", 10);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3 + "\n");

        Ball ball1 = new Ball("Basketball", 31);
        Ball ball2 = new Ball("Football", 22);
        Ball ball3 = new Ball("Volleyball", 24);
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3 + "\n");

        Book book1 = new Book("English", 240);
        Book book2 = new Book("Russian", 311);
        Book book3 = new Book("Portugal", 80);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }
}
