package Generics.Task_4;

import Generics.Task_3.Person;

public class GenericSimple {

    public static <T> void printArray (T[] Array){
        for (T element : Array) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] stringArray = { "Новая строка" };
        Integer[] intArray = { 1, 2, 3 };
        Double[] doubleArray = { 1.1, 2.2, 3.3 };
        Person[] personArray = {new Person(123), new Person(127), new Person(133)};

        printArray(stringArray);
        printArray(intArray);
        printArray(doubleArray);
        printArray(personArray);

    }
}
