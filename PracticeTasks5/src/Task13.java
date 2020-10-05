import java.util.*;
public class Task13 {
    public static void OddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        if (n1 != 0) {
            int n2 = scanner.nextInt();
            System.out.println(n1);
            if ( n2 != 0)
                OddNumbers();
        }
    }

    public static void main(String[] args) {
        OddNumbers();
    }
}