import phoneBook.PhoneBook;

public class Main {
    public static void main(String[] args) {
        //ДЗ 1. Задание 1.
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Юлия Николаевна", "+7-918-505-22-14");
        phoneBook.addContact("Сынок", "+7-918-523-22-11");
        phoneBook.addContact("Олег", "+7-918-505-72-22");
        phoneBook.addContact("Юлия Владимировна", "+7-918-505-22-33");
        phoneBook.addContact("Брат", "+7-918-777-88-99");
        phoneBook.addContact("Папа", "8911-623-12-55");
        phoneBook.addContact("Работа", "+7-666-666-66-66");
        phoneBook.addContact("Наталья молоко", "233-11-11");
        phoneBook.addContact("Ия маникюр", "89885552323");
        phoneBook.addContact("Цветы", "+7-888-505-22-00");
        phoneBook.addContact("Аниматор Вова", "+7-918-505-01-01");
        phoneBook.addContact("112", "112");
        phoneBook.addContact("Клининг", "+7-918-1111111");
        phoneBook.addContact("Ксюша", "+7-918-222-22-22");
        phoneBook.addContact("ПЕТРОВ Петр Петрович", "87777777777");
        phoneBook.addContact("Сидоров О.О.", "+7-9999999999");
        phoneBook.addContact("Вскрытие замков", "+7-0000000000");
        phoneBook.addContact("Ашот мясо", "89115454545");
        phoneBook.addContact("Максим Чебуреков", "+7-9696996");
        phoneBook.addContact("Алла котята", "81231232323");
        phoneBook.addContact("Инна туроператор", "89899898989");
        System.out.println(phoneBook);
        System.out.println();
    }


}