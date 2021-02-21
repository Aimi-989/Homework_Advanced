package Generics.Task_4;

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

        printArray(stringArray);
        printArray(intArray);
        printArray(doubleArray);

    }
}
