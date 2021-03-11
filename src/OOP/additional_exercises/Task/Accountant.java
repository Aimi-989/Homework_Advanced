package OOP.additional_exercises.Task;

import java.math.BigDecimal;

public class Accountant extends Employee implements Payable{
    @Override
    public BigDecimal getSalary() {
        return new BigDecimal(1000.00);
    }
}
