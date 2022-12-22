import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class NewMap {
    public static Map<String, Integer> person = new HashMap<>();

    String name;
    Integer age;

    public NewMap(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void add(String name, Integer age) {
        if (Objects.equals(person.put(name, age), age)) {
            throw new UnsupportedOperationException("Уже есть в списке");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, Integer> getPerson() {
        return person;
    }

    public static void main(String[] args) {
        person.put("Иванов Иван", 30);
        person.put("Андреев Андрей", 10);
        person.put("Богданов Богдан", 20);
        person.put("Петров Петр", 40);
        person.put("Сергеев Сергей", 50);

        add("Елисеев Елисей", 11);
        add("Иванов Иван", 60);

        System.out.println(person);
    }
}