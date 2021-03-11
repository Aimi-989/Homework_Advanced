package Collections.Task_Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void testFire() {
    }

    public static String dajMne(String chto) {
        Map<String, String> map = new HashMap<>(); //LinkedHashMap
        map.put("adres_pervogo_elementa", "Element s adresom"); //map.get(0)
        map.put("adres_vtorogo_elementa", "Element s adresom No 2");

        Set<String> addresses = map.keySet();
        addresses.forEach(address -> {
            map.get(address);
        });

        map.forEach((k, v) -> System.out.println((k + ":" + v))); //preferrable way


        return map.get(chto);
    }

    public static String selectElement(String address) {
        String out = "";
        switch (address) {
            case "adres_pervogo_elementa":
                out = "Element s adresom";
                break;
            case "adres_vtorogo_elementa":
                out = "Element s adresom No 2";
                break;
        }
        return out;
    }


}
