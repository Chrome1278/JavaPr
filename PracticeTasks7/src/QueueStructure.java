import java.util.Queue;
public class QueueStructure {
    public static String step(Queue<Integer> first, Queue<Integer> second) {
        for (int i = 0; i < 106; i++) {
            if (first.size() == 0) {
                return "second " + i;
            }
            else if (second.size() == 0) {
                return "first " + i;
            }
            else {
                Integer firstPlayerCard = first.peek();
                Integer secondPlayerCard = second.peek();
                first.poll();
                second.poll();
                if (firstPlayerCard != 0 && secondPlayerCard != 0) {
                    if (firstPlayerCard > secondPlayerCard) {
                        first.add(firstPlayerCard);
                        first.add(secondPlayerCard);
                    }
                    else {
                        second.add(secondPlayerCard);
                        second.add(firstPlayerCard);
                    }
                }
                else if (firstPlayerCard == 9 || secondPlayerCard == 9) {
                    if (firstPlayerCard == 0) {
                        first.add(firstPlayerCard);
                        first.add(secondPlayerCard);
                    }
                    else {
                        second.add(secondPlayerCard);
                        second.add(firstPlayerCard);
                    }
                }
            }
        }
        return "botva";
    }
}