package Assignment.Assignment.Generics;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static <T> void exchangePositions(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] integers = {78,54,689,15};

        System.out.println("Integer Array: " + Arrays.toString(integers));
        System.out.print("Enter index 1: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter index 2: ");
        int index2 = scanner.nextInt();

        exchangePositions(integers, index1, index2);
        System.out.println("After exchange: " + Arrays.toString(integers));
        String[] strings = {"apple", "banana", "cherry", "date"};

        System.out.println("String Array: " + Arrays.toString(strings));
        System.out.print("Enter index 1: ");
        index1 = scanner.nextInt();
        System.out.print("Enter index 2: ");
        index2 = scanner.nextInt();

        exchangePositions(strings, index1, index2);
        System.out.println("After exchange: " + Arrays.toString(strings));

        scanner.close();
    }
}
