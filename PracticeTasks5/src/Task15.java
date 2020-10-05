public class Task15 {
    public static int DigitToLeft(int n) {
        if (n / 10 != 0) {
            System.out.print(n % 10 + " ");
            return DigitToLeft(n / 10);
        }
        else
            return (n);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.print(DigitToLeft(n));
    }
}
