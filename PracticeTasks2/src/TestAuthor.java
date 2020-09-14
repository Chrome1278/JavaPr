public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ben", "BB@gmail.com", 'm');
        Author a2 = new Author("Kate", "KateK@gmail.com", 'm');
        System.out.println(a1 + "\n");
        a1.setEmail("BenB@gmail.com");
        System.out.println(a1 + "\n");
        System.out.println(a2);
    }
}
