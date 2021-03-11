package Generics.Task_3;


import java.util.ArrayList;
import java.util.List;

public class Zadanie {

    public static void main(String[] args) {
        List<Person> persons = fetchPersons();
        persons.stream().sorted().forEach(person -> {
            System.out.println(person.getMaxHeight()); // 170 172 173 190
        });
    }


    private static List<Person> fetchPersons() {
        Person p2 = new Person(173);
        Person p0 = new Person(170);
        Person p3 = new Person(190);
        Person p1 = new Person(172);


        List<Person> ls = new ArrayList<>();
        ls.add(p0);
        ls.add(p1);
        ls.add(p2);
        ls.add(p3);
        return ls;
    }


}



