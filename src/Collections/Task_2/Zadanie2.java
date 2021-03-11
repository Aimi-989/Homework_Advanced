package Collections.Task_2;

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {

    public static void testFire() {
        List<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3"); //2
        al.add("4");
        al.add("5");
        long l = System.nanoTime();
        al.get(2);
        long timePassed = System.nanoTime() - l;
        System.out.println("Access time for ArrayList is: " + timePassed);

        //complete the code for LinkedList.
    }

}
