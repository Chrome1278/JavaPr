package Task2;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Викторианский стул. Возраст: " + age;
    }

    @Override
    public void sit() {
        System.out.println("Клиент сидит на викторианском стуле, его возраст - " + getAge() + " лет!");
    }
}