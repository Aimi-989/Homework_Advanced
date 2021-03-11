package OOP.additional_exercises.Task_incorrect;

import OOP.additional_exercises.Task.Payable;

import java.math.BigDecimal;

public class JavaDeveloper extends Employee implements Payable {
    @Override
    public BigDecimal getSalary() {
        return new BigDecimal(2500.00);
    }
}
