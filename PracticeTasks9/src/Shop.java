import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

public class Shop {

    public static HashMap<String, BigDecimal> map  = new HashMap<>() {{
        put("Антон", BigDecimal.valueOf(1234567891));
        put("Семён", BigDecimal.valueOf(Long.parseLong("123456789124")));
        put("Евгений", BigDecimal.valueOf(1234566891));
        put("Виктория", BigDecimal.valueOf(1234567897));
        put("Дмитрий", BigDecimal.valueOf(Long.parseLong("123456788234")));
        put("Татьяна", BigDecimal.valueOf(1234567860));
    }};

    // Проверяем на корректность ИНН, для простоты считаем, что любой ИНН длины 10 или 12 корректен
    public static boolean isTaxpayerIdNumberValid(BigDecimal taxPayerIdNumber) {
        return taxPayerIdNumber.toString().length() == 10 || taxPayerIdNumber.toString().length() == 12;
    }

    public static boolean checkAccordance(String surname, BigDecimal taxpayerIdNumber) {
        if (map.containsKey(surname)) {
            return map.get(surname).equals(taxpayerIdNumber);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(map);
    }
}