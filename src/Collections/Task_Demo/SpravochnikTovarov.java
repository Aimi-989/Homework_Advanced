package Collections.Task_Demo;

import java.util.HashMap;
import java.util.Map;

public class SpravochnikTovarov extends MapDemo {
    public static String pokazat(String chto) {
        Map<String, String> map = new HashMap<>();
        map.put("adres_pervogo_elementa", "Element s adresom"); //map.get(0)
        map.put("adres_vtorogo_elementa", "Element s adresom No 2");
        map.put("steklo", "Stroka, soderzhawaya mnogo opisanij steklyannoj utvari");
        return map.get(chto);
    }
}
