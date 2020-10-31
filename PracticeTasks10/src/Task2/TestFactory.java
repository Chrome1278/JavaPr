package Task2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TestFactory {
    public static void main(String[] args) {
        Chair chair;
        AbstractChairFactory abstractChairFactory = new ChairFactory();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Создание Магического стула:");
        chair = abstractChairFactory.createMagicChair();
        System.out.println(chair);
        chair.sit();

        System.out.println("\nСоздание Викторианского стула");
        System.out.print("Введите возраст стула: ");
        chair = abstractChairFactory.createVictorianChair(keyboard.nextInt());
        System.out.println(chair);
        chair.sit();

        System.out.println("\nСоздание Многофункционального стула");
        System.out.print("Введите два числа для получения суммы: ");
        chair = abstractChairFactory.createMultifunctionalChair();
        System.out.println(chair);
        System.out.println();
        chair.sit();
    }
}
