package Collections.Task_Demo;

import OOP.additional_exercises.Task.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    static List<String> strings = new ArrayList<>();

    public static void testFire() {
        strings.add("first string"); //String[] s = {"first string"}
        strings.get(0); //instead of strings[0]
        strings.add("second string"); // String[] s - is deleted; String[] s1 = {"first string", "second string"}

        strings.forEach(element -> {
            System.out.println(element);
        });

        List<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");


        strings.addAll(letters);
        strings.contains("a");

        strings.forEach(element -> {
            System.out.println(element);
        });
         strings.get(0);
         strings.get(2);

         List<String> stringsLinked = new LinkedList<>();
         stringsLinked.add("aa");
         stringsLinked.get(0);

        stringsLinked.forEach(element -> {
            System.out.println(element);
        });

        List<List<String>> listOfStringOfStrings = new ArrayList<>();

        listOfStringOfStrings.forEach(element -> {
            element.forEach(e -> {
                System.out.println(e);
            });
        });

        //List<String> strings = List.of("1", "1", "1", "2", "3");
        //List<Employee> employees = List.of(new Employee(), new Employee(), new Employee());
    }
}
