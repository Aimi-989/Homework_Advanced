package OOP.additional_exercises;

public interface Vehicle {

    Integer getMaxSpeed();
    Integer move();

    default void stop()
    {}

}
