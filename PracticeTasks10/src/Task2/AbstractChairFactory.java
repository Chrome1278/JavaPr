package Task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    MultifunctionalChair createMultifunctionalChair();
}
