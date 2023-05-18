package Collections;import java.util.Map;
import java.util.TreeMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_class{
    public static void main(String[] args) {
        // Create a TreeMap with phone numbers (Long) as keys and contacts (Contact) as values
        TreeMap<Long, Contact> phoneBook = new TreeMap<>();

        // Add contacts to the phoneBook
        phoneBook.put(1234567890L, new Contact(1234567890L, "ketan singh", "ketan@example.com", Gender.MALE));
        phoneBook.put(9876543210L, new Contact(9876543210L, "shubhami sharma", "shubhami@example.com", Gender.FEMALE));
        phoneBook.put(5555555555L, new Contact(5555555555L, "Harsh bhojani", "Harsh@example.com", Gender.MALE));

        // a. Fetch all the keys and print them
        System.out.println("Keys:");
        for (Long phoneNumber : phoneBook.keySet()) {
            System.out.println(phoneNumber);
        }

        // b. Fetch all the values and print them
        System.out.println("\nValues:");
        for (Contact contact : phoneBook.values()) {
            System.out.println(contact);
        }

        // c. Print all key-value pairs
        System.out.println("\nKey-Value Pairs:");
        for (Map.Entry<Long, Contact> entry : phoneBook.entrySet()) {
            Long phoneNumber = entry.getKey();
            Contact contact = entry.getValue();
            System.out.println(phoneNumber + " - " + contact);
        }
    }
}

class Contact {
    private long phoneNumber;
    private String name;
    private String email;
    private Gender gender;

    public Contact(long phoneNumber, String name, String email, Gender gender) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and setters (not shown for simplicity)

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email + ", Gender: " + gender;
    }
}

enum Gender {
    MALE,
    FEMALE
}
