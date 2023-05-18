package Generics;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Map<Integer, Double> dataMap = new HashMap<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int key = random.nextInt(100);
            double value = random.nextDouble() * 100;
            dataMap.put(key, value);
        }

        System.out.println("Data stored in the HashMap:");
        for (Map.Entry<Integer, Double> entry : dataMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
