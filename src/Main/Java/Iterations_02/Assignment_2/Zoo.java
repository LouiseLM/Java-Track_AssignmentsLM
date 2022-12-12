package Main.Java.Iterations_02.Assignment_2;

import java.math.BigDecimal;

public class Zoo {
    public BigDecimal calculatePrice(Person person) {
        int age = person.getAge();
        if (age <= 5) {
            return BigDecimal.valueOf(0);
        } else if (age <= 12) {
            return BigDecimal.valueOf(5);
        } else {
            return BigDecimal.valueOf(15);
        }
    }
}
