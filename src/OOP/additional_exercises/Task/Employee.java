package OOP.additional_exercises.Task;

public class Employee {

    private String nameSurname;
    private int age;
    private String identity;
    private String bioIdentity;
    Object t;

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getBioIdentity() {
        return bioIdentity;
    }

    public void setBioIdentity(String bioIdentity) {
        this.bioIdentity = bioIdentity;
    }


    @Override
    public String toString() {
        return this.nameSurname + " | " + this.age;
    }


}
