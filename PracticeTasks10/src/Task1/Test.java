package Task1;

public class Test {
    public static void main(String[] args) {
        ComplexAbstractFactory firstFactory = new ConcreteFactory();
        System.out.println(firstFactory.createComplex());
        System.out.println(firstFactory.createComplex(10, -15));
    }
}