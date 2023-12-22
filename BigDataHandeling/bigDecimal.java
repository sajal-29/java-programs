package BigDataHandeling;

import java.math.BigDecimal;

public class bigDecimal {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.0002");
        BigDecimal b = new BigDecimal("0.0547");
        BigDecimal c = new BigDecimal("0.03255");
        System.out.println(a.subtract(c));

        BigDecimal bd = new BigDecimal("235154.2352155");
        BigDecimal bd2 = new BigDecimal("346800.568568489");
        System.out.println(bd.subtract(bd2));
        System.out.println(bd.add(bd2));
        System.out.println(bd.multiply(bd2));
    }
}
