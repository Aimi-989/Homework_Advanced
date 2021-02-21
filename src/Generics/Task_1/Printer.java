package Generics.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Printer<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {

        Printer<String> stringPrinter = new Printer<>();
        stringPrinter.set("Старая строка");
        System.out.println(stringPrinter.get());

        Printer<Integer> integerPrinter = new Printer<>();
        integerPrinter.set(123);
        System.out.println(integerPrinter.get());

        Printer<Double> doublePrinter = new Printer<>();
        doublePrinter.set(1.1);
        System.out.println(doublePrinter.get());




       /*  List<String> string = new ArrayList<>();
        string.add("Старая строка");
        string.add("Новая строка");
        System.out.println(string);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(456);
        System.out.println(numbers);

        List<Double> statement= new ArrayList<>();
        statement.add(1.1);
        statement.add(2.2);
        System.out.println(statement);

        */


    }

}




