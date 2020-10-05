import java.util.*;
public class Task17 {
    public static int CountMax() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0)
            return 0;
        else
            return Math.max(n, CountMax());
    }
    public static void main(String[] args) {
        System.out.print(CountMax());
    }
}
