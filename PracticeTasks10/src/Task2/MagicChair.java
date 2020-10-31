package Task2;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("Это магия!");
    }

    @Override
    public String toString() {
        return "Магический стул";
    }

    @Override
    public void sit() {
        System.out.println("Клиент сидит на магическом стуле");
        doMagic();
    }
}