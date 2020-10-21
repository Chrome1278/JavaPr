import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите размер очереди");
        int capacity = keyboard.nextInt();
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(capacity);
        System.out.println("Введите элементы очереди");
        for (int i = 0; i < capacity; i++) {
            boundedWaitList.add(keyboard.next());
        }
        System.out.println(boundedWaitList);

        System.out.println("Удаление первого элемента очереди...");
        boundedWaitList.remove();
        System.out.println(boundedWaitList);

        System.out.println("Введите элемент для поиска: ");
        String key = keyboard.next();
        if (boundedWaitList.contains(key)) {
            System.out.println("Элемент найден!");
        }
        else {
            System.out.println("Элемент не найден!");
        }

        System.out.println("\nПроверка наличия очереди элементов внутри другой очереди элементов");
        System.out.println("Введите размер искомой очереди");
        capacity = keyboard.nextInt();
        BoundedWaitList<String> searchList = new BoundedWaitList<>(capacity);
        System.out.println("Введите элементы искомой очереди");
        for (int i = 0; i < capacity; i++) {
            searchList.add(keyboard.next());
        }
        if (boundedWaitList.containsAll(searchList.content)) {
            System.out.println("Очередь найдена!");
        }
        else {
            System.out.println("Очередь не найдена!");
        }

        System.out.println("Проверка очереди на пустоту...");
        if (boundedWaitList.isEmpty()) {
            System.out.println("Очередь пустая!");
        }
        else {
            System.out.println("Очередь не пустая!");
        }

        System.out.println("\nПроверка работоспособности неограниченной очереди");
        System.out.println("Добавление элементов в очередь");
        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();
        System.out.println("Введите размер очереди");
        capacity = keyboard.nextInt();
        System.out.println("Введите элементы очереди");
        for (int i = 0; i < capacity; i++) {
            unfairWaitList.add(keyboard.next());
        }
        System.out.println(unfairWaitList);

        System.out.println("Удаление элемента из очереди...");
        if (unfairWaitList.isEmpty()) {
            System.out.println("Элементов нет!");
        }
        else {
            System.out.println("Введите элемент для удаления");
            key = keyboard.next();
            unfairWaitList.remove(key);
            System.out.println(unfairWaitList);
        }

        // Перенос элемента в конец очереди
        System.out.println("Перенос элемента в конец очереди...");
        if (unfairWaitList.isEmpty()) {
            System.out.println("Очередь пуста! Перенос невозможен!");
        }
        else {
            System.out.println("Введите элемент для переноса");
            key = keyboard.next();
            unfairWaitList.moveToBack(key);
            System.out.println(unfairWaitList);
        }
    }
}
