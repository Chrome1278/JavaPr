import java.util.*;
public class Task16 {
    public static void CountMax(int max, int count) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0)
            System.out.println(count);
        else if (n > max)
            CountMax(n, 1);
        else if (n == max)
            CountMax(max, ++count);
        else
            CountMax(max, count);
    }

    public static void main(String[] args) {
        CountMax(0, 0);
    }
}
