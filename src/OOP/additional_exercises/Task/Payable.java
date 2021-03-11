package OOP.additional_exercises.Task;

import java.math.BigDecimal;

public interface Payable {

    default BigDecimal getSalary() {
        return new BigDecimal(1200.00);
    }

}
