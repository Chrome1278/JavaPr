public class Task14 {
    public static String DigitToRight(int n) {
        if (n < 10)
            return Integer.toString(n);
        else
            return DigitToRight(n / 10) + " " + n % 10;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.print(DigitToRight(n));
    }
}