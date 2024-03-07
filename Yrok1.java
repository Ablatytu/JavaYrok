import java.util.*;

public class Yrok1 {
    public static void main(String[] args) {
        Map<String, Set<String>> phoneBook = new HashMap<>();

        // Добавление данных в телефонную книгу
        addContact(phoneBook, "Иван", "123456789");
        addContact(phoneBook, "Петр", "987654321");
        addContact(phoneBook, "Иван", "456789123");
        addContact(phoneBook, "Мария", "111222333");
        addContact(phoneBook, "Иван", "999888777");

        // Сортировка по убыванию числа телефонов
        List<Map.Entry<String, Set<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());
        sortedContacts.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        // Вывод результатов
        for (Map.Entry<String, Set<String>> entry : sortedContacts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Метод для добавления контакта в телефонную книгу
    public static void addContact(Map<String, Set<String>> phoneBook, String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
    }
}
