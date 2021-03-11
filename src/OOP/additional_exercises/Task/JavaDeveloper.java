package OOP.additional_exercises.Task;

import java.math.BigDecimal;

public class JavaDeveloper extends Employee implements Payable {
    @Override
    public BigDecimal getSalary() {
        return new BigDecimal(2500.00);
    }
}
