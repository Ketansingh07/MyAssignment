package Assignment.Assignment.Lambda;
import java.util.ArrayList;
import java.util.List;

public class LQ2 {
    private int totalPrice;
    private String status;

    public LQ2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public static List<LQ2> listOfOrders(List<LQ2> orders) {
        return orders.stream()
                .filter(order -> order.totalPrice > 10000 && (order.status.equals("ACCEPTED") || order.status.equals("COMPLETED")))
                .toList();
    }

    public static void main(String[] args) {
        // Creating sample orders
        List<LQ2> orders = new ArrayList<>();
        orders.add(new LQ2(15000, "ACCEPTED"));
        orders.add(new LQ2(8000, "COMPLETED"));
        orders.add(new LQ2(12000, "PENDING"));
        orders.add(new LQ2(20000, "COMPLETED"));

        // Filtering and printing orders
        List<LQ2> filteredOrders = listOfOrders(orders);
        for (LQ2 order : filteredOrders) {
            System.out.println("Order Price: " + order.totalPrice + ", Order Status: " + order.status);
        }
    }
}
