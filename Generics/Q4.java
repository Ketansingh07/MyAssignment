package Assignment.Assignment.Generics;
import java.util.Date;
import java.util.Scanner;

public class Q4<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        if (key instanceof String) {
            this.key = key;
        } else {
            throw new IllegalArgumentException("Key must be of type String");
        }

    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        if ((key instanceof String && value instanceof String)  || (key instanceof String && value instanceof Date)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public static void main(String[] args) {
        Q4<String, String> pairA = new Q4<>();
        pairA.setKey("1");
        pairA.setValue("Hello");

        Q4<String, Date> pairB = new Q4<>();
        pairB.setKey("Today is");
        pairB.setValue(new Date());

        Scanner scanner = new Scanner(System.in);

        Q4<String, String> userInputPair = new Q4<>();
        System.out.print("Enter key: ");
        String userKey = scanner.nextLine();
        System.out.print("Enter value: ");
        String userValue = scanner.nextLine();
        userInputPair.setKey(userKey);
        userInputPair.setValue(userValue);

        System.out.println("Key: " + userInputPair.getKey());
        System.out.println("Value: " + userInputPair.getValue());

        scanner.close();
    }
}
