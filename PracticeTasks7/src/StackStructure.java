import java.util.Stack;
public class StackStructure {
    public static Stack<Integer> shift(Stack<Integer> stack, Integer firstCard, Integer secondCard) {
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> result = new Stack<Integer>();
        while (!stack.empty()) {
            temp.push(stack.pop());
        }
        result.push(firstCard);
        result.push(secondCard);
        while (!temp.empty()) {
            result.push(temp.pop());
        }
        return result;
    }

    public static String step(Stack<Integer> first, Stack<Integer> second) {
        for (int i = 0; i < 106; i++) {
            if (first.size() == 0) {
                return "second " + i;
            }
            else if (second.size() == 0) {
                return "first " + i;
            }
            else {
                Integer firstCard = first.peek();
                Integer secondCard = second.peek();
                first.pop();
                second.pop();
                if (firstCard != 0 && secondCard != 0) {
                    if (firstCard > secondCard) {
                        first = shift(first, firstCard, secondCard);
                    }
                    else {
                        second = shift(second, secondCard, firstCard);
                    }
                }
                else if (firstCard == 9 || secondCard == 9) {
                    if (firstCard == 0) {
                        first = shift(first, firstCard, secondCard);
                    }
                    else {
                        second = shift(second, secondCard, firstCard);
                    }
                }
            }
        }
        return "botva";
    }
}