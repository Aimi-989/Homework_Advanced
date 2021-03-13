package Collections.Task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NanoTime {

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

        //complete the code for LinkedList

        LinkedList<String> al2 = new LinkedList<>();
        al2.add("1");
        al2.add("2");
        al2.add("3");
        al2.add("4");
        al2.add("5");
        System.out.println(al2);
        long l2 = System.nanoTime();
        al2.get(2);
        long timePassed2 = System.nanoTime() - l2;
        System.out.println("Access time for LinkedList is: " + timePassed2);

    }
}