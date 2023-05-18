package Assignment.Assignment.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        // Add 10 products based on user input
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Product " + i + ":");
            System.out.print("Code: ");
            String code = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            addProduct(products, new Product(code, name, price));
        }

        // Print all products
        System.out.println("\nAll Products:");
        for (Product product : products) {
            System.out.println(product);
        }

        scanner.close();
    }

    private static void addProduct(HashSet<Product> products, Product product) {
        if (!products.contains(product)) {
            products.add(product);
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product already exists. Skipping duplicate.");
        }
        System.out.println();
    }
}

class Product {
    private String code;
    private String name;
    private double price;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    // Getters and setters (not shown for simplicity)

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return code.equals(other.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
