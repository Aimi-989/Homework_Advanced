package OOP.additional_exercises.Task;

import java.math.BigDecimal;

//public class Manager extends Employee {}

public class Manager implements Payable{

    private String division;
    private String reportTo;

    @Override
    public BigDecimal getSalary() {
        return null;
    }

}

//public class Manager implements Reportable {

//    @Override
//    public List listSupervisors(){
//        return null;
//    }
//}

