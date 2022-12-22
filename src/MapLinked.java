import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinked {
    public static Map<Integer, String> person = new LinkedHashMap<>();


    public static void main(String[] args) {
        person.put(30, "Иванов Иван");
        person.put(10, "Андреев Андрей");
        person.put(20, "Богданов Богдан");
        person.put(40, "Петров Петр");
        person.put(50, "Сергеев Сергей");

        for (Map.Entry<Integer, String> integerStringEntry : person.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " : " + integerStringEntry.getValue());
        }

    }
}

