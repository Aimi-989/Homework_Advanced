package OOP.additional_exercises.Task;

import java.math.BigDecimal;

public class Manager extends Employee implements Payable {

    private String division;
    private String reportTo;

    @Override
    public BigDecimal getSalary() {
        return new BigDecimal(1500.00);
    }

}

