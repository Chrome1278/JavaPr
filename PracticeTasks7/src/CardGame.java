import java.util.*;
public class CardGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("игра 'ПЬЯНИЦА'");
        System.out.println("Виды хранения структуры данных:\n1. Stack\n2. Queue\n3. Dequeue\n4. DoubleList");
        System.out.println("Выберите номер структуры:");
        int numS = keyboard.nextInt();
        switch (numS) {
            case 1:
                Stack<Integer> firstStack = new Stack<>();
                System.out.println("Введите карты перового игрока:");
                for (int i = 0; i < 5; i++) {
                    firstStack.push(keyboard.nextInt());
                }
                Stack<Integer> secondStack = new Stack<>();
                System.out.println("Введите карты второго игрока:");
                for (int i = 0; i < 5; i++) {
                    secondStack.push(keyboard.nextInt());
                }
                System.out.println("Результат: " + StackStructure.step(firstStack , secondStack));
                break;

            case 2:
                Queue<Integer> firstQueue = new LinkedList<>();
                System.out.println("Введите карты перового игрока:");
                for (int i = 0; i < 5; i++) {
                    firstQueue.add(keyboard.nextInt());
                }
                Queue<Integer> secondQueue = new LinkedList<>();
                System.out.println("Введите карты второго игрока:");
                for (int i = 0; i < 5; i++) {
                    secondQueue.add(keyboard.nextInt());
                }
                System.out.println("Результат: " + QueueStructure.step(firstQueue, secondQueue));
                break;

            case 3:
                Deque<Integer> firstDequeue = new LinkedList<>();
                System.out.println("Введите карты первого игрока:");
                for (int i = 0; i < 5; i++) {
                    firstDequeue.add(keyboard.nextInt());
                }
                Deque<Integer> secondDequeue = new LinkedList<>();
                System.out.println("Введите карты второго игрока:");
                for (int i = 0; i < 5; i++) {
                    secondDequeue.add(keyboard.nextInt());
                }
                System.out.println("Результат: " + DequeueStructure.step(firstDequeue, secondDequeue));
                break;

            case 4:
                LinkedList<Integer> firstList = new LinkedList<>();
                System.out.println("Введите карты первого игрока:");
                for (int i = 0; i < 5; i++) {
                    firstList.add(keyboard.nextInt());
                }
                LinkedList<Integer> secondList = new LinkedList<>();
                System.out.println("Введите карты второго игрока:");
                for (int i = 0; i < 5; i++) {
                    secondList.add(keyboard.nextInt());
                }
                System.out.println("Результат: " + DoubleListStructure.step(firstList, secondList));
                break;
            default:
                System.out.println("Введённого номера нет!");
                break;
        }
    }
}