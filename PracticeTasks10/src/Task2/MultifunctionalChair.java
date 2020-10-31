package Task2;

import java.util.Scanner;

public class MultifunctionalChair implements Chair{
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public String toString() {
        return "Многофункциональный стул";
    }

    @Override
    public void sit() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Клиент сидит на многофункциональном стуле, который посчитал сумму введёных чисел - " + sum(keyboard.nextInt(), keyboard.nextInt()));
    }
}
