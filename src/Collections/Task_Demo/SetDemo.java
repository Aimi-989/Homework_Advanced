package Collections.Task_Demo;

import java.util.Set;

public class SetDemo extends ListDemo {
    //no difference with List
    //THE ONLY DIFFERENCE - ALL ELEMENTS ARE UNIQUE.

    public static void testFire() {
       // List.of()
        //Set<String> strings = Set.of("1", "2", "3");
        strings.add("1");

        strings.forEach(string -> {
            System.out.println(string);
        });
    }

}
