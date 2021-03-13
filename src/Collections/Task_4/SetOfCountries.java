package Collections.Task_4;

import java.util.HashSet;

    // Create a SET consisting of strings:
    // "France", "USA", "GB", "China", "Poland", "Russia"

    public class SetOfCountries {
        public static void main(String[] args) {
            HashSet<String> countries = new HashSet<>();
            countries.add("France");
            countries.add("USA");
            countries.add("GB");
            countries.add("China");
            countries.add("Poland");
            countries.add("Russia");
            System.out.println(countries);
        }
    }

