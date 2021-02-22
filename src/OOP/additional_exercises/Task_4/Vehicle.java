package OOP.additional_exercises.Task_4;

public interface Vehicle {

    Integer getMaxSpeed();
    Integer move();

    default void stop()
    {}

}
