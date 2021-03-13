package Collections.Task_6;

import java.util.HashMap;

//Create map to display person name and person details
// "ID": "1","Age": "28", "Name": "Paul Sullivan", "Status": "Available"

public class InformationOfPerson {

    public static void main(String[] args) {

        HashMap<Integer, Integer> person = new HashMap<>();
        HashMap<String, String> person1 = new HashMap<>();

        person.put(1, 28); // ID, Age
        person1.put("Paul Sullivan", "Available"); // Name, Status
        System.out.println();

    }

}
