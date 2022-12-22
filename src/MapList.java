import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {

    public static Map<String, List<Integer>> listMap = new HashMap<>();

    private final String name;
    private final Integer value;

    public MapList(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public static Map<String, List<Integer>> getListMap() {
        return listMap;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    public static Integer sumElements(List<Integer> list) {
        Integer sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        listMap.put("string1", List.of(1, 11, 111));
        listMap.put("string2", List.of(2, 22, 222));
        listMap.put("string3", List.of(3, 33, 333));
        listMap.put("string4", List.of(4, 44, 444));
        listMap.put("string5", List.of(5, 55, 555));

        Map<String, Integer> listMap1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringListEntry : listMap.entrySet()) {
            listMap1.put(stringListEntry.getKey(), sumElements(stringListEntry.getValue()));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : listMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " - " + stringIntegerEntry.getValue());
        }
    }
}