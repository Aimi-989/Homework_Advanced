package Collections.Task_5;

// Create a List consisting of strings:
// "France", "USA", "GB", "China", "Poland", "Russia"

import java.util.LinkedList;

public class ListOfCountries {
        public static void main(String[] args) {
            LinkedList<String> countries = new LinkedList<>();
            countries.add("France");
            countries.add("USA");
            countries.add("GB");
            countries.add("China");
            countries.add("Poland");
            countries.add("Russia");
            System.out.println(countries);
        }
    }

