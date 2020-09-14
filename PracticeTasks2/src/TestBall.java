public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(10, 10);
        System.out.println(b1);
        b1.move(40, 60);
        System.out.println(b1);
        b1.move(-5, 30);
        System.out.println(b1);
    }
}
