package phoneBook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {


    private final Map<String, String> contacts = new HashMap<>();


    public void addContact(String name, String numberPhone) {
        contacts.put(name, numberPhone);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + contacts +
                '}';
    }
}
