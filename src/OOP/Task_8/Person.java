package OOP.Task_8;

public class Person {
    String name;
    String email;
    String personCode;
    Integer age;
    Gender gender = Gender.MALE;

    public Person() {
        System.out.println("Constructor for Person was called");
        System.out.println(gender.getDescription());
        Gender.values();
    }

    public void overloadMe() {

    }
}

