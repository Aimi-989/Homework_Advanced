package OOP.Task_8;



public enum Gender {
    FEMALE("female gender"), MALE("male gender");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
