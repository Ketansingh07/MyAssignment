package Assignment.Assignment.Exception;
public class Q3saving {
    private long id;
    private double balance;

    public Q3saving(long id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public double withdraw(double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
            }

            if (balance <= 0 || amount > balance) {
                throw new RuntimeException("Insufficient balance for withdrawal.");
            }

            balance -= amount;
            return amount;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return 0.0; // Return 0 if an exception occurs
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}
