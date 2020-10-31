import java.math.BigDecimal;
import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) throws Exception {
        String next = "1";
        String name = "";
        boolean correct = true;
        BigDecimal taxpayerIdNumber = BigDecimal.valueOf(0);
        Scanner keyboard = new Scanner(System.in);

        System.out.println(Shop.map);

        while (next.equals("1")) {
            try {
                System.out.println("Введите имя:");
                name = keyboard.next();
                System.out.println("Введите ИНН: ");
                taxpayerIdNumber = keyboard.nextBigDecimal();
                if (!Shop.isTaxpayerIdNumberValid(taxpayerIdNumber) ||
                        !Shop.checkAccordance(name, taxpayerIdNumber)) {
                    throw new Exception();
                }
            } catch (Exception err) {
                if (!Shop.checkAccordance(name, taxpayerIdNumber)) {
                    correct = false;
                    throw new ExceptionNum("ИНН не соответствует имени!", err);
                }
                if (!Shop.isTaxpayerIdNumberValid(taxpayerIdNumber)) {
                    System.out.println("Введен некорректный ИНН");
                    correct = false;
                    throw new ExceptionNum("Введен некорректный ИНН", err);
                }
            } finally {
                if (correct) {
                    System.out.println("Данные введены корректно!");
                    System.out.println("Для продолжения введите 1, иначе 0 для завершения");
                    next = keyboard.next();
                }
            }
        }

    }
}
